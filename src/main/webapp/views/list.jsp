<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/9/2025
  Time: 8:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<style>

</style>
<body>
<h1>Booking Tickets</h1>
<div align="center">
    <table border="1" cellpadding="5">
        <tr>
            <th>Name</th>
            <th>Price </th>
            <th>Mã ID </th>
            <th>Ngay khởi hành</th>
            <th>Chỗ </th>
        </tr>
        <c:forEach items="${ListTour}" var="item">
            <tr>
                <td><c:out value="${item.name}" /></td>
                <td><c:out value="${item.price}" /></td>
                <td><c:out value="${item.id}" /></td>
                <td><c:out value="${item.date_start}" /></td>
                <td><c:out value="${item.places}" /></td>
            </tr>
        </c:forEach>
        <tr>
            <button>
                <a href="/events?action=Register">Đặt Ngay</a>
            </button>
        </tr>
    </table>
</div>
</body>
</html>
