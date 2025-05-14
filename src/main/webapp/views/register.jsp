<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/12/2025
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.13.1/font/bootstrap-icons.min.css">
</head>
<style>
    .booking-steps {
        display: flex;
        justify-content: center;
        align-items: center;
        gap: 20px;
        margin-bottom: 40px;
    }
    .step {
        text-align: center;
    }
    .step-icon {
        width: 80px;
        height: 80px;
        background-color: #ddd;
        border-radius: 50%;
        display: flex;
        align-items: center;
        justify-content: center;
        margin-bottom: 15px;
        margin-left: 10px;
    }
    .step.active .step-icon {
        background-color: #0d6efd;
    }
    .step-arrow {
        font-size: 24px;
        color: blue;
    }
    .step-title {
        font-weight: bold;
        color: #666;
    }
    .step.active .step-title {
        color: #0d6efd;
    }
    .row #btn {
        display: flex;
        justify-content: center;
        align-items: center;
        margin-top: 20px;
    }
</style>
<body>
<div class="container py-5">
    <nav class="mb-4">
        <a href="#" class="text-decoration-none bi-arrow-left-square"> Quay lại</a>
    </nav>
    <h2 class="mb-4 text-center text-primary fw-bold">ĐẶT TOUR</h2>
    <div class="booking-form">
        <div class="booking-steps">
            <div class="step active">
                <div class="step-icon">
                    <img src="./access/document.png" alt="Nhập thông tin" width="40">
                </div>
                <div class="step-title">NHẬP THÔNG <br>TIN</div>
            </div>
            <div class="step-arrow">
                <i class="bi bi-arrow-right-square-fill"></i>
            </div>
            <div class="step">
                <div class="step-icon">
                    <img src="./access/payment-method.png" alt="Thanh toán" width="40">
                </div>
                <div class="step-title">THANH TOÁN</div>
            </div>
            <div class="step-arrow">
                <i class="bi bi-arrow-right-square-fill"></i>
            </div>
            <div class="step">
                <div class="step-icon">
                    <img src="./access/ewallet.png" alt="Hoàn tất" width="40">
                </div>
                <div class="step-title">HOÀN TẤT</div>
            </div>
        </div>
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body">
                        <form method="POST">
                            <c:if test="${id_tour != null}" >
                                <input type="hidden" name="id_tour" id="id_tour" value="<c:out value='${id_tour}'/>" />
                            </c:if>
                            <div class="mb-3">
                                <label for="name" class="form-label">Họ và tên</label>
                                <input type="text" class="form-control" id="name" name="name" required>
                            </div>
                            <div class="mb-3">
                                <label for="email" class="form-label">Email</label>
                                <input type="email" class="form-control" id="email" name="email" required>
                            </div>
                            <div class="mb-3">
                                <label for="phone" class="form-label">Số điện thoại</label>
                                <input type="tel" class="form-control" id="phone" name="phone" required>
                            </div>
                            <div class="mb-3">
                                <label for="ticketType" class="form-label">Loại vé</label>
                                <select class="form-select" id="ticketType" name="ticketType" required>
                                    <option value="" selected disabled>Chọn loại vé</option>
                                    <option value="adult">Người lớn (Trên 12 tuổi)</option>
                                    <option value="child">Trẻ em (Dưới 12 tuổi)</option>
                                </select>
                            </div>
                            <div class="mb-3">
                                <label for="places" class="form-label">Số lượng chỗ</label>
                                <input type="number" class="form-control" id="places" name="places" min="1" max="10" required>
                            </div>
                        </form>
                        <a href="/events?action=Payment&code=" class="text-decoration-none" id="btn">
                            <button type="submit" class="btn btn-primary">Thanh toán</button>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
