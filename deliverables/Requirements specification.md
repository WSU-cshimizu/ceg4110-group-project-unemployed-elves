# Requirements Specification

## R.0.   General requirements for both pages:   
R.0.1. **Concurrent Access:**  Forms shall function properly when two or more users are logging in/filling out the form simultaneously.  
R.0.2. **Responsiveness:** Pages shall be responsive and display correctly on all devices (smartphones, tablets, desktops).  
R.0.3. **Browser Compatibility:**  Forms shall work across all major browsers (Chrome, Firefox, Safari, and Edge).  

## R.1. First Page: User Authentication  

### Functionality
R.1.1. **Main Object:** An HTML form shall have the following sections:  
        1.1.1. First Name + text input   
        1.1.2. Last Name   + text input  
        1.1.3. Driver ID + text input  
        1.1.4. Phone Number + text input  
        1.1.5. Submit button  

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
      1.6.1.1 Must only accept alphabetic characters.  
      1.6.1.2. Must not exceed 50 characters.  
      1.6.2. Driver ID field:        
      1.6.2.1 Must only accept numeric characters.  
      1.6.2.2 Must follow a specific format: one symbol 6 digits.  
      1.6.3. Phone Number field:       
      1.6.3.1 Must follow a specific format ((XXX) XXX-XXXX).  
      1.6.3.2. Must only accept numeric input.  

R.1.7. **Submission Rules:**  
    1.7.1. The form shall not be submitted unless all required fields are filled and valid.  

R.1.8. **Pop-Up Message:**  
    1.8.1. Error messages shall disappear after a maximum of 10 seconds.  

---

## R.2. Second Page: Van Issue Documenting Form

### Functionality

R. 2.1. **Main Object:** An HTML form shall contain the following sections:  
      2.1.1. Date and Time of Issue + numeric input  
      2.1.3. Issue Type + check-list with the most common issue types  
      2.1.4. Issue Description + text input  
      2.1.5. VIN + text input  
      2.1.6. License plate + text input  
      2.1.7. License state + text input  
      2.1.6. Submit button  

2.2 **User-Friendly Features:**  
   2.2.1. Each field will include an example (placeholder) to guide users.  
   2.2.2. Hovering over fields will display additional information.  
   2.2.3. The Date and Time field will be pre-filled with the current date and time but can be modified by the user.  

### Constraints

2.3. **Field Validations:**  

2.3.1. Date and Time of Issue:  
      2.3.1.1. Shall follow the format MM/DD/YYYY for the date and HH/MM PM/AM for the time.  
      2.3.1.2. Date shall not be in the past (today’s date or future dates only).       
2.3.2. Issue Type:  
     2.3.2.1. Shall select one or more option from the check-list.  
     2.3.2.2. If "Other" is selected, an additional input field shall appear for further details.  
     2.3.2.3. Additional input shall not be empty.  
2.3.3. Issue Description:  
     2.3.3.1. Shall not exceed 400 characters.  
     2.3.3.2. Shall not be empty.  
2.3.4. VIN + text input  
     2.3.4.1. Shall be exactly 17 characters long. 
     2.3.4.2. Shall only contain alphanumeric characters (A-Z, 0-9) with no special characters or spaces.  
2.3.5. License plate + text input  
     2.3.5.1. Shall not contain special characters, only letters and numbers.  
     2.3.5.2. Shall not be more than 7 digits long.  
2.3.6. License State + dropdown  
     2.3.6.1. Shall select a state from the dropdown menu.  
     
2.4. **Submission Rules: (Submit button)**  
   2.4.1. The form shall not be submitted unless all required fields are valid.  
   2.4.2. The Submit button shall remain disabled until all fields pass validation. 
