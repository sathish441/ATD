<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fire Insurance</title>
</head>
<body>
<form action="fireinput" method = "post">
Materials Insured: <input type = "text" name="Materials">
      <label for="pt">Policy Tenure</label>
      <select name="Tenure" id="pa">
        <option value="select">Policy Tenure</option>
        <option value="3">3</option>
        <option value="6">6</option>
        <option value="9">9</option>
      </select>
      
      <br/>
  <label for="pa">Policy Amount</label>
      <select name="Amount" id="pa">
        <option value="select">Policy amount</option>
        <option value="120">120</option>
        <option value="150">150</option>
        <option value="170">170</option>
      </select>

      <br/>
      <label for="perc">Percentage</label>
      <select name="percentage" id="pa">
        <option value="select">Percentage</option>
        <option value="5">5</option>
        <option value="7">7</option>
      </select>
      <input type="submit" value="Submit" />
</form>


</body>
</html>