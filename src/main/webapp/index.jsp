<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/index.css">
</head>
<body>
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

<!-- Banner -->
<div class="container my-4">
    <div class="row g-3">
        <div class="col-md-8">
            <img src="./images/vinh-Ha-Long.jpg" class="img-fluid rounded" alt="Main Event" />
        </div>
        <div class="col-md-4 d-flex flex-column gap-3">
            <img src="./images/India.jpg" class="img-fluid rounded" alt="Sub Event 1" />
            <img src="./images/Berlin.jpg" class="img-fluid rounded" alt="Sub Event 2" />
        </div>
    </div>
</div>

<!-- Events Section -->
<div class="container event-section">
    <ul class="nav nav-tabs mb-3" id="eventTabs">
        <li class="nav-item">
            <a class="nav-link active" href="#">Sắp diễn ra</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Đang diễn ra</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Mới đăng</a>
        </li>
    </ul>
    <div class="row g-3">
        <!-- Event Card -->
        <div class="col-md-3">
            <div class="card event-card">
                <img src="./images/Canh_quan_nui_non.jpg" class="card-img-top" alt="Event 1">
                <div class="card-body">
                    <h5 class="card-title">Du lịch núi non</h5>
                    <p class="event-info">📅 08/05/2025<br>🕒 19:30 - 22:30<br>🌐 Online</p>
                    <p class="price">Giá từ: <del>39.000.000đ</del></p>
                    <p class="price">Giá khuyến mãi: <strong>29.000.000đ</strong></p>
                </div>
                <div class="card-footer d-flex justify-content-between align-items-center">
                    <a href="/events" class="btn btn-primary">Đăng ký</a>
                    <span class="badge bg-success">Mới</span>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card event-card">
                <img src="./images/Thanh_pho con_kenh.jpg" class="card-img-top" alt="Event 2">
                <div class="card-body">
                    <h5 class="card-title">Du lịch thành phố con kênh</h5>
                    <p class="event-info">📅 08/05/2025<br>🕒 19:30 - 22:30<br>🌐 Online</p>
                    <p class="price">Giá từ: <del>39.000.000đ</del></p>
                    <p class="price">Giá khuyến mãi: <strong>29.000.000đ</strong></p>
                </div>
                <div class="card-footer d-flex justify-content-between align-items-center">
                    <a href="/events" class="btn btn-primary">Đăng ký</a>
                    <span class="badge bg-success">Mới</span>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card event-card">
                <img src="./images/Toa_thap.jpg" class="card-img-top" alt="Event 3">
                <div class="card-body">
                    <h5 class="card-title">du lịch các tòa tháp</h5>
                    <p class="event-info">📅 12/05/2025<br>🕒 19:30 - 22:30<br>🌐 Online</p>
                    <p class="price">Giá từ: <del>39.000.000đ</del></p>
                    <p class="price">Giá khuyến mãi: <strong>29.000.000đ</strong></p>
                </div>
                <div class="card-footer d-flex justify-content-between align-items-center">
                    <a href="/events" class="btn btn-primary">Đăng ký</a>
                    <span class="badge bg-success">Mới</span>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card event-card">
                <img src="./images/Cac_Hon_Dao.jpg" class="card-img-top" alt="Event 4">
                <div class="card-body">
                    <h5 class="card-title">Du lịch các hoàn đảo</h5>
                    <p class="event-info">📅 14/05/2025<br>🕒 19:30 - 22:00<br>🌐 Online</p>
                    <p class="price">Giá từ: <del>39.000.000đ</del></p>
                    <p class="price">Giá khuyến mãi: <strong>29.000.000đ</strong></p>
                </div>
                <div class="card-footer d-flex justify-content-between align-items-center">
                    <a href="/events" class="btn btn-primary">Đăng ký</a>
                    <span class="badge bg-success">Mới</span>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card event-card">
                <img src="./images/Cac_Hon_Dao.jpg" class="card-img-top" alt="Event 4">
                <div class="card-body">
                    <h5 class="card-title">Du lịch các hoàn đảo</h5>
                    <p class="event-info">📅 14/05/2025<br>🕒 19:30 - 22:00<br>🌐 Online</p>
                    <p class="price">Giá từ: <del>39.000.000đ</del></p>
                    <p class="price">Giá khuyến mãi: <strong>29.000.000đ</strong></p>
                </div>
                <div class="card-footer d-flex justify-content-between align-items-center">
                    <a href="/events" class="btn btn-primary">Đăng ký</a>
                    <span class="badge bg-success">Mới</span>
                </div>
            </div>
        </div>
        <div class="col-md-3">
            <div class="card event-card">
                <img src="./images/Cac_Hon_Dao.jpg" class="card-img-top" alt="Event 4">
                <div class="card-body">
                    <h5 class="card-title">Du lịch các hoàn đảo</h5>
                    <p class="event-info">📅 14/05/2025<br>🕒 19:30 - 22:00<br>🌐 Online</p>
                    <p class="price">Giá từ: <del>39.000.000đ</del></p>
                    <p class="price">Giá khuyến mãi: <strong>29.000.000đ</strong></p>
                </div>
                <div class="card-footer d-flex justify-content-between align-items-center">
                    <a href="/events" class="btn btn-primary">Đăng ký</a>
                    <span class="badge bg-success">Mới</span>
                </div>
            </div>
        </div>
        <div class="col-md-3">
            <div class="card event-card">
                <img src="./images/Cac_Hon_Dao.jpg" class="card-img-top" alt="Event 4">
                <div class="card-body">
                    <h5 class="card-title">Du lịch các hoàn đảo</h5>
                    <p class="event-info">📅 14/05/2025<br>🕒 19:30 - 22:00<br>🌐 Online</p>
                    <p class="price">Giá từ: <del>39.000.000đ</del></p>
                    <p class="price">Giá khuyến mãi: <strong>29.000.000đ</strong></p>
                </div>
                <div class="card-footer d-flex justify-content-between align-items-center">
                    <a href="/events" class="btn btn-primary">Đăng ký</a>
                    <span class="badge bg-success">Mới</span>
                </div>
            </div>
        </div>
        <div class="col-md-3">
            <div class="card event-card">
                <img src="./images/Cac_Hon_Dao.jpg" class="card-img-top" alt="Event 4">
                <div class="card-body">
                    <h5 class="card-title">Du lịch các hoàn đảo</h5>
                    <p class="event-info">📅 14/05/2025<br>🕒 19:30 - 22:00<br>🌐 Online</p>
                    <p class="price">Giá từ: <del>39.000.000đ</del></p>
                    <p class="price">Giá khuyến mãi: <strong>29.000.000đ</strong></p>
                </div>
                <div class="card-footer d-flex justify-content-between align-items-center">
                    <a href="/events" class="btn btn-primary">Đăng ký</a>
                    <span class="badge bg-success">Mới</span>
                </div>
            </div>
        </div>
    </div>

</div>
<!-- Footer -->
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

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"
        crossorigin="anonymous"></script>
</body>
</html>