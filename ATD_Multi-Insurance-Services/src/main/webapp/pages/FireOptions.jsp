<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="com.insurance.ATD.FireInsurance.Firebean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FireInsurance</title>
</head>
<%
int i;
int j;
int row = 4;
for(i=0;i<=row;i++){
	for(j=0;j<=i;j++){
   out.print("-*- ");
%>
<% 
	}
	//out.println();
out.println("<br>");
	
}
%>
<body>
<h2>Select the fields from the following</h2>
<form action="fireinputs" method = "post">

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
</form>
<form action="firedetails" method = "get">
Please enter the unique id number sent to your registered number
My UID (as sent in mail): ATD- <input type = "text" name = "PolicyNumber">
<input type="submit" value="Submit" />
</form>

<%
 int a,b,rows=4;
for(i=rows;i>=0;i--){
		for(j=0;j<=i;j++){
		out.print("-*- ");
	}out.println("<br>");
}
%>

</body>
</html>