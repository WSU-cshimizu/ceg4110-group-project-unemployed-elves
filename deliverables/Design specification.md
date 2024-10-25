# Design Specification

## R.0.   General requirements for both pages:
### Description
* Both UI pages need to facilitate concurrent access, be responsive, and ensure compatibility across the most popular web browsers (Chrome, Firefox, etc)
  * Concurrent access: Users can authenticate into the system and submit form data at the same time without data loss or crashes.
  * Responsiveness: The ui pages can appropriately resize components depending on the resolution of the accessing device while maintaining the same functionality.
  * Web browser compatibility: The web application can interface with the major web browsers without creating broken layouts or impairing functionality.
---
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
* <INSERT DATA FLOW DIAGRAM>
 
### UI Mockup
* The UI needs to have four text input components and a submission button.
* The design must be clean and organized.
* It's recommended to use Amazon-based color schemes to match the theme of the application.
* ![UI_1_Wireframe](https://github.com/user-attachments/assets/a2a99a94-267e-41e7-8d73-b72ce78e07ad)
---
## R.2. Second Page: Van Issue Documenting Form
### Description
* The second UI page is a data form where the user identifies the van used and any potential issues that need addressing. These forms are stored onto a database to keep a record needed to ensure safety and accountability for both the employees and managers.

### General Process
* The user inputs all relevant information into the form
* Once the user feels satisfied with their work, the button is pressed to submit the data
* The backend scans the data and ensures everything entered has the correct formatting
* If the data is not formatted correctly, an error message is displayed to the user
* If the data is formatted correctly, then the backend processes the information, creating queries to store the data
* The backend sends the queries to the DBMS
* The DBMS processes the received queries
* The DBMS sends a response indicating if the queries were successful
* The DBMS response is then displayed to the user
* ![UI_Page1_Data_Flow](https://github.com/user-attachments/assets/542b8b89-ceaa-49d5-b745-c60b8e793bda)

 ## Data-flow diagrams
## R.1. First Page: User Authentication
![image](https://github.com/user-attachments/assets/2d5400e7-77ea-49fe-841b-886e61a51871)
## R.2. Second Page: Van Issue Documenting Form
![image](https://github.com/user-attachments/assets/33409588-ec55-47ec-9e7d-451c3765f40d)


