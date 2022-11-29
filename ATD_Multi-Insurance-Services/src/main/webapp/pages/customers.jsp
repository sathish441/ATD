<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue">
	<h1>Add New Costumer</h1>
	<form action="customers" method="post">
		PolicyNumber:<input type="number" name="PolicyNumber">
		Fullname:<input type="text" name="Fullname"> Age:<input
			type="number" name="Age"> Policyamount:<input type="number"
			name="Policyamount"> Tenure:<input type="number"
			name="Tenure"> Percentage:<input type="number"
			name="Percentage"> <input type="submit" name="Submit">
	</form>
	<h1>Search Costumers Data</h1>
	<form action="searchdetails" method="get">
		Enter PolicyNumber:<input type="number" name="PolicyNumber"> <input
			type="submit" name="Search">
	</form>
	<h1>Fetch Costumers Data</h1>
	<form action="fetchdetails" method="get">
		<input type="submit" name="Fetch">
	</form>
	<h1>Delete Costumers Data</h1>
	<form action="deletedata" method="post">
		Enter PolicyNumber:<input type="number" name="PolicyNumber"> <input
			type="submit" name="Delete">
	</form>
	<h1>Update Costumers Data</h1>
	<form action="updatedata" method="post">
		Enter PolicyNumber:<input type="number" name="PolicyNumber">
		Fullname:<input type="text" name="Fullname"> Age:<input
			type="number" name="Age"> Policyamount:<input type="number"
			name="Policyamount"> Tenure:<input type="number"
			name="Tenure"> Percentage:<input type="number"
			name="Percentage">. <input type="submit" name="Update">
	</form>
		<table>
	<td><button><a href="homeconstructionpolicy">1.The building or Home Structure Policy:</button></td></tr>
	</table>
	<h4>2.Natural calamities like floods, storms, lightning,
		earthquakes, tsunamis, forest fires, volcanic eruptions:</h4>
	<h4>3.Man-made disasters like fire accidents, strikes, protests,
		and riots, or any other damages or losses caused by other ill
		intentions:</h4>
	<h4>4.Damages or losses incurred due to government restructuring
		like direct contact of vehicles, road, and rail:</h4>
	<h4>5.Demolition or subsidence of your property and/or due to
		rockslides, landslides, and missile test operations:</h4>
	<h4>6.Damages caused by an explosion and/or overflow of water
		pipes, tanks, leaks in sprinkler systems, or other similar equipment:</h4>
</body>
</html>