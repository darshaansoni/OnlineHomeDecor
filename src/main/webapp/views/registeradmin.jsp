<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Admin</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e6f2ff;
        }
        .addAdmin-container {
            width: 350px;
            padding: 40px;
            background-color: white;
            margin: 50px auto;
            box-shadow: 0px 0px 15px 0px #000;
            border-radius: 10px;
        }
        h2 {
            text-align: center;
            color: #1a75ff;
        }
        label {
            display: block;
            margin: 10px 0 5px;
            font-weight: bold;
        }
        input[type="text"], 
        input[type="email"], 
        input[type="password"] {
            width: 100%; /* Full width */
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            box-sizing: border-box;
            border-radius: 4px;
        }
        input[type="submit"] {
            background-color: #1a75ff;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%; /* Full width */
            border-radius: 4px;
        }
        input[type="submit"]:hover {
            background-color: #0052cc;
        }
         .success-message {
            color: green;
            text-align: center;
            margin: 20px 0;
        }
        .error-message {
            color: red;
            text-align: center;
            margin: 20px 0;
        }
    </style>
</head>
<body>
<center>
    <div class="addAdmin-container">
        <h2>Add Admin</h2>
        <form name="addadmin" onsubmit="return validateForm()" action="/onlineHomeDecor/registerAdmin" method="post">
            <b><label>Username:</label></b>
            <input type="text" id="username" name="username" placeholder="Enter your username" required><br>

            <b><label>Email:</label></b>
            <input type="email" id="email" name="email" placeholder="Enter your email" required><br>

            <b><label>Contact Number:</label></b>
            <input type="text" id="contactNumber" name="contactNumber" placeholder="Enter your contact number" required><br>

            <b><label>Password:</label></b>
            <input type="password" id="password" name="password" placeholder="Enter your password" required><br>

            <b><label>Confirm Password:</label></b>
            <input type="password" id="confirmPassword" name="confirmPassword" placeholder="Enter your confirm password" required><br>

            <input type="submit" value="Add Admin">
        </form>
    </div>
</center>

<script>
    function validateForm() {
        const username = document.getElementById('username').value;
        const email = document.getElementById('email').value;
        const password = document.getElementById('password').value;
        const confirmPassword = document.getElementById('confirmPassword').value;

        // Validate username (must be at least 3 characters)
        if (username.length < 3) {
            alert("Username must be at least 3 characters long.");
            return false;
        }

        // Validate email format
        const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!emailPattern.test(email)) {
            alert("Please enter a valid email address.");
            return false;
        }

        // Validate password (must be at least 6 characters)
        if (password.length < 6) {
            alert("Password must be at least 6 characters long.");
            return false;
        }

        // Check if passwords match
        if (password !== confirmPassword) {
            alert("Passwords do not match.");
            return false;
        }

        // If all validations pass
        return true;
    }
</script>

</body>
</html>