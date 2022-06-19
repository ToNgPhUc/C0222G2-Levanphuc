<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Settings</h1>
<form:form action="save" method="post" modelAttribute="mailConfiguration">
    <table>
        <tr>
            <td><form:label path="language">Languages</form:label></td>
            <td><form:select path="language">
                <option value="english">english</option>
                <option value="Vietnamese">Vietnamese</option>
                <option value="Japanese">Japanese</option>
                <option value="Chinese">Chinese</option>
            </form:select>
            </td>
        </tr>

        <tr>
            <td><form:label path="pageSize">page Size</form:label></td>
            <td>
                <span>show</span>
                <form:select path="pageSize">
                    <option value="5">5</option>
                    <option value="10">10</option>
                    <option value="15">15</option>
                    <option value="20">20</option>
                    <option value="50">50</option>
                    <option value="100">100</option>
                </form:select>
                <span>email per page</span>
            </td>
        </tr>

        <tr>
            <td><form:label path="spamFilter" >spams filter</form:label></td>
<%--            <td><form:radiobutton path="spamFilter" value="" </td>--%>
            <td><form:checkbox path="spamFilter" value="Enable spams filter"/> Enable spams filter</td>
        </tr>

        <tr>
            <td><form:label path="signature">signature</form:label></td>
            <td><form:textarea path="signature"></form:textarea></td>
        </tr>
        <tr>
            <td>
                <input type="submit"value="save">
            </td>
            <td>
                <a href="/form"><button>cancel</button></a>
            </td>

        </tr>
    </table>
</form:form>
</body>
</html>
