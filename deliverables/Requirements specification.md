# Requirements Specification

0. ## General requirements for both pages: 
0.1. **Concurrent Access:**  Forms should function properly when two or more users are logging in/filling out the form simultaneously.  
0.2. **Responsiveness:** Pages must be responsive and display correctly on all devices (smartphones, tablets, desktops).  
0.3. **Browser Compatibility:**  Forms must work across all major browsers (Chrome, Firefox, Safari, and Edge).  

1. ## First Page: User Authentication  

### Functionality
1.1. **Main Object:** An HTML form with the following sections:  
        1.1.1. Name + text input   
        1.1.2. Surname + text input  
        1.1.3. Driver ID + text input  
        1.1.4. Phone Number + text input  
        1.1.5. Submit button  

1.2. **User-Friendly Feature:**  
    1.2.1. Each input field will include an example (placeholder) in a slightly transparent manner to guide the user on how to enter the information correctly.  

1.3. **User Requirements:**  Users are required to enter:   
      Name    
      Surname  
      Driver ID  
      Phone Number  

1.4. **Validation:**     
   1.4.1. The provided information will be verified against the pre-loaded database of user details.  
   1.4.2. If the data matches, the user will proceed to the next page.  
   1.4.3. If there is an error, a pop-up will indicate which field is incorrect.  


---


### Constraints

1.5. **User Registration:**    
    1.5.1. Users (drivers) will not register manually; all information will be pre-loaded into the database.  

1.6. **Field Validations:**  
      1.6.1 Name and Surname fields:   
      1.6.1.1 Must only accept alphabetic characters.  
      1.6.1.2. Must not exceed 50 characters.  
      1.6.2. Driver ID field:        
      1.6.2.1 Must only accept numeric characters.  
      1.6.2.2 Must follow a specific format one symbol 6 digits.  
      1.6.3. Phone Number field:       
      1.6.3.1 Must follow a specific format ((XXX) XXX-XXXX).  
      1.6.3.2. Must only accept numeric input.  

1.7. **Submission Rules:**  
    1.7.1. The form should not be submitted unless all required fields are filled and valid.  

1.8. **Pop-Up Message:**  
    1.8.1. Error messages should disappear after a maximum of 10 seconds.  

---

2. ## Second Page: Van Issue Documenting Form

### Functionality

2.1. **Main Object:** An HTML form with the following sections:  
      2.1.1. Driver ID + text input  
      2.1.2. Date and Time of Issue + numeric input  
      2.1.3. Issue Type + dropdown list with predefined options and an "Other" option  
      2.1.4. Issue Description + text input  
       2.1.5. Status + dropdown list (New, In-Progress, Resolved)  
       2.1.6. Submit button  

2.2 **User-Friendly Features:**  
   2.2.1. Each field will include an example (placeholder) to guide users.  
   2.2.2. Hovering over fields will display additional information.  
   2.2.3. The Date and Time field will be pre-filled with the current date and time but can be modified by the user.  


### Constraints

3.3. **Field Validations:**  
     3.3.1. Driver ID:  
     3.3.1.1. Must be numeric (one symbol + 6 digits).   
   
 3.3.2. Date and Time of Issue:  
      3.3.2.1. Must follow the format MM/DD/YYYY for the date and HH/MM PM/AM for the time.  
      3.3.2.2. Date must not be in the past (today’s date or future dates only).   
   
3.3.3. Issue Type:  
     3.3.3.1. Must select one option from the dropdown.  
     3.3.3.2. If "Other" is selected, an additional input field should appear for further details.  
     3.3.3.3. Additional input must not be empty.  
     3.3.4. Issue Description:  
     3.3.4.1. Must not exceed 400 characters.  
     3.3.4.2. Must not be empty.  
     3.3.5. Status:  
     3.3.5.1. Must select one option from the dropdown (New, In-Progress, Resolved). 

4. **Submission Rules:**  
   4.1. The form should not be submitted unless all required fields are valid.  
   4.2. The Submit button must remain disabled until all fields pass validation.  
