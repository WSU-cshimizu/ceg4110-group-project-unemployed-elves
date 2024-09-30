# Requirements Specification

### First Page: User Authentication **(Functionality)**

- **Main Object:** An HTML form with four sections: 
  - **Name**
  - **Surname**
  - **Driver ID**
  - **Phone Number**
  - **Submit** button
  
- **User-Friendly Feature:** Each field should include an example, displayed in a slightly transparent manner to guide users on how to enter their information.
- **User Requirements:**
  - Users must enter their **Name**, **Surname**, **Driver ID**, and **Phone Number**.
  - If the provided information matches an entry in the database, users will be allowed to proceed to the next page.
  - If not, a pop-up message will indicate which field is incorrect.
- **Concurrent Access:** The form should function properly when two or more users attempt to log in simultaneously.
- **Responsiveness:** The page must be responsive, ensuring it displays correctly on all devices, including smartphones, tablets, and desktops.
- **Browser Compatibility:** The authentication form must be tested and function correctly across all major browsers (Chrome, Firefox, Safari, and Edge).


### First Page: User Authentication **(Constraints)**

- **User Registration:** All users (drivers) will not register individually; their information will be pre-loaded into a database.

- **Field Validations:**
  - **Name** and **Surname:** Must only accept alphabetic characters and should not exceed 50 characters in length.
  - **Driver ID:** Must be numeric and conform to a specific format (e.g., 6 digits).
  - **Phone Number:** Must follow a valid format (e.g., (XXX) XXX-XXXX) and must be verified to be numeric.

- **Submission Rules:** Users must not be allowed to submit the form unless all required fields are filled out and valid.

- **Pop-Up Message:** The pop-up message for incorrect fields must disappear after no more than 10 seconds to maintain a clean interface.
