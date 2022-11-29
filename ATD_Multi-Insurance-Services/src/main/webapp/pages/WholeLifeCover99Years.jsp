<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WholeLifeCover99Years</title>
</head>
<body>
<div style="background-image: url('https://img.freepik.com/free-vector/hand-painted-watercolor-pastel-sky-background_23-2148902771.jpg?w=2000');
  background-color: #cccccc; /* Used if the image is unavailable */
  height: 1500px; /* You must set a specified height */
  background-position: center; /* Center the image */
  background-repeat: no-repeat; /* Do not repeat the image */
  background-size: cover;" >
<h1 style= "color:red">ATD Insurances</h1>

<form align="center" method="post" action="fromWholeLife">
<table align="center">
<h2 align="center">Welcome to Policy </h2>
<h3 align="center" style="color:blue">Please search policy tenure</h3>

<tr><td>Policy Type:</td>
<td>
<select type = "select" id="001" name="policyType">
<option value="policyType">Policy Type</option>
<option value="Whole Life Cover for 99 years">Life Cover for 99 years</option>
<option value="Life cover for 5 Years">Life cover for 5 Years</option>
<option value="Life cover for 2 Years">Life cover for 2 Years</option>
<option value="Life cover for 1 Year">Life cover for 1 Year</option>
</select>
</td></tr>
<tr><td>Policy Amount per month:</td>
<td>
<select type = "select" id="002" name="policyAmountPerMonth">
<option value="policyAmountPerMonth">Policy Amount per month</option>
<option value="300">3000</option>
<option value="4500">4500</option>
<option value="2500">2500</option>
<option value="1500">1500</option>
</select>
</td></tr>
<tr><td>Instalment Process:</td>
<td>
<select type = "select" id="003" name="instalmentProcess">
<option value="instalmentProcess">Instalment Process</option>
<option value="99 years"> Total Payment</option>
<option value="5 Years">12 months</option>
<option value="2 Years">24 months</option>
<option value="1 Year">48 months</option>
</select>
</td></tr>
<tr><td>Policy Tenure:</td>
<td>
<select type = "select" id="004" name="policyTenure">
<option value="policyTenure">Policy Tenure</option>
<option value="99 Years">99 Years</option>
<option value="5 Years">5 Years</option>
<option value="2 Years">2 Years</option>
<option value="1 Year">1 Year</option>
</select>
</td></tr>
<tr><td>
<script>
var policyType = document.getElementById('001');
var policiAmount = document.getElementById('002');
var instalmentProcess = document.getElementById('003');
var policyTenure = document.getElementById('004)');

policyType.addEventListener('change',function(e){
//alert(this.value);
if(this.value=='Whole Life Cover for 99 years'){
	policyTenure.innerHTML="99 Years"
		
}else if(this.value=='Life cover for 5 Years'){
	policyTenure.innerHTML="5 Years"
}else if(this.value=='Life cover for 2 Years'){
	policyTenure.innerHTML="2 Years"
}else(this.value=='Life cover for 1 Year'){
	policyTenure.innerHTML="1 year"
}
})
</script>

<h3>Total policy amount to be paid: </h3>
</td></tr>
<tr><td>
<input type="submit" value="Take Policy" />
</td></tr>
<h2 align="left" style="color:blue"> Life Cover in Flexible Years </h2><br><h4 align="left">To get cover for a limited period or for your entire<br> lifetime of up to in Flexible years.</h4>

</table>
</form>
</div>
</body>
</html>