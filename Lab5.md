# CÁC HỆ THỐNG CON CỦA HỆ THỐNG PAYROLL SYSTEM
## 1. Timecard Management System
- Chức năng chính:
  - Nhập, cập nhật, và quản lý thời gian làm việc của nhân viên.
  - Xác minh và phê duyệt timecard của nhân viên.
  - Báo cáo tổng thời gian làm việc theo ngày/tuần/tháng.
- Thành phần chính:
  - Giao diện nhập liệu cho nhân viên.
  - Module xác minh và phê duyệt.
  - Module lưu trữ và quản lý dữ liệu timecard.
- Biểu đồ ngữ cảnh:
  - ![Diagram](https://www.planttext.com/api/plantuml/png/UhzxVxHVnk55UGfbcOTNvSKgwEhQAMY4PEQc9YSMfIZu9kObfgVcfkQLA0HN5fUavcfQAVXbFDorja2X9EFXxhcP2kcPYNaAEOSNv08DUBYxFPahEh3quQx58B6zn9WMa75ubK9AQILGRub22LGb5puzO4EHRR5IS3gyC5yX6KJWSXK0003__mC0)

## 2. Payroll Processing System
- Chức năng chính:
  - Tính lương tự động dựa trên timecard và quy định.
  - Quản lý khấu trừ (thuế, bảo hiểm, v.v.).
  - Phát hành phiếu lương.
- Thành phần chính:
  - Module tính lương.
  - Cơ sở dữ liệu về thuế và các chính sách khấu trừ.
  - Module tạo phiếu lương.
- Biểu đồ ngữ cảnh:
  - ![Diagram](https://www.planttext.com/api/plantuml/png/UhzxVtH8PcvgSc9HYe9lObvYUcfkQbw9Gd1bSKbgRgo2hgwTWaP0OcLHVawEGa1HVd9gSN5cNZfKNjDAmUNXxlKAEPaFTxUNAfHaFDmzDrCXFJCnJo7dy89SXJAGU39NT436uKr0JTuFT-rNACa_l32F28C3IoiLIXxkMf-ia9tnSDTIeEb53tUlviAZ1sncj5_6uKLvG9iFhygBjL88oCW4Mbgga7Dimx65UUbS00000F__0m00)

## 3. Employee Management System
- Chức năng chính:
  - Quản lý thông tin cá nhân, hợp đồng lao động, và dữ liệu nhân viên.
  - Quản lý vị trí công việc, lương cơ bản, và thâm niên.
  - Báo cáo nhân sự.
- Thành phần chính:
  - Cơ sở dữ liệu thông tin nhân viên.
  - Giao diện quản lý.
  - Module tìm kiếm và báo cáo.
- Biểu đồ ngữ cảnh:
  - ![Diagram](https://www.planttext.com/api/plantuml/png/UhzxVtHWwSDTY_CKSWxlLSZBEBmeJw7uuUwDiGgwkdOA6gwv1JdvbQcf2hw9UOdfgRcfUIKAmPN59QcvcbOA8Hc7L-Ng0rMlJLGeoJYy9IzTeIGp3sf8MURXLNbS-0m0sn3jV7XXiaB6mztjG2CUxfu8D2Cx0oWKQwNWyd3tUeMSJA1KAOgP00000F__0m00)

## 4. Charge Code Management System
- Chức năng chính:
  - Tạo và quản lý mã chi phí cho các dự án/công việc.
  - Theo dõi thời gian làm việc dựa trên mã chi phí.
  - Báo cáo phân tích chi phí dự án.
- Thành phần chính:
  - Module tạo mã chi phí.
  - Giao diện nhập mã cho nhân viên.
  - Module phân tích và báo cáo chi phí.
- Biểu đồ ngữ cảnh:
  - ![Diagram](https://www.planttext.com/api/plantuml/png/UhzxVtHWwSDTY_CKSWxlLKXvk7kZmk65UR4Akhfs2XhE6Ob5wQaAplafgGg-YNc9wQcvgNab2i6LnIMfkPfM2Y4FTotCLyWzl5WXEIDJeI3Zy5gkQB-Cmulo5Ceo3wyYrXI_Z8UxrXQW6aD04zXWh0wtKd0w37HJCfY0cGO0003__mC0)

## 5. Report Generation System
- Chức năng chính:
  - Tạo báo cáo tự động từ dữ liệu của các hệ thống khác.
  - Hỗ trợ tùy chỉnh biểu đồ và định dạng báo cáo.
  - Xuất báo cáo ở các định dạng khác nhau (PDF, Excel, v.v.).
- Thành phần chính:
  - Module lấy dữ liệu từ các hệ thống liên quan.
  - Công cụ tạo biểu đồ và định dạng.
  - Giao diện xuất báo cáo.
- Biểu đồ ngữ cảnh:
  - ![Diagram](https://www.planttext.com/api/plantuml/png/UhzxVxJpuON92XaFTxShb039YNdf2jaPGA5O1LrTEmMDeDI2_A8I1VVKlDIYn9BC_3o5uChYajHSJIi5buUxrolaP09rbgBevueEB7suQt6UGixXlOHDYJoygbGX-U6kvQKAIOSNvYia0makt1h0vY5ROANW1DS60000__y30000)

## 6. Purchase Order Management System
- Chức năng chính:
  - Tạo và quản lý đơn đặt hàng.
  - Theo dõi trạng thái đơn hàng (chờ duyệt, đang vận chuyển, hoàn tất).
  - Tích hợp với hệ thống quản lý kho.
- Thành phần chính:
  - Module tạo đơn hàng.
  - Cơ sở dữ liệu trạng thái đơn hàng.
  - Giao diện quản lý đơn đặt hàng.
- Biểu đồ ngữ cảnh:
  - ![Diagram](https://www.planttext.com/api/plantuml/png/UhzxVxJJmzqp5Geo7kvQcwUGMvgea75uGLvwh8Akhfs2Ha1fKN96Od6gWdzHIcgHWczYNc9wQcvgNeb2S6LnIMgkffL2oCDT2_CLZamyjZ0FefMBi2wmuT5-GEKAoQLvwGh93tSjBOYrKZWo0M4AXZJnBYe2EWcehIJZyC9C59S10000__y30000)

## 7. Authentication and User Management System
- Chức năng chính:
  - Đăng nhập và xác thực người dùng.
  - Quản lý quyền truy cập theo vai trò.
  - Theo dõi lịch sử đăng nhập và bảo mật.
- Thành phần chính:
  - Module xác thực.
  - Cơ sở dữ liệu người dùng và quyền hạn
  - Module giám sát bảo mật.
- Biểu đồ ngữ cảnh:
  - ![Diagram](https://www.planttext.com/api/plantuml/png/UhzxVxHV-h4D3tVFpLH8ERmpBprMGLVNJa73iRGa8pMl93CviIGpFqyXCIz58RGujKZ1Dp4lCJqr5oYb45nPN9AQgscbS6J2aUQyT8MyZ8UxrXPmaQ0LR5Mqy-65oGeP3tUtAvG0oOb0ax8pW4AnLWe16OSNvIaKbbO-tDsOfr1IL5gfa0os0m000F__0m00)

# Quan hệ giữa các hệ thống con:
1. Timecard Management System và Payroll Processing System

- Quan hệ: Timecard Management System cung cấp dữ liệu về thời gian làm việc của nhân viên để Payroll Processing System tính toán lương.
- Dữ liệu chia sẻ: Thời gian làm việc, mã chi phí.
2. Employee Management System và các hệ thống khác:

- Cung cấp thông tin cơ bản của nhân viên (thông tin cá nhân, hợp đồng, lương cơ bản) cho:
- Payroll Processing System (để tính lương).
- Timecard Management System (để xác định nhân viên hợp lệ).
- Authentication and User Management System (để quản lý tài khoản và phân quyền).
3. Charge Code Management System và Timecard Management System:

- Quan hệ: Charge Code Management System cung cấp mã chi phí để nhân viên nhập vào Timecard Management System khi ghi lại thời gian làm việc.
- Dữ liệu chia sẻ: Mã chi phí, thông tin dự án.
4. Report Generation System và tất cả các hệ thống khác:

- Quan hệ: Report Generation System tổng hợp dữ liệu từ tất cả các hệ thống để tạo báo cáo chi tiết:
- Báo cáo lương từ Payroll Processing System.
- Báo cáo thời gian làm việc từ Timecard Management System.
- Báo cáo nhân sự từ Employee Management System.
- Báo cáo chi phí từ Charge Code Management System.
5. Purchase Order Management System và Authentication and User Management System:

- Quan hệ: Authentication and User Management System đảm bảo rằng chỉ người dùng có quyền mới được truy cập và quản lý đơn đặt hàng.
6. Authentication and User Management System và tất cả các hệ thống khác:

- Quan hệ: Authentication and User Management System chịu trách nhiệm xác thực người dùng và phân quyền cho các hệ thống khác.

## Biểu đồ ngữ cảnh của hệ thống PayRoll System:
![Diagram]([https://planttext.com/api/plantuml/png/Z9IxYjj058RxUOg3-iLzYh2sB5maYWUlYsrdHuD7iJGoer70XDGXPHuWP1r8is2o8QdiOWi5luUU8A-GCxAiQ7o15KYWEP_-yvyB-hjzkiuDqwP84yAuoJHuGRf8igKG7h0SWiDfFqfZ5UT6CtojG_r3QC3K76wMkH5f7HWGic1ypcO2FCgMEakIDloU05vQSCFKB44WPB4oUCCqJWLdEgebmkanHtN6HPv38rXJb1vJ8w44EXGm4OjCcxp6HfFJfCgwSoeDWulMVCaquduMYRrYwFiN96cXkMIvWB6EX6veEYOV28cOONSsv1rAXM5pL6DJVzXX3jvS9kWYs0ek1P-x27KGdRr5Zx1tbmfbZk3GeHtpH-HuI4W0LrSlSJZm0hmtijgi5prVLjjFIa9URTSCPd6r_G99UPzw135BOraMVxrxB7eZ6OEotwbp99gnv6svuc1GzYS7lkyynyvxXFJt6BNKAmI-nc2gpIe3KwxHGh9xtAtKp2D8T3DNc-zBYAhj3qWmwSV2oTsmmGLKoVARWdTn-Q1QbjRijCwya76rUIfESWyiCiAUe4LP_bOpCBX8HZBqQR9ofTfoHfF_QdSbFZW-F8B7pwwXOUa5jFNMSC-gjN4N1hKxMJwalHixujvj-OkvQ1XqP7sx5ViXcsxfPyLz_wowCtKBTRR3qNVNezbEEcuRUhITVpvZ7o0j6CZotZR4ihNskDtHKuXS2nNP_-C_0000__y30000](https://www.planttext.com/api/plantuml/png/V55DIiGm5Dxt58-vW7lTp20k1qQS2yGq9CNajRGlGXbSUmfXghXH1bstI1U1kKTEu1LCYfqf0xf9UD_BzyENxwwVLyHAiaOdfU34K6e1inMhornhkAah4cO6h88HsYG0vsktGmMKkmP1xp_t3SgBY5zRtxu4o7t1dVBjgmKgVVS-x5RADGJARGEpK9blU_iNzzOrEV1u71uy9DDywym8pifq6l203GalBKhW8K81gUy-G6U-UmnnbE-UCf0PYqvR0_SHvwVwLwRGUIq4B1aoAOn0cbgDwwKqzAyTAlUCmSEzuQd5WlFSOfXea3oEluA-tHM17ou2heQ-AzTmDLPoHYeKraVPkS0qVk0F0000__y30000)
