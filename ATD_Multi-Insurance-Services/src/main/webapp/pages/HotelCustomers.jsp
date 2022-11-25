<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel Customers Data</title>
</head>
<body>
<h1>Add New Customer</h1> 
<form action="HotelCustomers" method="post">
PolicyNumber:<input type="text" name="PolicyNumber">
fullname:<input type="text" name="fullname">
Age:<input type="text" name="Age">
Policyamount:<input type="text" name="policyamount">
Tenure:<input type="text" name="tenure">
Percentage:<input type="number" name="percentage">

<input type="submit" name="Submit">
</form> 
</body>
</html>