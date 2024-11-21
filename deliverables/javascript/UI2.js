document.addEventListener("DOMContentLoaded", () => {
    flatpickr("#datetime", {
        enableTime: true,
        dateFormat: "Y-m-d H:i", // Date and time format
        onChange: function(selectedDates, dateStr, instance) {
            const hourInput = instance.calendarContainer.querySelector('.flatpickr-hour');
            const minuteInput = instance.calendarContainer.querySelector('.flatpickr-minute'); 
        }
    });

    addErrorHandlingEventListener();
});

function addErrorHandlingEventListener() {
    const form = document.getElementById('issueForm');
    
    form.addEventListener('submit', function(event) {
        event.preventDefault();

        const formGroups = document.querySelectorAll(".form-group");
        for (let i = 0; i < formGroups.length; ++i) {
            let hasErrorStyling = formGroups[i].classList.contains("errorStyling");
            let inputArray = formGroups[i].querySelectorAll("input, select, textarea");

            let inputType = inputArray[0].type;
            let isValid = determineIfValid(inputArray, inputType);
            
            let selectionStr = getSelectionString(inputType);
            if (!hasErrorStyling && !isValid) {
                formGroups[i].classList.add("errorStyling");
                appendErrorElements(inputType, inputArray, formGroups[i], selectionStr);
                updateErrorBorderColoring(selectionStr, formGroups[i]);
            }

            if (hasErrorStyling && isValid) {
                removeErrorElements(formGroups[i], selectionStr);
            }
        }
    });
}

function updateErrorBorderColoring(selectionStr, formGroup) {
    if (selectionStr !== '') {
        const inputField = formGroup.querySelector(selectionStr);
        inputField.style.borderColor = 'red';
        inputField.addEventListener("focus", () => {
            inputField.style.borderColor = '#ff9900';
        });
        inputField.addEventListener("blur", () => {
            inputField.style.borderColor = 'red';
        });
    }
}

function appendErrorElements(inputType, inputArray, formGroup, selStr) {
    let errorStr = getErrorString(inputType, inputArray);
    let selectionStr = getSelectionString(inputType);
    
    // create error text element
    let errorTextElement = document.createElement("SPAN");
    errorTextElement.classList.add("errorMessageStyling");
    errorTextElement.id = "errorSpan";

    let htmlStr = `<i class="fas fa-exclamation-circle"></i> ${errorStr}`;
    errorTextElement.innerHTML = htmlStr;

    if (inputType === 'checkbox') {
        errorTextElement.style.marginBottom = '0px';
    }

    // insert error text element
    const referenceElement = formGroup.querySelector(selStr);
    referenceElement.insertAdjacentElement('beforebegin', errorTextElement);
}

function removeErrorElements(formGroup, selStr) {
    formGroup.classList.remove("errorStyling");
                
    const spanField = formGroup.querySelector('#errorSpan');
    spanField.remove();


    const selectionElement = formGroup.querySelector(selStr);
    selectionElement.style.borderColor = 'white';

    selectionElement.addEventListener("blur", () => {
        selectionElement.style.borderColor = 'white';
    });
}

function getErrorString(inputType, inputArray) {
    let errorStr = '';
    if (inputType === "text") {
        if (inputArray[0].id === 'vin') {
            errorStr += "Enter the VIN";
        } else if (inputArray[0].id === 'licensePlate') {
            errorStr += "Enter a valid license plate";
        }
    } else if (inputType === 'select-one') {
        errorStr += 'Select the state where the issue occured';
    } else if (inputType === 'checkbox') {
        errorStr += 'Select at least one';
    } else if (inputType === "textarea") {
        errorStr += 'Enter a description of the issue including any relevant details';
    }
    return errorStr;
}

function getSelectionString(inputType) {
    let selectionStr = '';
    if (inputType === 'text') {
        selectionStr = 'input';
    } else if (inputType === 'select-one') {
        selectionStr = 'select';
    } else if (inputType === 'checkbox') {
        selectionStr = 'div';
    } else if (inputType === 'textarea') {
        selectionStr = 'textarea';
    }
    return selectionStr;
}

function determineIfValid(inputArray, inputType) {
    let isValid = inputType !== "checkbox";
    for (let j = 0; j < inputArray.length; ++j) {
                
        let inputElement = inputArray[j];
        if (inputElement.type === "text") {
            if (inputElement.id === "vin") {
                let regex = /[A-Za-z0-9]{17}/
                isValid = regex.test(inputElement.value);
            }
            else if (inputElement.id === "licensePlate") {
                let regex = /[A-Za-z0-9]{1,7}/
                isValid = regex.test(inputElement.value);
            }
        }

        else if (inputElement.type === "select-one") {
            isValid = inputElement.selectedIndex !== 0;
        }

        else if (inputElement.type === "checkbox") {
            isValid = isValid || inputElement.checked;
        }
        else if (inputElement.type === "textarea") {
            isValid = inputElement.value.length <= 400;
            isValid = isValid && inputElement.value.length > 0;
        }
    }
    return isValid;
}