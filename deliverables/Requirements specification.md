# Requirements Specification

### First Page: User Authentication

#### Functionality
1. **Main Object:** An HTML form with the following sections:  
        1.1. Name + text input   
        1.2. Surname + text input  
        1.3. Driver ID + text input  
        1.4. Phone Number + text input  
        1.5. Submit button  

2. **User-Friendly Feature:**  
    2.1. Each input field will include an example (placeholder) in a slightly transparent manner to guide the user on how to enter the information correctly.  

3. **User Requirements:**  Users must enter:  
      3.1. Name  
      3.2. Surname  
      3.3. Driver ID  
      3.4. Phone Number  

4. **Validation:**     
   4.1. The provided information will be verified against the pre-loaded database of user details.  
   4.2. If the data matches, the user will proceed to the next page.  
   4.3. If there is an error, a pop-up will indicate which field is incorrect.  

5. **Concurrent Access:**  
   5.1. The form should function properly when two or more users attempt to log in simultaneously.

6. **Responsiveness:**  
   6.1. The page must be responsive, ensuring proper display on all devices (smartphones, tablets, desktops).

7. **Browser Compatibility:**
       7.1. The form must work across all major browsers (Chrome, Firefox, Safari, and Edge).

---

### First Page: User Authentication

#### Constraints

8. **User Registration:**  
    8.1. Users (drivers) will not register manually; all information will be pre-loaded into the database.  

9. **Field Validations:**  
      9.1. Name and Surname fields:   
      9.1.1. Must only accept alphabetic characters.  
      9.1.2. Must not exceed 50 characters.  
   
      9.2. Driver ID field:  
      9.2.1. Must only accept numeric characters.  
      9.2.1. Must follow a specific format one symbol 6 digits.

      9.3. Phone Number field:  
      9.3.1. Must follow a specific format ((XXX) XXX-XXXX).  
      9.3.2. Must only accept numeric input.  

10. **Submission Rules:**  
    10.1. The form should not be submitted unless all required fields are filled and valid.  

11. **Pop-Up Message:**  
    11.1. Error messages should disappear after a maximum of 10 seconds.  

---

### Second Page: Van Issue Documenting Form

#### Functionality

1. **Main Object:**
   -  An HTML form with the following sections:
     - 1.1. Driver ID + text input
     - 1.2. Date and Time of Issue + numeric input
     - 1.3. Issue Type + dropdown list with predefined options and an "Other" option
     - 1.4. Issue Description + text input
     - 1.5. Status + dropdown list (New, In-Progress, Resolved)
     - 1.6. Submit button

2. **User-Friendly Features:**
   - 2.1. Each field will include an example (placeholder) to guide users.
   - 2.2. Hovering over fields will display additional information.
   - 2.3. The Date and Time field will be pre-filled with the current date and time but can be modified by the user.

### Second Page: Van Issue Documenting Form

#### Constraints

3. **Field Validations:**
   - 3.1. Driver ID:
     - 3.1.1. Must be numeric (e.g., 6 digits).
   
   - 3.2. Date and Time of Issue:
     - 3.2.1. Must follow the format MM/DD/YYYY for the date and HH/MM PM/AM for the time.
     - 3.2.2. Date must not be in the past (today’s date or future dates only).
   
   - 3.3. Issue Type:
     - 3.3.1. Must select one option from the dropdown.
     - 3.3.2. If "Other" is selected, an additional input field should appear for further details.

   - 3.4. Issue Description:
     - 3.4.1. Must not exceed 400 characters.
     - 3.4.2. Must not be empty.

   - 3.5. Status:
     - 3.5.1. Must select one option from the dropdown (New, In-Progress, Resolved).

4. **Submission Rules:**
   - 4.1. The form should not be submitted unless all required fields are valid.
   - 4.2. The Submit button must remain disabled until all fields pass validation.

5. **Concurrent Access:**
   - 5.1. The form should function properly when two or more users are logging in simultaneously.

6. **Responsiveness:**
   - 6.1. The page must be responsive and display correctly on all devices (smartphones, tablets, desktops).

7. **Browser Compatibility:**
   - 7.1. The form must work across all major browsers (Chrome, Firefox, Safari, and Edge).
