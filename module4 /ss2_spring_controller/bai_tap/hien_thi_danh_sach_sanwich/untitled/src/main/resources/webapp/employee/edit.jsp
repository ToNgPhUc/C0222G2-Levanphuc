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

        #menu {
            background: skyblue;
        }

    </style>
</head>
<body>


<div id="menu" class="container mt-3">

    <h2 style="text-align: center">EDIT EMPLOYEE</h2>

    <form method="post">


        <div class="mb-3 mt-3">
            <input type="text" name="employee_id" hidden value="${employee_id}">
        </div>


        <div class="mb-3">
            <label>Name:</label>
            <input type="text" name="employee_name" value="${employee_name}">
            <div class="text-black text-center bg-warning">${errMap.errEmployeeName}</div>
        </div>

        <div class="mb-3">
            <label>Birthday:</label>
            <input type="date" name="employee_birthday" value="${employee_birthday}">
            <div class="text-black text-center bg-warning">${errMap.errEmployeeBirthday}</div>

        </div>

        <div class="mb-3">
            <label>employee id card:</label>
            <input type="text" name="employee_id_card" value="${employee_id_card}">
            <div class="text-black text-center bg-warning"> ${errMap.errEmployeeIdCard}</div>
        </div>

        <div class="mb-3">
            <label>employee_salary:</label>
            <input type="text" name="employee_salary" value="${employee_salary}">
            <div class="text-black text-center bg-warning"> ${errMap.errEmployeeSalary}</div>

        </div>
        <div class="mb-3">
            <label>phone:</label>
            <input type="text" name="employee_phone" value="${employee_phone}">
            <div class="text-black text-center bg-warning">${errMap.errEmployeePhone}</div>
        </div>
        <div class="mb-3">
            <label>email:</label>
            <input type="text" name="employee_email" value="${employee_email}">
            <div class="text-black text-center bg-warning">${errMap.errEmployeeEmail}</div>

        </div>
        <div class="mb-3">
            <label>Address:</label>
            <input type="text" name="employee_address" value="${employee_address}">

            <div class="text-black text-center bg-warning">${errMap.errEmployeeAddress}</div>

        </div>


        <div class="mb-3 mt-3">
            <label>Type Id:</label>
            <select name="position_id">
                <c:forEach items="${positionList}" var="position">

                    <c:choose>
                        <c:when test="${position.positionId == position_id}">
                            <option value="${position.positionId}"
                                    selected> ${position.positionName}</option>
                        </c:when>
                        <c:otherwise>
                            <option value="${position.positionId}"> ${position.positionName}</option>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </select>
        </div>

        <div class="mb-3 mt-3">
            <label>education Degree:</label>
            <select name="education_degree_id">
                <c:forEach items="${educationDegreeList}" var="educationDegree">

                    <c:choose>
                        <c:when test="${educationDegree.educationDegreeId == education_degree_id}">
                            <option value="${educationDegree.educationDegreeId}"
                                    selected> ${educationDegree.educationDegreeName}</option>
                        </c:when>
                        <c:otherwise>
                            <option value="${educationDegree.educationDegreeId}"> ${educationDegree.educationDegreeName}</option>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </select>
        </div>

        <div class="mb-3 mt-3">
            <label>division:</label>
            <select name="division_id">
                <c:forEach items="${divisionList}" var="division">

                    <c:choose>
                        <c:when test="${division.divisionId == division_id}">
                            <option value="${division.divisionId}"
                                    selected> ${division.divisionName}</option>
                        </c:when>
                        <c:otherwise>
                            <option value="${division.divisionId}"> ${division.divisionName}</option>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </select>
        </div>

        <div class="mb-3">
            <label for="">User Name: </label>
            <select name="user_name" id="">
                <c:forEach items="${userList}" var="user">
                    <option value="${user.userName}">${user.userName}</option>
                </c:forEach>
            </select>
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
        <a href="/Employee"><input type="button" value="BACK TO EMPLOYEE LIST"></a>
    </form>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

</html>

