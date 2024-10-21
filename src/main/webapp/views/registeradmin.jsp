<html>
<head>
<title>Add Admin</title>
</head>
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
        input[type=text], input[type=username], input[type=email],input[type=contactNumber],input[type=password],input[type=confirmPassword] {
            width: 50%;
            padding: 10px;
            margin: 10px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
            border-radius: 4px;
        }
        input[type=submit] {
            background-color: #1a75ff;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 60%;
            border-radius: 4px;
        }
        input[type=submit]:hover {
        
            background-color: #0052cc;
        }
        
    </style>
<body>
<center>


 <div class="addAdmin-container">
<h2>Add Admin</h2>
<form  name="addadmin" action="/onlineHomeDecor/registerAdmin" method="post">
<b><label>Username:</label></b>
<input type="text" id="username" name="username" placeholder="Enter ur username"><br>

<b><label>Email:</label></b>
<input type="text" id="email" name="email" placeholder="Enter ur  email" "><br>

<b><label>Contact Number:</label></b>
<input type="text" id="contactNumber" name="contactNumber" placeholder="Enter ur contactNumber" "><br>

<b><label>Password:  </label></b>
<input type="password" id="password" name="password" placeholder="Enter ur password" ><br>

<b><label>ConfirmPassword:</label></b>
<input type="password" id="confirmPassword" name="confirmPassword" placeholder="Enter ur confirmPassword" ><br>



  <input type="submit" value="Add Admin">
</form>

</center>

</body>

</html>