<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


    <%@page import ="com.insurance.ATD.VehicleInsurance.VehicleBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VehicleInsurance</title>
</head>
<body style="background-image: url('https://4.bp.blogspot.com/-QsSJPwsNvYA/Wr4jniaO8bI/AAAAAAAAAQU/PrFSCgAAzu8G8NYlAkgGoyt9q8UmBq2OACLcBGAs/s640/Types%2Bof%2BMotor%2BInsurance%2Bin%2BIndia.png');
  background-color: #cccccc; /* Used if the image is unavailable */

  background-repeat: no-repeat; /* Do not repeat the image */
  background-size: cover;" >

  
<h2>Select the fields from the following</h2>
<form action="VehiclecInsuranceDetails" method = "get">
<%
      VehicleBean vb = new VehicleBean();
%>
<!--  Vehicle Name : <input type = "text" name = "Vehicles"> -->

     <label for="vehicles">Vehicle Name</label>
      <select name="vehicles" id="pa">
        <option value="select">types</option>
        <option value="bike">Car</option>
        <option value="truck">Bike</option>
        <option value="truck">Bus</option>
        <option value="truck">Truck</option>
        
      </select>

    <br/>
     <br/>


      <label for="PolicyAmount">Policy Amount</label>
      <select name="PolicyAmount" id="pa">
        <option value="select">Policy amount</option>
        <option value="120">120</option>
        <option value="150">150</option>
        <option value="170">170</option>
     
      </select>

      <br/>
       <br/>
     
      <label for="Tenure">Policy Tenure</label>
      <select name="Tenure" id="pa">
        <option value="select">Policy Tenure</option>
        <option value="3">3</option>
        <option value="6">6</option>
        <option value="9">9</option>
      </select>
 
      <br/>
       <br/>
       
      <label for="Percentage">Percentage</label>
      <select name="Percentage" id="pa">
        <option value="select">Percentage</option>
        <option value="5">5</option>
        <option value="7">7</option>
      </select>
      
       <br/>
        <br/>
        
      <input type="submit" value="Submit" />
      
       <br/>
        <br/>
        
<!--  <button><a href = "VehicleInsuranceHolderDetails">Calculate my Insurance</a></button> -->
</form>

</body>
</html>