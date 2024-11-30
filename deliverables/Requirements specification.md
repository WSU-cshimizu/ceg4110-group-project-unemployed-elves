# Requirements Specification

## R.0.   General requirements for both pages:   
R.0.1. **Responsiveness:** Pages shall be responsive and display correctly on all devices (smartphones, tablets, desktops).  
R.0.2. **Browser Compatibility:**  Forms shall work across all major browsers (Chrome, Firefox, Safari, and Edge).  

## R.1. First Page: User Authentication  

### Functionality
R.1.1. **Main Object:** An HTML form shall have the following sections:  
        1.1.1. First Name + text input   
        1.1.2. Last Name   + text input  
        1.1.3. Driver ID + text input  
        1.1.4. Phone Number + text input  
        1.1.5. "Verify" button  

R.1.2. **User-Friendly Feature:**  
    1.2.1. Each input field shall include an example (placeholder) in a slightly transparent manner to guide the user on how to enter the information correctly.  

R.1.3. **User Requirements:**  Users shall enter the following to progress from the first page:   
      First Name    
      Last Name  
      Driver ID  
      Phone Number  

R.1.4. **Validation:**     
   1.4.1. The provided information shall be verified against the pre-loaded database of user details.  
   1.4.2. If the data matches, the user shall proceed to the next page.  
   1.4.3. If there is an error, a pop-up shall indicate which field is incorrect.  


---


### Constraints

R.1.5. **User Registration:**    
    1.5.1. Users (drivers) shall not register manually; all information will be pre-loaded into the database.  

R.1.6. **Field Validations:**  
      1.6.1 First Name and Last Name fields:   
      1.6.1.1 Shall only accept alphabetic characters.  
      1.6.1.2. Shall not exceed 50 characters.  
      1.6.2. Driver ID field:        
      1.6.2.1 Shall only accept numeric characters and one symbol at the start.  
      1.6.2.2 Shall follow a specific format: one symbol 6 digits.  
      1.6.3. Phone Number field:       
      1.6.3.1 Shall follow a specific format (XXXXXXXXXX).  
      1.6.3.2. Shall only accept numeric input.  

R.1.7. **Submission Rules:**  
    1.7.1. The form shall not be submitted unless all required fields are filled and valid.  

R.1.8. **Pop-Up Message:**  
    1.8.1. Error messages shall disappear after a maximum of 10 seconds.  

---

## R.2. Second Page: Van Issue Documenting Form

### Functionality

R. 2.1. **Main Object:** An HTML form shall contain the following sections:  
      2.1.1. Date and Time of Issue + numeric input  
      2.1.2. VIN + text input  
      2.1.3. License plate + text input  
      2.1.4. License state + text input  
      2.1.5. Issue Region Checklist + check-list with the most common issue types  
      2.1.6. Issue Description + text input 
      2.1.7. "Submit"  button  

R.2.2 **User-Friendly Features:**  
   2.2.1. Each field will include an example (placeholder) to guide users.  
   2.2.2. Convenient graphic interface to choose time.
### Constraints

R.2.3. **Field Validations:**  

2.3.1. Date and Time of Issue:  
      2.3.1.1. Shall follow the format MM/DD/YYYY for the date and HH/MM PM/AM for the time.    
      2.3.1.1. Shall not be empty.  
2.3.2. Issue Type:  
     2.3.2.1. Shall select one or more option from the check-list.  
     2.3.2.2. Shall not be empty.  
2.3.3. Issue Description:  
     2.3.3.1. Shall not exceed 400 characters.  
     2.3.3.2. Shall not be empty.  
2.3.4. VIN + text input  
     2.3.4.1. Shall be exactly 17 characters long. 
     2.3.4.2. Shall only contain alphanumeric characters (A-Z, 0-9) with no special characters or spaces.  
     2.3.4.3. Shall not be empty.  
2.3.5. License plate + text input  
     2.3.5.1. Shall not contain special characters, only letters and numbers.  
     2.3.5.2. Shall not be more than 1-7 character long.  
     2.3.5.3. Shall not be empty.  
2.3.6. License State + dropdown  
     2.3.6.1. Shall select a state from the dropdown menu.  
     
R.2.4. **Submission Rules: (Submit button)**  
   2.4.1. The form shall not be submitted unless all required fields are valid.  
   2.4.2. After clicking on the submit button user shall see success page wit all information that user just wrote.

## R.3 Testing Requirements for User Login (First Page)

R.3.1: When valid credentials are entered, the user shall be redirected to the next (van issue documenting) page.  
R.3.2: An error message shall be displayed indicating that the credentials do not match the pre-loaded database when incorrect credentials are entered (e.g., incorrect driver ID or other invalid fields).  
R.3.3: The form shall display an appropriate title (error message) when an invalid first name (e.g., containing numbers) is entered, even if everything else is good.  
R.3.4: The form shall display an appropriate title (error message) when an invalid surname (e.g., containing numbers) is entered, even if everything else is good.  
R.3.5: The form shall display an appropriate title (error message) when an invalid driver ID (e.g., not exactly 1 symbol followed by 6 digits) is entered, even if everything else is good.  
R.3.6: The form shall display an appropriate error message when an invalid phone number (e.g., less than 10 digits) is entered.  
R.3.7: Ensure that the user validation is case-insensitive for first name, last name, and driver ID.  
