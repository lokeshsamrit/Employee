<html>
<head>
<title>Login Form</title>
</head>
<body>
<h1><u>GET EMPLOYEE FORM</u></h1>
<form action="/get">
<table>

<tr>
<td>UserID</td>
<td><input type="text" name="getid"></td>
</tr>


<tr>

<td><input type="submit" value="GetOne" name="getone"></td>
<td><input type="submit" value="GetAll" name="getall"></td>
</tr>

<tr>
<td>Single User</td>
</tr>
<tr>
<td>${name}</td></br>
<td>${mname}</td></br> 
<td>${lname}</td></br>
<td>${designamtion}</td></br> 
<td>${salary}</td></br>
</tr>


</table>

</form>
</body>
</html>