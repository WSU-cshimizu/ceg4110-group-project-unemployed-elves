document.addEventListener("DOMContentLoaded", () => {
    flatpickr("#datetime", {
        enableTime: true,
        dateFormat: "Y-m-d H:i", // Date and time format
        onChange: function(selectedDates, dateStr, instance) {
            const hourInput = instance.calendarContainer.querySelector('.flatpickr-hour');
            const minuteInput = instance.calendarContainer.querySelector('.flatpickr-minute'); 
        }
    });
    errorHandling();
    
});

function errorHandling() {
    const form = document.getElementById('issueForm');
    const errorMessage = document.getElementById('errorMessage');
    
    form.addEventListener('submit', function(event) {
        event.preventDefault();

        const formGroups = document.querySelectorAll(".form-group");
        let noIssue = true;
        for (let i = 0; i < formGroups.length; ++i) {
            let hasErrorStyling = $(formGroups[i]).hasClass("errorStyling");
            let inputArray = formGroups[i].querySelectorAll("input, select, textarea");

            let inputType = inputArray[0].type;
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

            if (!hasErrorStyling && !isValid) {
                $(formGroups[i]).addClass("errorStyling");
                
                let selectionStr = '';
                let errorStr = '';
                if (inputType === "text") {
                    selectionStr = 'input';
                    if (inputArray[0].id === 'vin') {
                        errorStr += "Enter the VIN";
                    } else if (inputArray[0].id === 'licensePlate') {
                        errorStr += "Enter a valid license plate";
                    }
                    
                } else if (inputType === 'select-one') {
                    selectionStr = 'select';
                    errorStr += 'Select the state where the issue occured';
                } else if (inputType === 'checkbox') {
                    selectionStr = 'div';
                    errorStr += 'Select at least one';
                } else if (inputType === "textarea") {
                    selectionStr = 'textarea';
                    errorStr += 'Enter a description of the issue including any relevant details';
                }
                

                if (inputType === 'checkbox' || inputType === 'textarea') {
                    const h3Select = formGroups[i].querySelector('h3');
                    h3Select.style.marginBottom = '5px';
                }

                const referenceElement = formGroups[i].querySelector(selectionStr);
                let errorTextElement = document.createElement("SPAN");
                let htmlStr = '<span class="errorMessageStyling">';
                htmlStr += '<i class="fas fa-exclamation-circle"></i>'
                htmlStr += `  ${errorStr}</span>`;
                errorTextElement.innerHTML += htmlStr;
                referenceElement.insertAdjacentElement('beforebegin', errorTextElement);

                if (selectionStr !== '') {
                    const inputField = formGroups[i].querySelector(selectionStr);
                    inputField.style.borderColor = 'red';
                    inputField.addEventListener("focus", () => {
                        inputField.style.borderColor = '#ff9900';
                    });
                    inputField.addEventListener("blur", () => {
                        inputField.style.borderColor = 'red';
                    });
                }
            }

            if (hasErrorStyling && isValid) {
                formGroups[i].classList.remove("errorStyling");
                
                const spanField = formGroups[i].querySelector('span');
                spanField.remove();

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

                if (inputType === 'checkbox' || inputType === 'textarea') {
                    const h3Select = formGroups[i].querySelector('h3');
                    h3Select.style.marginBottom = '20px';
                }

                const selectionElement = formGroups[i].querySelector(selectionStr);
                selectionElement.style.borderColor = 'white';

                selectionElement.addEventListener("blur", () => {
                    selectionElement.style.borderColor = 'white';
                });
                
            }
        }
    });
}
 