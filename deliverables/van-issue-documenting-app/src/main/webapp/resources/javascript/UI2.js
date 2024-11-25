document.addEventListener("DOMContentLoaded", () => {
    const dateSelect = flatpickr("#datetime", {
        enableTime: true,
        dateFormat: "Y-m-d H:i", // Date and time format
    });
    setDefaultDateTime();
    addErrorHandlingEventListener(dateSelect);
});

function setDefaultDateTime() {
    const dateTimeInput = document.getElementById('datetime');
    const now = new Date();

    const year = now.getFullYear();
    const month = String(now.getMonth() + 1).padStart(2, '0');
    const day = String(now.getDate()).padStart(2, '0');
    const hours = String(now.getHours()).padStart(2, '0');
    const minutes = String(now.getMinutes()).padStart(2, '0');

    const defaultDateTime = `${year}-${month}-${day} ${hours}:${minutes}`;
    dateTimeInput.placeholder = defaultDateTime;
}

function addErrorHandlingEventListener(dateSelect) {
    const form = document.getElementById('issueForm');
    
    form.addEventListener('submit', function(event) {
        event.preventDefault();

        let invalidForm = false;
        const formGroups = document.querySelectorAll(".form-group");
        for (let i = 0; i < formGroups.length; ++i) {
            let hasErrorStyling = formGroups[i].classList.contains("errorStyling");
            let inputArray = formGroups[i].querySelectorAll("input, select, textarea");

            let inputType = inputArray[0].type;
            let isValid = determineIfValid(inputArray, inputType, dateSelect);
            invalidForm = invalidForm || !isValid;
            
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

         if (invalidForm) {
                window.scrollTo ({
                    top: 0,
                    behavior: "smooth"
                });
            } else {
                form.submit();  // Submit form if no errors
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
        } else if (inputArray[0].id === 'datetime') {
            errorStr += "Select the date and time of recording";
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

function determineIfValid(inputArray, inputType, dateSelect) {
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
            else if (inputElement.id === "datetime") {
                isValid = dateSelect.selectedDates.length > 0;
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