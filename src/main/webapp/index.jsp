<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<style type="text/css">
    .login{
        height: 180px;
        width: 230px;
        padding: 10px;
        border: 1px #CCC solid;
    }
    .login{
        padding: 5px;
        margin: 51px;
    }
</style>
<body>
<form action="/login", method="post">
<div class="login">
    <h2>Login</h2>
    <input type="text", name="username", size="30", placeholder="username">
    <input type="text", name="passwold", size="30", placeholder="passwold">
    <input type="submit", value="sign in">
</div>
</form>
<br/>
</body>
</html>