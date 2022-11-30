<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update policy Details</title>
</head>
<body>
<div style="background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0GQnpvpr9tlZNvHSG2vYWbyhjY7bQSKWUBeY_uKzQH9JszxvvM5E7c_oZcrD4F8QwnL0&usqp=CAU');
  background-color: #cccccc; /* Used if the image is unavailable */
  height: 1500px; /* You must set a specified height */
  background-position: center; /* Center the image */
  background-repeat: no-repeat; /* Do not repeat the image */
  background-size: cover;" >

<form action="searchFromUpdatePage" method="post">
<h1>Update Or Withdraw Your Policy</h1>
<h2 align="left"><a href="home">Home</a></h2>
<h3>Search for A policy to Update or Withdraw:
<input type="text" placeholder="Enter A policy Number" name="sno">
<input type="submit" value="Search">
</h3>
</form>


<h3 style="color:purple">Your Policy Details<br></h3>
<h3 style="color:blue">
${searchResult1}<br>
${searchResult2}<br>
</h3>

<form action="fromWithdraw" method="post">
<h3 style="color:red">Withdraw from this policy:
<input type="text" placeholder="Enter A policy Number" name="sno">
<input type="submit" value="Withdraw">
</h3>
</form>

<form action="fromUpdate" method="post">
<h2>Update your policy here</h2><br>
<h3 style="color:red">
Policy Details</h3>
<h3>
Policy Type:
<select type = "select" id="001" name="policyType">
<option value="policyType">Policy Type</option>
<option value="Whole Life Cover for 99 years">Life Cover for 99 years</option>
<option value="Life cover for 5 Years">Life cover for 5 Years</option>
<option value="Life cover for 2 Years">Life cover for 2 Years</option>
<option value="Life cover for 1 Year">Life cover for 1 Year</option>
</select>
<br>
Policy Amount per month:

<select type = "select" id="002" name="policyAmountPerMonth">
<option value="policyAmountPerMonth">Policy Amount per month</option>
<option value="300">3000</option>
<option value="4500">4500</option>
<option value="2500">2500</option>
<option value="1500">1500</option>
</select>
<br>
Instalment Process:
<select type = "select" id="003" name="instalmentProcess">
<option value="instalmentProcess">Instalment Process</option>
<option value="99 years"> Total Payment</option>
<option value="5 Years">12 months</option>
<option value="2 Years">24 months</option>
<option value="1 Year">48 months</option>
</select>
<br>
Policy Tenure:
<select type = "select" id="004" name="policyTenure">
<option value="policyTenure">Policy Tenure</option>
<option value="99 Years">99 Years</option>
<option value="5 Years">5 Years</option>
<option value="2 Years">2 Years</option>
<option value="1 Year">1 Year</option>
</select>

<br>
<h3 style="color:red">
User Details
</h3>
<h3>
<br>
Full Name: <input type="text" placeholder="Enter Full Name" name="fullName"><br>
Age: <input type="text" placeholder="Enter your Age" name="age"><br>
DOB: <input type="date" placeholder="Enter DOB" name="dob"><br>
Permanent Address: <input type="text" placeholder="Enter Address" name="permanentAddress">

</h3>
</h3>
<input type="submit" value="Update">
</form>
</div>
</body>
</html>