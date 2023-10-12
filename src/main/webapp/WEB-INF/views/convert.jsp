<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/12/2023
  Time: 3:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Change</title>
</head>
<body>
<h2> USD to VND</h2>
<form action="convert" method="post">
    USD Amount: <input type="text" name="usd" required/><br>
    Exchange Rate <input type="text" name="exchange_Rate" required/><br>
    <input type="submit" value="Convert">
</form>
</body>
</html>
