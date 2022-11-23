<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="com.insurance.ATD.FireInsurance.Firebean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FireInsurance</title>
</head>
<body>
<h2>Select the fields from the following</h2>
<form action="firecalculations" method = "get">
<%
      Firebean fb = new Firebean();
%>
Materials Name : <input type = "text" name = "Materials">
      <label for="Amount">Policy Amount</label>
      <select name="Amount" id="pa">
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
      <label for="percentage">Percentage</label>
      <select name="percentage" id="pa">
        <option value="select">Percentage</option>
        <option value="5">5</option>
        <option value="7">7</option>
      </select>
      <input type="submit" value="Submit" />
      <button><a href = "Firecalculations">Calculate my Insurance</a></button>
</form>
</body>
</html>