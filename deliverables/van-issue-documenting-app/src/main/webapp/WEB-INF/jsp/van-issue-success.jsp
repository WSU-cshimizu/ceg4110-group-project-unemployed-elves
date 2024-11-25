<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Van Issue Submitted</title>
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
            background-size: cover;
        }

        h2 {
            text-align: center;
            color: #FFFFFF;
            margin-bottom: 10px;
            font-size: 28px;
        }

        p {
            text-align: center;
            color: #FFFFFF;
            font-size: 18px;
            margin-bottom: 20px;
        }

        table {
            width: 100%;
            margin-bottom: 20px;
            border-collapse: collapse;
            background-color: transparent; /* Prevent any unwanted background on the table */
        }

        th, td {
            padding: 12px;
            text-align: left;
            color: #FFFFFF;
        }

        th {
            background-color: #232F3E;
            border-top-left-radius: 5px;
            border-top-right-radius: 5px;
        }

        td {
            background-color: #131921;
            border-bottom: 1px solid #333333;
        }

        a {
            display: block;
            text-align: center;
            padding: 12px;
            background-color: #FCA828;
            color: black;
            text-decoration: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
            margin-top: 20px;
        }

        a:hover {
            background-color: #FFD089;
        }

        /* Remove the last border on the bottom row */
        table tr:last-child td {
            border-bottom: none;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Van Issue Submitted Successfully!</h2>
        <p>Here is the information you provided:</p>
        <table>

            <tr>
                <th>VIN</th>
                <td>${vin}</td>
            </tr>
            <tr>
                            <th>Date</th>
                            <td>${datetime}</td>
                        </tr>
            <tr>
                <th>License Plate</th>
                <td>${licensePlate}</td>
            </tr>
            <tr>
                <th>License State</th>
                <td>${licenseState}</td>
            </tr>
            <tr>
                <th>Issue Type</th>
                <td>${issueRegion}</td>
            </tr>
            <tr>
                <th>Issue Description</th>
                <td>${issueDescription}</td>
            </tr>
        </table>
        <a href="/welcome">Submit another issue</a>
    </div>
</body>
</html>
