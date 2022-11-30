<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image: url('https://wallpaperaccess.in/public/uploads/preview/life-insurance-background-l.jpg');
  background-color: #cccccc; /* Used if the image is unavailable */

  background-repeat: no-repeat; /* Do not repeat the image */
  background-size: cover;" >

<h1 align= 'center'>Welcome to Child Insurance</h1>

<h2>Register New Customer:</h2>

<form action="childentry" method="post">

Age:          <input type="number" name="Age"><br><br>	
FullName:     <input type="text" name="FullName"><br><br>


	
Policyamount: <input type="number" name="PolicyAmount"><br><br>
		
Tenure:       <input type="number"	name="Tenure"><br><br>

Percentage:    <input type="number"	name="Percentage"><br><br>
              <input type="submit" name="Submit">
 
 <h2>Registered Successfully</h2>
</form>

<h1>Search Details:</h1>
<form action="success" method="get">
Enter FullName: <input type="text" name="FullName"><br><br>
<input type="submit" name="Search">
</form>
</body>
<h1>1) What is Child Plan?</h1>
<h2>- A child plan is a type of life insurance that helps financially secure the future of your child. It gives the assurance that the child will get the financial support from the insurance even if something untoward happens to the parents. </h2>

<h1>2) Types of Plans?</h1>
<h2>- Child plans in India are of 2 types :<br>
1) Traditional plans <br>
2) Unit Linked Insurance Plans (ULIPs) </h2>

<h1>3) Eligibility Criteria:</h1>
<h2>- The eligibility to buy a child plan varies from company to company. The usual entry age to buy a child plan is 18 to 21 years, and the maturity age can be up to 60 to 65 years.</h2>
</html>