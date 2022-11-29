<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import = "com.insurance.ATD.HotelInsurance.HotelBean" %>
    <%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel Insurance Details</title>
</head>

<table align="center" cellpadding="25">
<tr>
<td>
<h1 style="color: red ;">Hotel Insurance Details</h1>
</table></tr></td>

<body style = "background-image:url('https://fintech.global/wp-content/uploads/2019/06/photo-1517840901100-8179e982acb7-696x464.jpg');>
background-repeat: no-repeat;
background-attachment: fixed;
background-size: 100% 100%;">

<h1 style="color: red ;">Insurances we are Claiming for:</h1>
<td><span style="color : red ; font-size:25px">Property All Risks : <br>
<h1 style="color: white ; font-size:15px">Fire, burglary and accidental damage cover to building (if owned), office equipment and all contents. </h1><br>

Business Interruption : <br>
<h1 style="color: white ; font-size:15px">Loss of profit or increased cost of working resulting from interruption of business due to damage by fire and allied perils. </h1><br>
 

Breakdown : <br>
<h1 style="color: white ; font-size:15px">Electrical and Mechanical Breakdown of Office Equipment Like Air-Conditioners,
PhotoCopiers, Water Filters, Refrigerators, Computers and Related Items. </h1> <br>
 

Portable Items : <br>
<h1 style="color: white ; font-size:15px">Cover for LapTops, PalmTops and Mobile Phones Against All Risks AnyWhere in the World.</h1><br>
 

Money in Transit and Money in Safe at Premises : <br>
<h1 style="color: white ; font-size:15px">Cover Against Robbery, Dacoity, Burglary and HouseBreaking.</h1><br>
 

Dishonesty of Employees : <br>
<h1 style="color: white ; font-size:15px">Loss of money or goods caused by fraud or dishonesty of employees.</h1><br>
</span>
</td>
<br>
${fire}
<br>
<body>
<form action="HotelData" method = "post">
<h1 style="color: red ;">Provide Your Details Here:</h1>
<h1 style="color: green ;">
Full Name: <input type = "text" name = "fullname"><br>
      <label for="PolicyAmount">Policy Amount
      </label>
      <select name="policyamount" id="pa">
        <option value="select">Policy amount</option>
        <option value="120">120</option>
        <option value="150">150</option>
        <option value="170">170</option>
     
      </select>

      <br/>
     
      <label for="Tenure">Policy Tenure</label>
      <select name="Tenure" id="pa">
        <option value="select">Policy Tenure</option>
        <option value="3">3</option>
        <option value="6">6</option>
        <option value="9">9</option>
      </select>
 
      <br/>
      <label for="Percentage">Percentage</label>
      <select name="Percentage" id="pa">
        <option value="select">Percentage</option>
        <option value="5">5</option>
        <option value="7">7</option>
      </select>
      </h1><br>
      <input type="submit" value="Submit"/>
</form><br>
<form action="HotelSearch" method = "get">
<h1 style="color: green ; font-size:25px">Please Enter the Unique ID Number Sent to Your Registered<br> number
My UID (as sent in mail): <br> 
ATD- <input type = "text" name = "policynumber">
<input type="submit" value="Submit"/>
</form><br>

<form action="Deleteddata" method = "Post">
Please Enter Your ID to Delete the Data <br>
My UID (as sent in mail): <br>
ATD- <input type = "text" name = "policynumber">
<input type="submit" value="Submit"/>
</form>
<form action="Updateddata" method = "get">
<h1 style="color: green ; font-size:25px">Please Enter Your ID to Update the Data <br></h1>
My UID (as sent in mail): <br>
ATD- <input type = "text" name = "policynumber">
<h1 style="color: green ;">
<h1 style="color: white ; font-size:25px">
Full Name: <input type = "text" name = "fullname"><br>
      <label for="PolicyAmount">Policy Amount
      </label>
      <select name="policyamount" id="pa">
        <option value="select">Policy amount</option>
        <option value="120">120</option>
        <option value="150">150</option>
        <option value="170">170</option>
     
      </select>

      <br/>
     
      <label for="Tenure">Policy Tenure</label>
      <select name="tenure" id="pa">
        <option value="select">Policy Tenure</option>
        <option value="3">3</option>
        <option value="6">6</option>
        <option value="9">9</option>
      </select>
 
      <br/>
      <label for="Percentage">Percentage</label>
      <select name="percentage" id="pa">
        <option value="select">Percentage</option>
        <option value="5">5</option>
        <option value="7">7</option>
      </select>
      </h1><br>
      <input type="submit" value="Submit"/>
     
</form>

</body>
</html>