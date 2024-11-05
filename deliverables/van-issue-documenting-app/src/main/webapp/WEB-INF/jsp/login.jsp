<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>User Authentication</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f0f0f0;
      margin: 0;
      padding: 0;
    }
    .container {
      width: 100%;
      max-width: 400px;
      margin: 100px auto;
      padding: 20px;
      background-color: #fff;
      border-radius: 8px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    h2 {
      text-align: center;
      margin-bottom: 20px;
    }
    form {
      display: flex;
      flex-direction: column;
    }
    label {
      margin-bottom: 10px;
      font-weight: bold;
    }
    input[type="text"], input[type="tel"] {
      padding: 10px;
      font-size: 16px;
      border: 1px solid #ccc;
      border-radius: 5px;
      margin-bottom: 20px;
    }
    input[type="text"]::placeholder, input[type="tel"]::placeholder {
      color: rgba(0, 0, 0, 0.3);
    }
    .submit-btn {
      padding: 10px;
      background-color: #28a745;
      color: #fff;
      border: none;
      border-radius: 5px;
      font-size: 16px;
      cursor: pointer;
    }
    .submit-btn:hover {
      background-color: #218838;
    }
    .error-message {
      color: red;
      display: none;
    }

    /* General Styles for Desktop */
body {
    font-family: Arial, sans-serif;
    background-color: #f0f0f0;
    margin: 0;
    padding: 0;
  }

  .container {
    width: 100%;
    max-width: 500px; /* Adjusted width */
    margin: 50px auto;
    padding: 20px;
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  }

  h2 {
    text-align: center;
    margin-bottom: 20px;
  }

  form {
    display: flex;
    flex-direction: column;
  }

  label {
    margin-bottom: 10px;
    font-weight: bold;
  }

  input[type="text"], input[type="tel"], input[type="datetime-local"], textarea, select {
    padding: 10px;
    font-size: 16px;
    border: 1px solid #ccc;
    border-radius: 5px;
    margin-bottom: 20px;
  }

  input[type="text"]::placeholder, input[type="tel"]::placeholder, input[type="datetime-local"]::placeholder, textarea::placeholder {
    color: rgba(0, 0, 0, 0.3);
  }

  textarea {
    resize: vertical;
  }

  .submit-btn {
    padding: 10px;
    background-color: #007bff;
    color: #fff;
    border: none;
    border-radius: 5px;
    font-size: 16px;
    cursor: pointer;
  }

  .submit-btn:hover {
    background-color: #0056b3;
  }

  .error-message {
    color: red;
    display: none;
  }

  /* Media Queries */

  /* Tablet Mode */
  @media (max-width: 768px) {
    .container {
      max-width: 100%;
      padding: 15px;
      margin: 20px;
    }

    h2 {
      font-size: 1.8em;
    }

    input[type="text"], input[type="tel"], input[type="datetime-local"], textarea, select {
      padding: 8px;
      font-size: 14px;
    }

    .submit-btn {
      font-size: 14px;
      padding: 8px;
    }
  }

  /* Mobile Mode */
  @media (max-width: 480px) {
    .container {
      max-width: 100%;
      padding: 10px;
      margin: 10px;
    }

    h2 {
      font-size: 1.5em;
    }

    input[type="text"], input[type="tel"], input[type="datetime-local"], textarea, select {
      padding: 6px;
      font-size: 12px;
    }

    .submit-btn {
      font-size: 12px;
      padding: 6px;
    }
  }

  </style>
</head>


<body>
<center>  <div class="container">
    <h2>User Authentication</h2>

<form id="authForm" action="/login" method="post">
    <label for="name">First name</label>
    <input type="text" id="name" name="name" placeholder="Name" required
                 pattern="[A-Za-z]{1,50}" title="Only letters are allowed, max 50 characters">

    <label for="surname">Last Name</label>
          <input type="text" id="surname" name="surname" placeholder="Last Name" required
                 pattern="[A-Za-z]{1,50}" title="Only letters are allowed, max 50 characters">

   <label for="driverID">Driver ID</label>
<input type="text" id="driverID" name="driverID" placeholder="A123456" required pattern="[A-Za-z]{1}[0-9]{6}" title="Must follow the format: D111111 (one letter followed by 6 digits)">
<label for="phone">Phone Number</label>
<input type="tel" id="phone" name="phoneNumber" placeholder="1111111111"
       required pattern="\d{10}"
       title="Please enter exactly 10 digits (e.g., 1234567890)">
    <div class="error-message" id="errorMessage">${errorMessage}</div>

    <button type="submit" class="submit-btn">Submit</button>
</form>

<style>
    .error-message {
        color: red;
        margin: 10px 0;
        display: block; /* Ensure it's visible initially */
    }
</style>
    <script>
      function hideErrorMessage() {
            const errorMessageElement = document.getElementById('errorMessage');
            errorMessageElement.style.display = 'none';
        }

        const errorMessageElement = document.getElementById('errorMessage');

        if (errorMessageElement.innerText) {
            setTimeout(hideErrorMessage, 10000);
        }
    </script>
</div>
</center>


</div>
</center>


</body>
</html>