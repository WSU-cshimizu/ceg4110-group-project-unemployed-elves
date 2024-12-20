<!DOCTYPE html>
<html lang="en">
<head>
    <!-- icon css styling -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">

    <!-- flatpickr datetime input css styling -->
    <link rel="stylesheet" href="resources/css/flatpickr.min.css">


    <link rel="stylesheet" href="resources/css/flatpickr-styling.css">

    <!-- this file's css styling -->
    <link rel="stylesheet" href="resources/css/UI_Styling.css">


    <!-- script for handling the flatpickrs custom datetime input field
    this script has to load prior to loading the body into the window otherwise
    the input field will not work -->
    <script src="https://cdn.jsdelivr.net/npm/flatpickr"></script>


    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Van Issue Form</title>
</head>
<body>

    <div class="container">
        <div class="custom-scrollbar">
            <div class="scroll-thumb"></div>
        </div>

        <h2>Van Issue Documentation Form</h2>
        <form id="issueForm" action="/submit-van-issue" method="POST">
            <div class="form-group">
                <label for="datetime">Date and Time <span style="color:red">*</span></label>
                <input type="text" id="datetime" name="datetime">
            </div>

            <div class="form-group" id="vinContainer">
                <label for="vin">VIN <span style="color:red">*</span></label>
                <subtext>17 characters (e.g., 4Y1SL65848Z411439)</subtext>
                <input type="text" id="vin" name ="vin" placeholder="Enter VIN here" maxlength="17">
            </div>

            <div class="form-group">
                <label for="licensePlate">License Plate <span style="color:red">*</span></label>
                <subtext>1-7 characters (e.g., 1ABC234)</subtext>
                <input type="text" id="licensePlate" name ="licensePlate" placeholder="Enter license plate here" minlength="1" maxlength="7">
            </div>

            <div class="form-group">
                <label for="licenseState">License State <span style="color:red">*</span></label>
                <select id="licenseState" name="licenseState">
                    <option value="" disabled selected>Select your state</option>
                    <option value="AL">Alabama</option>
                    <option value="AK">Alaska</option>
                    <option value="AZ">Arizona</option>
                    <option value="AR">Arkansas</option>
                    <option value="CA">California</option>
                    <option value="CO">Colorado</option>
                    <option value="CT">Connecticut</option>
                    <option value="DE">Delaware</option>
                    <option value="FL">Florida</option>
                    <option value="GA">Georgia</option>
                    <option value="HI">Hawaii</option>
                    <option value="ID">Idaho</option>
                    <option value="IL">Illinois</option>
                    <option value="IN">Indiana</option>
                    <option value="IA">Iowa</option>
                    <option value="KS">Kansas</option>
                    <option value="KY">Kentucky</option>
                    <option value="LA">Louisiana</option>
                    <option value="ME">Maine</option>
                    <option value="MD">Maryland</option>
                    <option value="MA">Massachusetts</option>
                    <option value="MI">Michigan</option>
                    <option value="MN">Minnesota</option>
                    <option value="MS">Mississippi</option>
                    <option value="MO">Missouri</option>
                    <option value="MT">Montana</option>
                    <option value="NE">Nebraska</option>
                    <option value="NV">Nevada</option>
                    <option value="NH">New Hampshire</option>
                    <option value="NJ">New Jersey</option>
                    <option value="NM">New Mexico</option>
                    <option value="NY">New York</option>
                    <option value="NC">North Carolina</option>
                    <option value="ND">North Dakota</option>
                    <option value="OH">Ohio</option>
                    <option value="OK">Oklahoma</option>
                    <option value="OR">Oregon</option>
                    <option value="PA">Pennsylvania</option>
                    <option value="RI">Rhode Island</option>
                    <option value="SC">South Carolina</option>
                    <option value="SD">South Dakota</option>
                    <option value="TN">Tennessee</option>
                    <option value="TX">Texas</option>
                    <option value="UT">Utah</option>
                    <option value="VT">Vermont</option>
                    <option value="VA">Virginia</option>
                    <option value="WA">Washington</option>
                    <option value="WV">West Virginia</option>
                    <option value="WI">Wisconsin</option>
                    <option value="WY">Wyoming</option>
                </select>
            </div>

            <div class="form-group">
                <label for="checkbox-group">Issue Region Checklist <span style="color:red">*</span></label>
                <div class="checkbox-group">
                    <label><input type="checkbox" name="issueRegion" value="Front Side">I. Front Side</label>
                    <label><input type="checkbox" name="issueRegion" value="Passenger Side">II. Passenger Side</label>
                    <label><input type="checkbox" name="issueRegion" value="Back Side">III. Back Side</label>
                    <label><input type="checkbox" name="issueRegion" value="Driver Side">IV. Driver Side</label>
                    <label><input type="checkbox" name="issueRegion" value="In Cab">V. In Cab</label>
                </div>
            </div>

            <div class="form-group">
                <label for="issueDescription">Description <span style="color:red">*</span></label>
                <textarea id="issueDescription" name = "issueDescription" placeholder="Describe the van issue" maxlength="400"></textarea>
            </div>

            <button type="submit" class="submit-btn" id="submitBtn">Submit</button>
        </form>
    </div>

</body>

<script src="resources/javascript/UI2.js"></script>
</html>
