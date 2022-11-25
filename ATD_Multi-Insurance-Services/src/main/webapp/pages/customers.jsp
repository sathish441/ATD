<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Add New Costumer</h1> 
<form action="customers" method="post">
PolicyNumber:<input type="number" name="PolicyNumber">
Fullname:<input type="text" name="Fullname">
Age:<input type="number" name="Age">
Policyamount:<input type="number" name="Policyamount">
Tenure:<input type="number" name="Tenure">
Percentage:<input type="number" name="Percentage">
<input type="submit" name="Submit">
</form> 
</body>
</html>