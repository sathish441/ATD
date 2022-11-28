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
int row = 3;
for(i=0;i<=row;i++){
	for(j=0;j<=i;j++){
   out.print("=|*|=> ");
%>
<% 
	}
	//out.println();
out.println("<br>");
}
%>
<body style = "background-image:url('https://www.pngitem.com/pimgs/m/11-117346_fire-transparent-background-hd-png-download.png');">
<br>
<h1 align ="center">| Fire Insurance Claims |</h1>
<h2>Select the fields from the following</h2>
Enter your data:
<form action="fireinputs" method = "post">
<table cellpadding = "5";">
<tr><td>
Materials Name : <input type = "text" name = "Materials"></td><td> 
<label for="Amount">Policy Amount</label> in Lakhs
      <select name="Amount" id="pa">
        <option value="select">Policy amount</option>
        <option value="120">120</option>
        <option value="150">150</option>
        <option value="170">170</option>
        <option value="200">200</option>
     
      </select>

  </td> <td>
      <label for="Tenure">Policy Tenure</label> in Lakhs
      <select name="Tenure" id="pa">
        <option value="select">Policy Tenure</option>
        <option value="3">3</option>
        <option value="6">6</option>
        <option value="9">9</option>
        <option value="12">12</option>
      </select>
      </td>
     <td>
      <label for="percentage">Percentage</label> in Lakhs
      <select name="percentage" id="pa">
        <option value="select">Percentage</option>
        <option value="5">5</option>
        <option value="7">7</option>
        <option value="9">9</option>
         <option value="10">10</option>
      </select>
      </td><td></td><td></td><td>
      <input type="submit" value="Submit" />
      </td></tr>
</form>
<tr><td>
</td></tr><tr><td>
<form action="firedetails" method = "get">
<br>

Please enter the unique id number sent to your registered number
</td></tr>
<tr><td>
My UID (as sent in mail): ATD- <input type = "text" name = "PolicyNumber">
</td><td>
<input type="submit" value="Submit" />
</td></tr>
</form>
<tr><td>
<form action="deletedetails" method = "post">
<br>
Please enter the unique id to cancel your policy:
</td></tr> <tr><td>
 UID (as sent in mail): ATD- <input type = "text" name = "PolicyNumber"></td><td>
<input type="submit" value="Submit" />
</td></tr>
</form>
<form action = "updatepolicy" method ="post">

</td></tr> <tr><td>
<br>
Update your policy :
</td></tr> <tr><td>
My UID (as sent in mail): ATD- <input type = "text" name = "PolicyNumber"></td>
<tr><td>
Materials Name : <input type = "text" name = "Materials"></td><td> 
<label for="Amount">Policy Amount</label> in Lakhs
      <select name="Amount" id="pa">
        <option value="select">Policy amount</option>
        <option value="120">120</option>
        <option value="150">150</option>
        <option value="170">170</option>
        <option value="200">200</option>
     
      </select>

  </td> <td>
      <label for="Tenure">Policy Tenure</label> in Lakhs
      <select name="Tenure" id="pa">
        <option value="select">Policy Tenure</option>
        <option value="3">3</option>
        <option value="6">6</option>
        <option value="9">9</option>
        <option value="12">12</option>
      </select>
      </td>
     <td>
      <label for="percentage">Percentage</label> in Lakhs
      <select name="percentage" id="pa">
        <option value="select">Percentage</option>
        <option value="5">5</option>
        <option value="7">7</option>
        <option value="9">9</option>
         <option value="10">10</option>
      </select>
      </td><td></td><td></td><td>
      <input type="submit" value="Submit" />
      </td></tr>
</form>
<form action = "allresults" method = "get">
<tr><td><br>Click to check all the policies in DB:
<input type="submit" value="Submit" /></td></tr>
</form>
 <tr><td>
</tr>
</table>
<br>
<br>
<%
 int a,b,rows=3;
for(i=rows;i>=0;i--){
		for(j=0;j<=i;j++){
		out.print("=|*|=> ");
	}out.println("<br>");
}
%>

</body>
</html>