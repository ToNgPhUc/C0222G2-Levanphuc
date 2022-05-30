<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/05/30
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Vietnamese Dictionary</h2>
  <form action="dictionary" method="post">
    <input type="text" name="search" placeholder="Enter your word: "/>
    <input type = "submit" id = "submit" value = "Search"/>
  </form>

  <h1>Result : ${result}</h1>
  <h1>Result : ${alert}</h1>
  </body>
</html>
