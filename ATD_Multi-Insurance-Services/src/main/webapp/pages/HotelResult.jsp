<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import = "com.insurance.ATD.HotelInsurance.HotelBean" %>
    <%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get The Information</title>
</head>
<body>
<table align="center" cellpadding="25">
<tr>
<td>
<h1 style="color: red ;">Searched Data</h1>
</table></tr></td>
<body style = "background-image:url('https://fintech.global/wp-content/uploads/2019/06/photo-1517840901100-8179e982acb7-696x464.jpg');>
background-repeat: no-repeat;
background-attachment: fixed;
background-size: 100% 100%;">

<h1 style="color: red ;">SearchResult:</h1>
<h2 style="color: white ;">${SearchResult}</h2>
<h1 style="color: red ;">Calculated Data:</h1>
<form action="Calculation" method = "post">

<h1 style="color: white ;"><label for="PolicyAmount">Policy Amount</h1>
      </label>
      <select name="policyamount" id="pa">
        <option value="select">Policy amount</option>
        <option value="120">120</option>
        <option value="150">150</option>
        <option value="170">170</option>
     
      </select>

      <br/>
     
      <h1 style="color: white ;"><label for="Tenure">Policy Tenure</label></h1>
      <select name="tenure" id="pa">
        <option value="select">Policy Tenure</option>
        <option value="3">3</option>
        <option value="6">6</option>
        <option value="9">9</option>
      </select>
 
      <br/>
     <h1 style="color: white ;"> <label for="Percentage">Percentage</label></h1>
      <select name="percentage" id="pa">
        <option value="select">Percentage</option>
        <option value="5">5</option>
        <option value="7">7</option>
      </select>
      </h1><br>
      <input type="submit" value="Submit"/>
</form>
<h2 style="color: white ;">Principal: ${Principal}</h2>
<h2 style="color: white ;">Intrest: ${Interest}</h2>
<h2 style="color: white ;">Amount: ${Calculateddata}</h2>

</body>
</html>