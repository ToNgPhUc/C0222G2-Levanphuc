<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/06/04
  Time: 18:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.css">
    <style>
        * {
            padding: 0;
            border: none;
            margin: 0;
            box-sizing: border-box !important;
        }

        #menu {
            width: 100%;
            height: 800px;
            background: url("https://asiky.com/files/images/Article/asiky-website-khach-san/chiem-nguong-ve-dep-cua-khach-san-7-sao.jpg")
        }
    </style>
</head>
<body>
<div class="container-fluid" id="menu">
    <div id="" class="container-fluid">
        <div class="container-fluid" style="width: 100%">
            <a href="/Employee?action=create">
                <button type="submit" class="btn btn-success ">CREATE</button>
            </a>
            <a href="http://localhost:8080/">
                <button type="button" class="btn btn-success">GO BACK HOME</button>
            </a>


            <nav id="nav" class="navbar navbar-light">

                <form method="get" action="/Employee" class="d-flex">
                    <input type="text" name="action" value="search" hidden>
                    <input name="employeeSearch" value="${employeeSearch}" class="form-control me-2" type="search"
                           placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>

            </nav>
        </div>
    </div>
    <div class="container-fluid">
        <h2 style="text-align: center;color: brown">Employee List</h2>
        <table id="tableStudent" class="table table-dark table-borderless w-25"
               style="overflow: auto !important; position: relative; left: 0; font-size: 14px !important; margin: 0 auto !important;">
            <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Birthday</th>
                <th>Id Card</th>
                <th>Salary</th>
                <th>Phone</th>
                <th>Email</th>
                <th>Address</th>
                <th>positionId</th>
                <th>educationDegreeId</th>
                <th>divisionId</th>
                <th>userName</th>
                <%--            <th>status</th>--%>
                <th>EDIT</th>
                <th>DELETE</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${employeeList}" var="employee">
                <tr>
                    <td>${employee.employeeId}</td>
                    <td>${employee.employeeName}</td>
                    <td>${employee.employeeBirthday}</td>
                    <td>${employee.employeeIdCard}</td>
                    <td>${employee.employeeSalary}</td>
                    <td>${employee.employeePhone}</td>
                    <td>${employee.employeeEmail}</td>
                    <td>${employee.employeeAddress}</td>


                    <c:forEach var="position" items="${positionList}">
                        <c:if test="${position.positionId==employee.positionId}">
                            <td>${position.positionName}</td>
                        </c:if>
                    </c:forEach>

                    <c:forEach var="educationDegree" items="${educationDegreeList}">
                        <c:if test="${educationDegree.educationDegreeId==employee.educationDegreeId}">
                            <td>${educationDegree.educationDegreeName}</td>
                        </c:if>
                    </c:forEach>

                    <c:forEach var="division" items="${divisionList}">
                        <c:if test="${division.divisionId==employee.divisionId}">
                            <td>${division.divisionName}</td>
                        </c:if>
                    </c:forEach>

                    <c:forEach var="user" items="${userList}">
                        <c:if test="${user.userName==employee.userName}">
                            <td>${user.userName}</td>
                        </c:if>
                    </c:forEach>
                    <td><a href="/Employee?action=edit&employee_id=${employee.employeeId}"><button class="btn btn-success " type="button">Edit</button></a>



                    <!-- Button trigger modal -->
                    <td>
                        <button type="button" class="btn btn-success " data-bs-toggle="modal" data-bs-target="#exampleModal">Delete</button>
                    </td>


                    <!-- Modal -->
                    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
                         aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal"
                                            aria-label="Close"></button>
                                </div>
                                <div class="modal-body">
                                    bạn thực sự muốn xóa chứ
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-success " data-bs-dismiss="modal">Close</button>
                                    <a href="/Employee?action=delete&employee_id=${employee.employeeId}"><button type="button" class="btn btn-success ">Save changes</button></a>

                                </div>
                            </div>
                        </div>
                    </div>




                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>


</body>

<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../datatables/js/jquery.dataTables.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableStudent').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 4
        })
    })
</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
