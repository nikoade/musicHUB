<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<html>
    <head>
        <title>Information Incorrect</title>
    </head>

    <body>
        <h2>Please Try Again</h2><br>
        <p>Either your user name or password is incorrect.Please try again.</p>
        <form action = "login" method = "POST">
            <label for="username">User Name:</label>
            <input id="username" type="text" name="username" placeholder="enter username" required><br><br>
            <label for="password">Password:</label>
            <input id="password" type="password" name="password" placeholder="enter password" required>
            <button type="submit">Login</button>
        </form>
        <a href = "register">Create New Account</a>
    </body>
</html>