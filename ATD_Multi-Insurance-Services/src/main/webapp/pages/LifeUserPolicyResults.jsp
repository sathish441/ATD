<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LifeUserPolicyResults</title>
</head>
<body align="center">
<div style="background-image: url('https://img.freepik.com/premium-photo/soft-purple-watercolor-abstract-background_3590-213.jpg');
  background-color: #cccccc; /* Used if the image is unavailable */
  height: 1500px; /* You must set a specified height */
  background-position: center; /* Center the image */
  background-repeat: no-repeat; /* Do not repeat the image */
  background-size: cover;" >
<button><a href="home">Home</a></button>
<br><br><br><br><br>
<h2 style="color:red">Policy Holder Details</h2>
<h2 style="color:blue">${searchResult1}</h2><br>
<h2 style="color:red">Policy Details</h2>
<h2 style="color:blue">${searchResult2}</h2>

</div>
</body>
</html>