<html>
<head>
<title>Login Form</title>
</head>
<body>
<h1>LOGIN FORM</h1>
<form action="/welcome">
<table>

<tr>
<td>UserName</td>
<td><input type="text" name="name"></td>
</tr>

<tr>
<td>Password</td>
<td><input type="text" name="password"></td>
</tr>

<tr>

<td><input type="submit" value="Login" name="login"></td>
<td><input type="submit" value="New User" name="newuser"></td>
</tr>

<tr>
<td>${errormessage} 
</td>
</tr>

</table>

</form>
</body>
</html>