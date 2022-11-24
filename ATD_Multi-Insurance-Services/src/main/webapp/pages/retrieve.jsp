<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="searchdetails" method="post">
PolicyNumber:<input type="number" name="PolicyNumber">
<input type="submit" name="Search">
<h4> ${homebean}</h4>
</body>
</html>