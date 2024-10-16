<html>
<head>

<title>Login Form</title>
     <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }
        .login-container {
            width: 350px;
            padding: 40px;
            background-color: white;
            margin: 100px auto;
            box-shadow: 0px 0px 10px 0px #000;
            border-radius: 8px;
        }
        h2 {
            text-align: center;
            color: #4CAF50;
        }
        input[type=text], input[type=password] {
            width: 40%;
            padding: 8px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
            border-radius: 4px;
        }
        input[type=submit] {
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 40%;
            border-radius: 4px;
        }
        input[type=submit]:hover {
                     background-color: #45a049;
        }
    </style>
            
</head>

<body>
	<center>
	 <div class="login-container">
	<h2>Admin Login </h2>
		<form action="./adminlogin" method="post">
			<b><label>Username:</label></b> <input type="text" name="username" placeholder="Enter ur username"/><br>
			<b><label>Password:</label></b> <input type="password" name="password" placeholder="Enter ur password" /><br> <br>
				<b><input type="submit" value="Login"></b><br>
				
		</form>
	</center> 
	
	  
</body>
</html>