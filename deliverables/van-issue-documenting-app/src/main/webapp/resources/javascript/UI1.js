document.addEventListener("DOMContentLoaded", () => {
    addErrorHandlingEventListener();
});

function addErrorHandlingEventListener() {
    const form = document.getElementById('authForm');

    form.addEventListener('submit', function(event) {
        event.preventDefault();
        let isFormValid = true;
        const formGroups = form.querySelectorAll(".form-group");

        for (let i = 0; i < formGroups.length; ++i) {
            let hasErrorStyling = formGroups[i].classList.contains("errorStyling");

            let inputElement = formGroups[i].querySelector("input");
            let isValid = determineIfValid(inputElement);

            if (!hasErrorStyling && !isValid) {
                formGroups[i].classList.add("errorStyling");
                appendErrorElements(inputElement, formGroups[i]);
                updateErrorBorderColoring(inputElement, formGroups[i]);
                isFormValid = false; // form is not valid
            }

            if (hasErrorStyling && isValid) {
                removeErrorElements(inputElement, formGroups[i]);
            }
        }

        // If form is valid, submit the form manually
        if (isFormValid) {
            form.submit();
        }
    });
}

function updateErrorBorderColoring(inputElement, formGroup) {
    inputElement.style.borderColor = 'red';
    inputElement.addEventListener("focus", () => {
        inputElement.style.borderColor = '#ff9900';
    });
    inputElement.addEventListener("blur", () => {
        inputElement.style.borderColor = 'red';
    });
}

function appendErrorElements(inputElement, formGroup) {
    const errorStr = getErrorString(inputElement);
    let errorTextElement = document.createElement("SPAN");
    errorTextElement.classList.add("errorMessageStyling");
    errorTextElement.id = "errorSpan";
    errorTextElement.innerHTML = `<i class="fas fa-exclamation-circle"></i> ${errorStr}`;
    inputElement.insertAdjacentElement('beforebegin', errorTextElement);
}

function removeErrorElements(inputElement, formGroup) {
    formGroup.classList.remove("errorStyling");
    const spanField = formGroup.querySelector('#errorSpan');
    if (spanField) spanField.remove();
    inputElement.style.borderColor = 'white';
}

function getErrorString(inputElement) {
    let errorStr = '';
    if (inputElement.id === "name" || inputElement.id === "surname") {
        errorStr = 'Enter between 2 and 30 alphabetical characters';
    } else if (inputElement.id === "driverID") {
        errorStr = 'Enter a symbol and 6 numerical digits: A123456';
    } else if (inputElement.id === "phone") {
        errorStr = 'Enter 10 numerical digits: 12345678';
    }
    return errorStr;
}

function determineIfValid(inputElement) {
    let isValid = false;
    let regex;
    if (inputElement.id === "name" || inputElement.id === "surname") {
        regex = /^[A-Za-z]{2,30}$/;
        isValid = regex.test(inputElement.value);
    } else if (inputElement.id === "driverID") {
        regex = /^[A-Za-z]{1}[0-9]{6}$/;
        isValid = regex.test(inputElement.value);
    } else if (inputElement.id === "phone") {
        regex = /^[0-9]{10}$/;
        isValid = regex.test(inputElement.value);
    }
    return isValid;
}
