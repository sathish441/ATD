<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="orange">
<h2>Data Registered Successfully</h2>
<h4> ${homebean}</h4>
<h1>Search Costumers Data</h1>
	<form action="searchdetails" method="get">
		Enter PolicyNumber:<input type="number" name="PolicyNumber">
		<input type="submit" name="Search">
	</form>
	<table>
	<td><button><a href="customers">Home Insurance</button></td></tr>
	</table>
</body>
</html>