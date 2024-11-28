<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <title>User Authentication</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      display: flex;
      justify-content: center;
      align-items: center;
      background-color: #080B0E;
      margin: 0;
      padding: 0;
      overflow: auto;
    }

    body::-webkit-scrollbar {
      width: 15px;
    }

    body::-webkit-scrollbar-thumb {
      background: #333333;
    }

    .container {
      display: flex;
      flex-direction: column;
      max-width: 500px;
      width: 100%;
      background-color: #131921;
      border-radius: 10px;
      box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
      margin: 50px auto;
      padding: 20px;
    }

    h2 {
      text-align: center;
      color: #FFFFFF;
      margin-bottom: 10px;
      font-size: 28px;
    }

    label {
      color: #FFFFFF;
      display: block;
      margin: 8px;
      font-size: 18px;
    }

    input[type="text"], input[type="tel"] {
      box-sizing: border-box;
      color: #FFFFFF;
      background-color: #000000;
      border: 2px solid #FFFFFF;
      width: 100%;
      padding: 10px;
      font-size: 14px;
      border-radius: 5px;
      outline: none;
    }

    input[type="text"]::placeholder, input[type="tel"]::placeholder {
      opacity: 0.7;
    }

    input[type="text"]:focus, input[type="tel"]:focus {
      border: 2px solid #ff9900;
      outline: none;
    }

    .submit-btn {
      width: 50%;
      align-items: center;
      padding: 12px;
      background-color: #FCA828;
      color: black;
      border: none;
      border-radius: 5px;
      font-size: 16px;
      cursor: pointer;
      transition: background-color 0.3s ease;
      margin: 20px auto 0; /* Center-align with auto margins */
      display: block; /* Ensure it takes the margin effect */
    }

    .submit-btn:hover {
      background-color: #FFD089;
    }

  .error-message {
      display: none; /* Hidden by default */
      color: #ff4d4d;
      background-color: #ffe6e6;
      border: 1px solid #ff9999;
      border-radius: 5px;
      padding: 10px;
      margin: 10px 0;
      font-size: 14px;
      font-family: Arial, sans-serif;
      box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  }

  </style>
</head>
<body>
  <div class="container">
    <h2>Log in to submit an issue:</h2>
    <form id="authForm" action="/login" method="post">
      <label for="name">First Name</label>
      <input type="text" id="name" name="name" placeholder="Name" required
             pattern="[A-Za-z]{1,50}" title="Only letters are allowed, max 50 characters">

      <label for="surname">Last Name</label>
      <input type="text" id="surname" name="surname" placeholder="Last Name" required
             pattern="[A-Za-z]{1,50}" title="Only letters are allowed, max 50 characters">

      <label for="driverID">Driver ID</label>
      <input type="text" id="driverID" name="driverID" placeholder="A123456" required
             pattern="[A-Za-z]{1}[0-9]{6}" title="Must follow the format: D111111 (one letter followed by 6 digits)">

      <label for="phone">Phone Number</label>
      <input type="tel" id="phone" name="phoneNumber" placeholder="1111111111" required
             pattern="\d{10}" title="Please enter exactly 10 digits (e.g., 1234567890)">

      <div class="error-message" id="errorMessage">${errorMessage}</div>

      <button type="submit" class="submit-btn">Verify</button>
    </form>
   <script>
   document.addEventListener("DOMContentLoaded", () => {
     const errorMessageElement = document.getElementById("errorMessage");
     if (errorMessageElement && errorMessageElement.innerText.trim()) {
       errorMessageElement.style.display = "block";

       setTimeout(() => {
         errorMessageElement.style.display = "none";
       }, 10000);
     } else {
       errorMessageElement.style.display = "none";
     }
   });

   </script>
  </div>
</body>
</html>
