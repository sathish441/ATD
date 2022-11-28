<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


    <%@page import ="com.insurance.ATD.VehicleInsurance.VehicleBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VehicleInsurance</title>
</head>
<body>
<h2>Select the fields from the following</h2>
<form action="Vehiclecalculations" method = "get">
<%
      VehicleBean vb = new VehicleBean();
%>
Vehicle Name : <input type = "text" name = "Vehicles">
      <label for="policyamount">Policy Amount</label>
      <select name="policyamount" id="pa">
        <option value="select">Policy amount</option>
        <option value="120">120</option>
        <option value="150">150</option>
        <option value="170">170</option>
     
      </select>

      <br/>
     
      <label for="tenure">Policy Tenure</label>
      <select name="tenure" id="pa">
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
      <button><a href = "Vehiclecalculations">Calculate my Insurance</a></button>
</form>
</body>
</html>