<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Driver sign up Page</title>
    </head>
    <body>
        <form action="signupd" method="POST">
            Username:<input type="text" name="username"><br/>
            Name:<input type="text" name="name"><br/>
            Password:<input type="password" name="password"><br/>
            Email-ID:<input type="text" name="email"><br/>
            Phone number:<input type="text" name="phone"><br/>
            <%
            //check if no is 10 digits
            %>
            Language of preference:<input type="text" name="language">
            Liscense number:<input type="text" name="lic">
            Car registeration number:<input type="text" name="regno">
            <input type="submit" value="Submit"><br/>
        </form>
    </body>
</html>
