<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/06/05
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        input {
            width: 100%;
            height: 50px;
            background: palegoldenrod;
            color: hotpink;

        }

        label {
            color: brown;
        }

        select {
            width: 100%;
            height: 50px;
            background: palegoldenrod;
            color: hotpink;
        }
        #menu{
            background: skyblue;
        }

    </style>
</head>
<body>


<div id="menu" class="container mt-3">

    <h2 style="text-align: center">EDIT CUSTOMER</h2>

    <form method="post" >


        <div class="mb-3 mt-3">
            <input type="text" name="customer_id" hidden value="${customer_id}">
        </div>

        <div class="mb-3 mt-3">
            <label>Type Id:</label>
            <select name="customer_type_id"  >
                <c:forEach items="${customerTypeList}" var="customerType">

                    <c:choose>
                        <c:when test="${customerType.customerTypeId == customer_type_id}">
                            <option value="${customerType.customerTypeId}" selected>
                                    ${customerType.customerTypeName}
                            </option>
                        </c:when>

                        <c:otherwise>
                            <option value="${customerType.customerTypeId}"> ${customerType.customerTypeName}</option>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </select>
        </div>

        <div class="mb-3">
            <label>Name:</label>
            <input type="text" name="customer_name" value="${customer_name}">
        </div>
        <div class="mb-3">
            <label>Birthday:</label>
            <input type="date" name="customer_birthday" value="${customer_birthday}">
        </div>
        <div class="mb-3">
            <label>Gender:</label>
            <select name="customer_gender">

                <c:if test="${customer_gender == 1}">
                    <option value="1" selected>nam</option>
                    <option value="0">nữ</option>
                </c:if>

                <c:if test="${customer_gender == 0}">
                    <option value="0" selected>nữ</option>
                    <option value="1">nam</option>
                </c:if>
            </select>
        </div>
        <div class="mb-3">
            <label>Id Card:</label>
            <input type="text" name="customer_id_card" value="${customer_id_card}">
        </div>
        <div class="mb-3">
            <label>Phone Number:</label>
            <input type="text" name="customer_phone" value="${customer_phone}">
        </div>
        <div class="mb-3">
            <label>Email:</label>
            <input type="text" name="customer_email" value="${customer_email}">
        </div>
        <div class="mb-3">
            <label>Address:</label>
            <input type="text" name="customer_address" value="${customer_address}">
        </div>

        <div class="mb-3">
            <label>status:</label>
            <select name="status">
                <c:if test="${status==0}">
                    <option value="0" selected>no delete</option>
                    <option value="1">delete</option>
                </c:if>

                <c:if test="${status==1}">
                    <option value="0">no delete</option>
                    <option value="1" selected>delete</option>
                </c:if>
            </select>

        </div>

            <input type="submit" value="submit">
            <a href="/Customer"><input type="button" value="BACK TO CUSTOMER LIST"></a>
    </form>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

</html>

