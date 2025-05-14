<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Chi tiết booking</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h3 class="mb-4">THÔNG TIN ĐẶT CHỖ</h3>

    <div class="row">
        <c:forEach var="item" items="code">
            <div class="col-md-6">
                <h5>CHI TIẾT BOOKING</h5>
                <p>Mã đặt chỗ: <span class="text-danger">${item.bookingId}</span></p>
                <p>Ngày tạo: ${item.dateBook}</p>
                <p>Loại vé: ${item.tickets}</p>
                <p>Trạng thái: <span class="text-primary">${item.state}</span></p>
            </div>

            <div class="col-md-6">
                <h5>THÔNG TIN CHUYẾN ĐI</h5>
                <p>Tên tour: ${item.tourName}</p>
                <p>Mã tour: ${item.tourId}</p>
                <p>Ngày đi: ${item.dateStart}</p>
                <p>Ngày về: ${item.dateEnd}</p>
                <p>Khách hàng: ${item.customerName} - ${item.email}</p>
                <p>SĐT: ${item.phone}</p>
            </div>
        </c:forEach>
    </div>
</div>
</body>
</html>
