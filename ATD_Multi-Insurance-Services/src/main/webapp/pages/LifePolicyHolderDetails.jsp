<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Policy Holder Details</title>
</head>
<body>
<div style="background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0GQnpvpr9tlZNvHSG2vYWbyhjY7bQSKWUBeY_uKzQH9JszxvvM5E7c_oZcrD4F8QwnL0&usqp=CAU');
  background-color: #cccccc; /* Used if the image is unavailable */
  height: 1500px; /* You must set a specified height */
  background-position: center; /* Center the image */
  background-repeat: no-repeat; /* Do not repeat the image */
  background-size: cover;" >
<h1 style= "color:red">ATD Insurances</h1>
<h2 align="center">Details of Policy Holder</h2>
<form align="center" action="userDetailsSave" method="Post">

Full Name: <input type="text" placeholder="Enter Full Name" name="fullname"><br>
Age: <input type="text" placeholder="Enter your Age" name="age"><br>
DOB: <input type="date" placeholder="Enter DOB" name="dob"><br>
Permanent Address: <input type="text" placeholder="Enter Address" name="permanentAddress">



<br>
<input type="submit" value="Register">

</form>
</div>
</body>
</html>