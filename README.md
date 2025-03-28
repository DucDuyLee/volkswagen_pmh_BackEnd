 Car API Backend

 Giới thiệu
Dự án này cung cấp API cho hệ thống quản lý thông tin về các dòng xe, phiên bản xe, thông số kỹ thuật, tin tức xe và các danh mục liên quan.

 Công nghệ sử dụng
- Spring Boot
- MySQL
- Spring Security
- JPA (Hibernate)
- BCrypt Password Encoder

 Cấu hình CORS
Backend hỗ trợ CORS để frontend có thể truy cập từ một cổng khác. Cấu hình mặc định cho phép truy cập từ `http://localhost:5137`. Nếu muốn thay đổi, hãy chỉnh sửa trong `SecurityConfig.java`.

 Hướng dẫn chạy dự án
1. Clone dự án về máy:
   git clone https://github.com/DucDuyLee/volkswagen_pmh_BackEnd
   
2. Cấu hình cơ sở dữ liệu trong `application.properties`:
   spring.datasource.url=jdbc:mysql://localhost:3306/volkswagen_pmh
   spring.datasource.username=root
   spring.datasource.password=yourpassword
  
3. Chạy ứng dụng bằng lệnh:
   mvn spring-boot:run

 Danh sách API

 1. API Quản trị viên
- Đăng nhập quản trị viên: `POST http://localhost:8080/api/admin/login`

 2. API Dòng xe
- Lấy tất cả dòng xe: `GET http://localhost:8080/api/car-models`
- Lấy dòng xe theo ID: `GET http://localhost:8080/api/car-models/{id}`

 3. API Tin tức xe
- Lấy tất cả tin tức xe: `GET http://localhost:8080/api/car-news`
- Lấy tin tức xe theo ID: `GET http://localhost:8080/api/car-news/{id}`

 4. API Thông số xe
- Lấy tất cả thông số xe: `GET http://localhost:8080/api/car-parameters`
- Lấy thông số xe theo modelId: `GET http://localhost:8080/api/car-parameters/model/{modelId}`

 5. API Phiên bản xe
- Lấy tất cả phiên bản xe: `GET http://localhost:8080/api/car-versions`
- Lấy danh sách phiên bản xe theo model ID: `GET http://localhost:8080/api/car-versions/model/{modelId}`

 6. API Mô tả dòng xe
- Lấy tất cả mô tả xe: `GET http://localhost:8080/api/car-model-descriptions`
- Lấy mô tả xe theo model ID: `GET http://localhost:8080/api/car-model-descriptions/model/{carModelId}`

 7. API Chi tiết xe
- Lấy tất cả chi tiết xe: `GET http://localhost:8080/api/car-details`
- Lấy chi tiết xe theo model: `GET http://localhost:8080/api/car-details/model/{modelId}`
- Lấy chi tiết xe theo danh mục: `GET http://localhost:8080/api/car-details/category/{categoryId}`

 8. API Danh mục chi tiết xe
- Lấy tất cả danh mục xe: `GET http://localhost:8080/api/car-detail-categories`

 9. API Mô tả chi tiết xe
- Lấy tất cả mô tả chi tiết xe: `GET http://localhost:8080/api/car-detail-descriptions`
- Lấy mô tả chi tiết xe theo ID xe: `GET http://localhost:8080/api/car-detail-descriptions/car-detail/{carDetailId}`

10. API Lấy chi tiết tất cả các xe
- Lấy chi tiết tất cả các xe: `GET http://localhost:8080/api/cars/all`
- Lấy chi tiết 5 xe đắt nhất: `GET http://localhost:8080/api/cars/top5-expensive`
- Lấy chi tiết xe theo id Car_version: `GET http://localhost:8080/api/cars/{id}`

 Bảo mật
Ứng dụng sử dụng `Spring Security` để bảo vệ các API quan trọng. Các API công khai có thể truy cập mà không cần đăng nhập, trong khi các API khác yêu cầu xác thực.

 Liên hệ
Nếu bạn có bất kỳ câu hỏi hoặc góp ý nào, vui lòng liên hệ qua email hoặc mở issue trên repository.

---
© 2025 Duy Châu. All rights reserved.

