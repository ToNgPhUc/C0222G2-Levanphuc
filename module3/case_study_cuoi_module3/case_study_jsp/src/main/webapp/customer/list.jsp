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
        #menu {
            width: 100%;
            height: 800px;
            background: url("https://asiky.com/files/images/Article/asiky-website-khach-san/chiem-nguong-ve-dep-cua-khach-san-7-sao.jpg")
        }
    </style>
</head>
<body>

<div id="menu" class="col-lg-12">


    <div class="container-fluid" style="width: 100%">
        <a href="/Customer?action=create">
            <button type="submit" class="btn btn-success ">CREATE</button>
        </a>


        <a href="http://localhost:8080/">
            <button type="button" class="btn btn-success ">GO BACK HOME</button>
        </a>


        <nav id="nav" class="navbar navbar-light">

            <form method="get" action="/Customer" class="d-flex">
                <input type="text" name="action" value="search" hidden>
                <input name="customerSearch" value="${customerSearch}" class="form-control me-2" type="search"
                       placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>

        </nav>
    </div>

    <h2 style="text-align: center;color: brown">CUSTOMER LIST</h2>
    <table id="tableStudent" class="table table-dark table-borderless" style="width: 100%">
        <thead>
        <tr>
            <th>Id</th>
            <th>Type</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>Gender</th>
            <th>IdCard</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <%--            <th>Status</th>--%>
            <th>EDIT</th>
            <th>DELETE</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${customerList}" var="customer">
            <tr>
                <td>${customer.customerId}</td>

                <c:forEach var="customerType" items="${customerTypeList}">
                    <c:if test="${customer.customerTypeId==customerType.customerTypeId}">
                        <td>${customerType.customerTypeName}</td>
                    </c:if>
                </c:forEach>

                <td>${customer.customerName}</td>
                <td>${customer.customerBirthday}</td>


                <c:if test="${customer.customerGender==1}">
                    <td> nam</td>
                </c:if>
                <c:if test="${customer.customerGender==0}">
                    <td> nữ</td>
                </c:if>

                <td>${customer.customerIdCard}</td>
                <td>${customer.customerPhone}</td>
                <td>${customer.customerEmail}</td>
                <td>${customer.customerAddress}</td>

                    <%--                <c:if test="${customer.status==0}">--%>
                    <%--                    <td>chưa xóa</td>--%>
                    <%--                </c:if>--%>
                    <%--                <c:if test="${customer.status==1}">--%>
                    <%--                    <td> đã xóa</td>--%>
                    <%--                </c:if>--%>


                <td><a href="/Customer?action=edit&customer_id=${customer.customerId}">
                    <button class="btn btn-success " type="button">Edit</button>
                </a></td>

                <!-- Button trigger modal -->
                <td>
                    <button type="button" class="btn btn-success " data-bs-toggle="modal" data-bs-target="#exampleModal${customer.customerId}">Delete</button>
                </td>


                <div class="modal fade" id="exampleModal${customer.customerId}" tabindex="-1" aria-labelledby="exampleModalLabel"
                     aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel ">Modal title</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal"
                                        aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                bạn muốn xóa mục có id la ${customer.customerId} không ?
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-success " data-bs-dismiss="modal">No</button>
                                <a href="/Customer?action=delete&customer_id=${customer.customerId}"><button type="button" class="btn btn-success "> Yes </button></a>

                            </div>
                        </div>
                    </div>
                </div>

            </tr>
        </c:forEach>
        </tbody>
    </table>
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
            "pageLength": 5
        })
    })
</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
