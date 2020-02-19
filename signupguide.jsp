<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign up for Guide</title>
    </head>
    <body>
        <h1>Sign Up</h1>
        <form action="signupg" method="POST">
            Enter your name: <input type="text" name="name"><br/>
            Enter a username: <input type="text" name="username">
            
           Enter your password: <input type="password" name="password">
           Enter your language: <input type="text" name="lamguage">
           Enter your email : <input type="text" name="email">
           <%
           //check if email contains @
           %>
           Enter your phone number: <input type="text" name="phoneno"><br/>
        <input type="submit" value="Submit">
        </form>
    </body>
</html>
