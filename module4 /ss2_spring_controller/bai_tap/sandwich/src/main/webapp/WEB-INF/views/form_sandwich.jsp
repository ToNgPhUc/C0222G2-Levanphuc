<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/06/17
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="save" method="post">
    <fieldset>
        <legend>Sandwich Condiments</legend>
        <div>
            <input type="checkbox"value="Lettuce" name="condiment"> Lettuce
            <input type="checkbox"value="Tomato" name="condiment"> Tomato
            <input type="checkbox"value="Mustard" name="condiment"> Mustard
            <input type="checkbox"value="Sprouts" name="condiment"> Sprouts
        </div>
        <div><input type="submit"value="save"></div>

    </fieldset>
</form>
</body>
</html>
