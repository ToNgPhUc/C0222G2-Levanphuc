<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>TỜ KHAI BÁO Y TẾ</h3>
<h4>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ SẼ LIÊN LẠC KHI CẦN THIẾT ĐỀ PHÒNG CHỐNG DỊCH
    BÊNH TRUYỀN NHIỄM</h4>
<P>Khuyến cáo: Khai Báo Thông Tin Sai Là Vi Phạm Pháp Luật Việt Nam Và Có Thể Xử lí Hình Sự</P>
<form:form action="save" method="post" modelAttribute="medicalDeclaration">
    <table>
        <tr>

            <td>
                <form:label path="name">Họ Tên: (ghi chữ IN HOA)</form:label><br>
                <form:input type="text" path="name"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="birthday">Năm Sinh</form:label><br>
                <form:input type="date" path="birthday"/>
            </td>
            <td>
                <form:label path="gender">giới tính</form:label><br>
                <form:select path="gender">
                    <option value="nam">nam</option>
                    <option value="nữ">nữ</option>
                    <option value="khác">khác</option>
                </form:select>
            </td>
            <td>
                <form:label path="nationality">Quốc Tịch</form:label><br>
                <form:select path="nationality">
                    <option value="Việt Nam">việt nam</option>
                    <option value="nhật bản">nhật bản</option>
                    <option value="hàn quốc">hàn quốc</option>
                </form:select>
            </td>

        </tr>
        <tr>
            <td>
                <form:label path="idCard">sổ hộ chiếu hoặc số CMND hoặc giấy thông hành hộp pháp khác</form:label><br>
                <form:input path="idCard" type="text"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="vehicle">thông tin đi lại</form:label><br>
                <form:radiobutton path="vehicle" value="tàu bay"/>tàu bay

                <form:radiobutton path="vehicle" value="tàu thuyền"/> tàu thuyền

                <form:radiobutton path="vehicle" value="ô tô"/>ô tô

                <form:radiobutton path="vehicle" value="đi bộ"/> khác (ghi rõ)
            </td>
        </tr>
        <tr>
            <td><form:label path="vehicleNumber">số hiệu phương tiện</form:label><br>
                <form:input path="vehicleNumber" type="text" placeholder="vd: VN123"/>

            </td>
            <td><form:label path="seats">số ghế</form:label><br>
                <form:input path="seats" type="text"/>
            </td>

        </tr>
        <tr>
            <td><form:label path="departureDay">ngày khởi hành</form:label><br>
           <form:input path="departureDay" type="date"/>
            </td>
            <td><form:label path="endDate">ngày kết thúc</form:label><br>
                <form:input path="endDate" type="date" />
            </td>
        </tr>
        <tr>
            <td><form:label path="information">trong vòng 14 ngày qua anh/chị có đến tỉnh/ thành phố nào không</form:label><br>
                <form:textarea path="information"></form:textarea>
            </td>
        </tr>
    </table>
    <tr>
        <input type="submit"value="save" >
    </tr>

</form:form>

</body>
</html>
