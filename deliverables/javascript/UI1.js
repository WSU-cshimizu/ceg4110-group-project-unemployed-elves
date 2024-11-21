document.addEventListener("DOMContentLoaded", () => {
    addErrorHandlingEventListener();
});

function addErrorHandlingEventListener() {
    const form = document.getElementById('authForm');

    form.addEventListener('submit', function(event) {
        event.preventDefault();
        let inputType = "input"
        const formGroups = form.querySelectorAll(".form-group");
        for (let i = 0; i < formGroups.length; ++i) {
            let hasErrorStyling = formGroups[i].classList.contains("errorStyling");

            let inputElement = formGroups[i].querySelector("input");
            let isValid = determineIfValid(inputElement);
            

            if (!hasErrorStyling && !isValid) {
                formGroups[i].classList.add("errorStyling");

                appendErrorElements(inputType, formGroups[i]);
                updateErrorBorderColoring(inputType, formGroups[i]);
            }

            if (hasErrorStyling && isValid) {
                removeErrorElements(inputType, formGroups[i]);
            }
        }
    });
}

function updateErrorBorderColoring(inputType, formGroup) {

    const inputField = formGroup.querySelector(inputType);
    inputField.style.borderColor = 'red';
    inputField.addEventListener("focus", () => {
        inputField.style.borderColor = '#ff9900';
    });
    inputField.addEventListener("blur", () => {
        inputField.style.borderColor = 'red';
    });
    
}

function appendErrorElements(inputType, formGroup) {
    const referenceElement = formGroup.querySelector(inputType);
    let errorStr = getErrorString(referenceElement);

    // create error text element
    let errorTextElement = document.createElement("SPAN");
    errorTextElement.classList.add("errorMessageStyling");
    errorTextElement.id = "errorSpan";

    let htmlStr = `<i class="fas fa-exclamation-circle"></i> ${errorStr}`;
    errorTextElement.innerHTML = htmlStr;

    // insert error text element
    referenceElement.insertAdjacentElement('beforebegin', errorTextElement);
}




function removeErrorElements(inputType, formGroup) {

    // const referenceElement = formGroup.querySelector(inputType);
    formGroup.classList.remove("errorStyling");
                
    const spanField = formGroup.querySelector('#errorSpan');
    spanField.remove();


    const selectionElement = formGroup.querySelector(inputType);
    selectionElement.style.borderColor = 'white';

    selectionElement.addEventListener("blur", () => {
        selectionElement.style.borderColor = 'white';
    });
}

function getErrorString(referenceElement) {
    let errorStr = '';

    if (referenceElement.id === "name" || referenceElement.id === "surname") {
        errorStr = 'Enter between 2 and 30 alphabetical characters';
    } else if (referenceElement.id === "driverID") {
        errorStr = 'Enter 6 numerical digits: 123456';
    } else if (referenceElement.id === "phone") {
        errorStr = 'Enter 10 numerical digits: (123) 456 - 7890';
    }

    return errorStr;
}


function determineIfValid(inputElement) {
    let isValid = false;
    let regex;

    if (inputElement.id === "name" || inputElement.id === "surname") {
        regex = /[A-Za-z]{1,35}/;
        isValid = regex.test(inputElement.value);
    } else if (inputElement.id === "driverID") {
        regex = /\d{6}/;
        isValid = regex.test(inputElement.value)
    } else if (inputElement.id === "phone") {
        regex = /\d{10}/;

        isValid = regex.test(inputElement.value);
    }

    return isValid;
}
