<html>
<heading><title>Sign Up Page</title></heading>
<body>
<form method="Post" action="signup">
Name: <input type="text" name="name">
Username: <input type="text" name="username">
Email: <input type="text" name="email">
<%
//email must contian @
%>
Password:<input type="text" name="password">
Reconfirm password:<input type="text" name="password2">
<%
//if(password==password2)

%>
Phone number: <input type="text" name="countrycode"> <input type="text" name="phoneno">
<% //check if number it ten digits
%>
  
Enter  your nationality:  <input type="text" name="nationality">
Enter  your email:  <input type="text" name="email">
Enter  your language of preference: <input type="text" name="language">
Enter  your date of birth:  <input type="date" name="dob">
Enter  your gender:  <input type="text" name="gender">
  
  
  
<input type="submit" value="Submit">
</form></body>
</html>
