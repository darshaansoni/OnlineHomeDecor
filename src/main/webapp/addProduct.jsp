<html>
<head>
<title>Add Product</title>
</head>
 <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e6f2ff;
        }
        .addProduct-container {
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
        input[type=text], input[type=prodname], input[type=discripation],input[type=catagoty], input[type=price], input[type=stock] {
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


 <div class="addProduct-container">
<h2>Add Product Form</h2>
<form  name="addProduct" action="./productcontroller" method="post">
<b><label>Product Name:</label></b>
<input type="text" id="prodname" name="prodname" placeholder="Enter ur prodname"><br>

<b><label>Discription:  </label></b>
<input type="text" id="description" name="description" placeholder="Enter ur descripation" ><br>

<b><label>Price:</label></b>
<input type="text" id="price" name="price" placeholder="Enter ur price" ><br>

<b><label>Catagory:</label></b>
<input type="text" id="category" name="category" placeholder="Enter ur catagary" "><br>

<b><label>Stock:</label></b>
<input type="text" id="stock" name="stock" placeholder="Enter ur stock" "><br>

  <input type="submit" value="AddProduct">
</form>

</center>

</body>

</html>