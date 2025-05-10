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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.13.1/font/bootstrap-icons.min.css">
</head>
<style>
    .price-box {
        background-color: #fff;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        padding: 20px;
    }

    .price {
        font-size: 28px;
        color: red;
        font-weight: bold;
    }

    .old-price {
        text-decoration: line-through;
        color: gray;
        font-size: 16px;
    }

    .schedule-box {
        background-color: #fff;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        padding: 20px;
        margin-top: 30px;
    }

    .highlight-red {
        color: red;
        font-weight: bold;
    }

    .bi {
        font-size: 20px;
        color: red;
    }
    .bi a {
        padding: 5px 5px;
        color: red;
        text-decoration: none;
    }

    body {
        background-color: #f8f9fa;
    }
    .navbar {
        background-color: #f44336;
    }
    .navbar-brand {
        font-weight: bold;
        color: white !important;
    }
    .btn-register {
        background-color: white;
        color: #f44336;
        font-weight: bold;
    }
</style>
<body class="bg-light">
<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Sukien.com</a>
        <form class="d-flex mx-auto w-50">
            <input class="form-control me-2" type="search" placeholder="Nhập tên sự kiện..." aria-label="Search">
        </form>
        <div>
            <a href="#" class="btn btn-light me-2">Đăng nhập</a>
            <a href="#" class="btn btn-register">ĐĂNG KÝ</a>
        </div>
    </div>
</nav>

<div class="container py-5">
    <nav class="mb-4 bi bi-arrow-bar-left">
        <a href="index.jsp">Quay lại</a>
    </nav>

    <h2 class="mb-4"></h2>
    <div class="row g-4">
        <div class="col-md-8">
            <div class="row g-2">
                <div class="col-3">
                    <img src="./images/Toa_thap.jpg" class="img-fluid rounded" alt="ảnh phụ 1">
                    <img src="./images/Toa_thap.jpg" class="img-fluid rounded mt-2" alt="ảnh phụ 2">
                    <img src="./images/Toa_thap.jpg" class="img-fluid rounded mt-2" alt="ảnh phụ 3">
                </div>
                <div class="col-9">
                    <img src="./images/Toa_thap.jpg" class="img-fluid rounded" alt="ảnh chính">
                </div>
            </div>
        </div>


        <div class="row g-4">
            <c:forEach var="tour" items="${ListTour}">
                <div class="col-md-4">
                    <div class="price-box mb-4">
                        <img src="${tour.images}" class="img-fluid rounded mb-3" alt="Hình ảnh tour">
                        <div class="old-price">33.000.000đ/ Khách</div>
                        <div class="price">${tour.price}đ/ Khách</div>
                        <ul class="list-unstyled">
                            <li><strong>Mã tour:</strong> ${tour.id}</li>
                            <li><strong>Khởi hành:</strong> ${tour.address}</li>
                            <li><strong>Ngày:</strong> ${tour.date_start}</li>
                            <li><strong>Số chỗ còn:</strong> ${tour.places}</li>
                        </ul>
                        <div class="d-grid">
                            <a href="#">
                                <button class="btn btn-danger w-100">Đặt ngay</button>
                            </a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>

</div>
<footer class="bg-dark text-light pt-4 mt-5">
    <div class="container">
        <div class="row">
            <!-- Giới thiệu -->
            <div class="col-md-4">
                <h5>Sukien.com</h5>
                <p>Chuyên trang tổ chức và giới thiệu các sự kiện học tập, đào tạo trực tuyến chất lượng cao với sự
                    góp mặt của các chuyên gia hàng đầu.</p>
            </div>

            <!-- Liên kết nhanh -->
            <div class="col-md-4">
                <h5>Liên kết nhanh</h5>
                <ul class="list-unstyled">
                    <li><a href="#" class="text-light text-decoration-none">Trang chủ</a></li>
                    <li><a href="#" class="text-light text-decoration-none">Sự kiện sắp diễn ra</a></li>
                    <li><a href="#" class="text-light text-decoration-none">Đăng ký</a></li>
                    <li><a href="#" class="text-light text-decoration-none">Liên hệ</a></li>
                </ul>
            </div>

            <!-- Thông tin liên hệ -->
            <div class="col-md-4">
                <h5>Liên hệ</h5>
                <p>Email: hotro@sukien.net</p>
                <p>Điện thoại: 0123 456 789</p>
                <p>Địa chỉ: 123 Đường Công nghệ, Quận AI, TP. HCM</p>
            </div>
        </div>
        <hr class="bg-light" />
        <div class="text-center pb-3">
            © 2025 Sukien.com. Đặt vé du lịch.
        </div>
    </div>
</footer>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>