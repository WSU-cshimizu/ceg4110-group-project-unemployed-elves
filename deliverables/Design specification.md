# Design Specification

## R.0.   General requirements for both pages:

## R.1. First Page: User Authentication
### Description
* The first UI page is a user interface that facilitates authentication attempts by providing text prompts for the user to enter in their account information.

### General Process
* The user is prompted to enter their account information to login.
* After inputting their data, the submit button is selected, prompting an authentication attempt.
* The backend processes the inputted text, converting it into a DBMS compatible query.
* The query is then sent to the database.
* The database responds after processing the received query.
* The response is analyzed to see if a match was found based on the user enterred information.
* If the authentication attempt is successful, the user gains access to the second page.
* If the authentication attempt fails, the first UI page is updated with an error message
  * The error message notifies the user the entered information did not match the database search.
 
### UI Mockup
* The UI needs to have four text input components and a submission button.
* The design must be clean and organized.
* It's recommended to use Amazon-based color schemes to match the theme of the application.
* ![UI_1_Wireframe](https://github.com/user-attachments/assets/de808dc9-c56d-4acd-8424-65423ddd1b95)
---
## R.2. Second Page: Van Issue Documenting Form
