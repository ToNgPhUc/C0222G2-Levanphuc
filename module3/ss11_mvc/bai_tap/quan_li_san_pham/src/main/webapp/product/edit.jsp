<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/06/02
  Time: 1:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<fieldset>
    <form action="/Product?action=edit" method="post">
        <legend>EDIT PRODUCT</legend>
        <table>

            <tr>
                <td><input type="text"name="id"value="${product.getId()}"></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text"name="name"value="${product.getName()}"></td>
            </tr>

            <tr>
                <td>Prince</td>
                <td><input type="text"name="prince"value="${product.getPrince()}"></td>
            </tr>
            <tr>
                <td>  <a href="/Product">Back to product list</a></td>
                <td><input type="submit" value="edit product"></td>
            </tr>
        </table>
    </form>

</fieldset>
</body>
</html>
