<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/05/30
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<form method="post"action="/display-discount">

  <input type="text"name=" ProductDescription"placeholder="ProductDescription">
  <input type="text"name="ListPrice"placeholder="ListPrice">
  <input type="text"name="DiscountPercent"placeholder="DiscountPercent">
  <input type="submit"value="Calculate Discount">

</form>
  </body>
</html>
