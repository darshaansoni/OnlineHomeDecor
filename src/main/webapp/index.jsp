<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online home Decore</title>
</head>
<body>
<h1>Cart Module</h1>
<form action = "CartCntroller" method ="POST">
<input type = "hidden" name ="action" value ="add"/>
<label>Product Name:</label> <input type ="text" name = "name"/>
<label>Quantity:</label> <input type ="number"  min="0" name = "quantity"/>
<label>Price:</label> <input type ="text" name = "price"/>
<input type ="submit" value = "Add to Cart"/>
</form>
<a href ="CartController? action = view">View Cart</a>
</body>
</html>