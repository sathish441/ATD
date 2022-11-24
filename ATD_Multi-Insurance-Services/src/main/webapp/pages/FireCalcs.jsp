<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import = "com.insurance.ATD.FireInsurance.Firebean" %>
    <%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<%
int i,j,row=4;
for(i=row;i>=0;i--){
	for(j=0;j<=i;j++){
		out.print("-*- ");
	}out.println("<br>");
}
%>
<h2 align = "center">Fire Insurance Policy Calculations</h2>
<body style = "background-image:url('https://www.pngitem.com/pimgs/m/526-5265497_-burning-fire-white-background.png');">
Details are as below:<br>
<br>
${fire}
<br>
<br>
Check out the policy calculations below:
<form action="calculateintrest" method = "Get">
<table>
<tr><td>

      <label for="Amount">Policy Amount</label>
      <select name="Amount" id="pa">
        <option value="select">Policy amount</option>
        <option value="120">120</option>
        <option value="150">150</option>
        <option value="170">170</option>
        <option value="200">200</option>
      </select>
      
  </td> <td>
      <label for="Tenure">Policy Tenure</label>
      <select name="Tenure" id="pa">
        <option value="select">Policy Tenure</option>
        <option value="3">3</option>
        <option value="6">6</option>
        <option value="9">9</option>
        <option value="12">12</option>
      </select>
    
      </td><td>
      <label for="percentage">Percentage</label>
      <select name="percentage" id="pa">
        <option value="select">Percentage</option>
        <option value="5">5</option>
        <option value="7">7</option>
        <option value="9">9</option>
        <option value="10">10</option>
      </select>
      </td><td></td><td></td><td></td><td>
      <input type="submit" value="Submit" />
      </td>
</form>
 <td></td><td><td></td><td></td><td>
<button> <a href="FireInsurance">Back to Policies Page-Fire</a></button><br>
</tr>
<br>
<tr><td>
Principal Amount:</td>
<td>${a} Lakhs</td>
</tr><tr><td>
Simple Interest :</td>
<td>${calc} Lakhs </td></tr>

<tr><td></td><td><%out.print("============="); %></td></tr>
<tr>
<td>Total Amount :</td>

<td>${amt} Lakhs</td></tr>
<tr><td></<td><td>
<%out.print("=============="); %></td>
</tr>
</table>
<%
int x,y,rw=4;
for(x=0;x<=rw;x++){
for(y=0;y<=x;y++){
	out.print("-*- ");
}out.println("<br>");
}
%>
</body>
</html>