<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.yash.onlinehomedecor.domain.Product" %>
<%@ page import="com.yash.onlinehomedecor.controller.ProductController" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online Home Decor - Product List</title>
</head>
<body>

<center>
<h3>Product Management</h3>
 <a href="addProduct.jsp"> Add Product</a>
	<table border="1">
		<tr>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Product Description</th>
			<th>Product Price</th>
			<th>Product Category</th>
			<th>Product Stock</th>
			<th>Actions</th>
		</tr>
		<c:forEach items="${listProduct}" var="product">
			<tr>
				<td><c:out value="${product.prodid}"/></td>
				<td><c:out value="${product.prodname}"/></td>
				<td><c:out value="${product.description}"/></td>
				<td><c:out value="${product.price}"/></td>
				<td><c:out value="${product.category}"/></td>
				<td><c:out value="${product.stock}"/></td>
	      	<td><a href="./productcontroller?action=edit&prodid=${product.getProdid()}">Edit</a>
				<a href="./productcontroller?action=delete&prodid=${product.getProdid()}">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	</center>
</body>
</html>