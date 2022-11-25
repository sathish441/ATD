<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customers Entry Form</title>
</head>
<body>
<h1>Add New Customer</h1> 
<form action="Hocustomers" method="post">
PolicyNumber:<input type="number" name="PolicyNumber">
Fullname:<input type="text" name="Fullname">
Age:<input type="text" name="Age">
Policyamount:<input type="text" name="Policyamount">
Tenure:<input type="text" name="Tenure">
Percentage:<input type="number" name="Percentage">
<input type="submit" name="Submit">
</form> 
</body>
</html>