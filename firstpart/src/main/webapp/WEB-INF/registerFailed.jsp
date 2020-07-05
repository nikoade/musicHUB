<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<html>
    <head>
        <title>Create Account</title>
    </head>

    <body>
    <h2></h2><br>
    <h1>The Name ${userName} Is Already In Use</h1>
    <p>Please enter proposed name and password.</p>
    <form action = "register" method = "POST">
        <label for="username">User Name:</label>
        <input id="username" type="text" name="username" placeholder="enter username" required><br><br>
        <label for="password">Password:</label>
        <input id="password" type="password" name="password" placeholder="enter password" required>
        <button type="submit">Login</button>
    </form>
    </body>
</html>