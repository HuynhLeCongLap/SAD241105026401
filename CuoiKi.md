# A wilderness weather station
# Thiết kế lớp
# 1. Lớp Cảm Biến (Sensors)
- Công dụng :Đây là lớp chịu trách nhiệm tương tác với môi trường vật lý, thu thập dữ liệu từ các cảm biến như nhiệt độ, độ ẩm, tốc độ gió, áp suất và lượng mưa.
- Tại sao cần có :Là nguồn đầu vào chính của dữ liệu cho toàn bộ hệ thống, đảm bảo hệ thống có thông tin thời tiết thực tế để xử lý.
## Thuộc tính:
- data (dict): Lưu trữ dữ liệu thô từ các cảm biến như nhiệt độ, độ ẩm, tốc độ gió, áp suất và lượng mưa.
## Phương thức:
- __init__(self): Khởi tạo đối tượng và các cảm biến.
- collect_data(self): Thu thập dữ liệu từ các cảm biến..
- send_data(self): Gửi dữ liệu thu thập được đến lớp xử lý dữ liệu.
# 2. Lớp Xử Lý Dữ Liệu (DataProcessor)
- Công dụng :Xử lý dữ liệu thô từ lớp cảm biến, làm sạch, chuẩn hóa, phát hiện bất thường và chuẩn bị dữ liệu để lưu trữ hoặc gửi đi.
- Tại sao cần có :Dữ liệu thô từ cảm biến thường chứa nhiễu hoặc không đầy đủ; lớp này đảm bảo dữ liệu đầu ra chính xác, đáng tin cậy.
## Thuộc tính:
- raw_data (dict): Dữ liệu thô nhận từ lớp cảm biến.
- clean_data (dict): Dữ liệu đã được làm sạch và chuẩn hóa.
## Phương thức:
- __init__(self): Khởi tạo các thuộc tính dữ liệu.
- clean_data(self, raw_data): Làm sạch và chuẩn hóa dữ liệu.
- detect_faults(self, raw_data): Phát hiện và xử lý dữ liệu bất thường.
- store_data(self): Lưu trữ dữ liệu đã xử lý tạm thời.
- prepare_data(self): Chuẩn bị dữ liệu để gửi đi.
# 3.Lớp Quản Lý Năng Lượng (PowerManagement)
- Công dụng :Theo dõi và quản lý nguồn năng lượng, tối ưu hóa hoạt động của hệ thống dựa trên mức năng lượng hiện có.
- Tại sao cần có :Hệ thống hoạt động trong môi trường khắc nghiệt cần tối ưu hóa sử dụng năng lượng, đặc biệt khi năng lượng từ pin mặt trời hoặc gió bị hạn chế.
## Thuộc tính:
- energy_level (float): Mức năng lượng hiện tại.
- energy_source (str): Nguồn năng lượng như pin mặt trời, gió,...
- threshold (float): Ngưỡng năng lượng để điều chỉnh hoạt động của hệ thống.
## Phương thức:
- __init__(self): Khởi tạo năng lượng và nguồn năng lượng.
- monitor_energy(self): Theo dõi mức năng lượng hiện tại.
- optimize_energy(self): Điều chỉnh hoạt động hệ thống dựa trên mức năng lượng.
- allocate_energy(self): Phân bổ năng lượng cho các thành phần ưu tiên.
# 4. Lớp Truyền Thông (Communication)
- Công dụng :Đảm bảo dữ liệu thời tiết được gửi đến trung tâm điều khiển và nhận lệnh từ trung tâm.
- Tại sao cần có :Kết nối giữa trạm thời tiết và trung tâm điều khiển là yếu tố then chốt để đảm bảo dữ liệu được sử dụng hiệu quả.
## Thuộc tính:
- satellite_link (bool): Trạng thái kết nối với vệ tinh.
- transmission_data (dict): Dữ liệu đã xử lý cần truyền đi.
- commands (list): Danh sách các lệnh nhận từ trung tâm.
## Phương thức:
- __init__(self): Khởi tạo trạng thái kết nối và lệnh.
- transmit_data(self, data): Gửi dữ liệu đến trung tâm qua vệ tinh.
- receive_commands(self): Nhận lệnh từ trung tâm.
- update_firmware(self): Nhận và cài đặt bản cập nhật phần mềm.
# 5.Lớp Quản Lý Lỗi (FaultManagement)
- Công dụng :Phát hiện và xử lý các lỗi phần cứng hoặc phần mềm trong hệ thống.
- Tại sao cần có :Đảm bảo hệ thống duy trì hoạt động ổn định trong môi trường khắc nghiệt, giảm thiểu thời gian gián đoạn.
## Thuộc tính:
- fault_status (str): Trạng thái lỗi hiện tại.
- error_log (list): Nhật ký ghi lại các lỗi phát hiện được.
## Phương thức:
- __init__(self): Khởi tạo trạng thái lỗi và nhật ký lỗi.
- detect_faults(self): Phát hiện lỗi phần cứng hoặc phần mềm.
- recover_system(self): Kích hoạt cơ chế khắc phục (tự cấu hình lại hoặc khởi động lại).
- log_error(self, error): Ghi lại thông tin lỗi vào nhật ký.
# 6.Lớp Điều Khiển Chính (MainController)
- Công dụng :Điều phối và quản lý hoạt động của tất cả các lớp trong hệ thống.
- Tại sao cần có :Tạo sự liên kết và điều phối giữa các lớp, đảm bảo hệ thống hoạt động hiệu quả và liên tục.
## Thuộc tính:
- sensors (Sensors): Đối tượng cảm biến.
- data_processor (DataProcessor): Đối tượng xử lý dữ liệu.
- power_manager (PowerManagement): Đối tượng quản lý năng lượng.
- communication (Communication): Đối tượng truyền thông.
- fault_manager (FaultManagement): Đối tượng quản lý lỗi.
## Phương thức:
- __init__(self): Khởi tạo tất cả các thành phần của hệ thống.
- collect_and_process(self): Yêu cầu cảm biến thu thập dữ liệu và gửi đến bộ xử lý dữ liệu.
- manage_power(self): Theo dõi và phân bổ năng lượng hệ thống.
- handle_faults(self): Kiểm tra và xử lý lỗi nếu có.
- transmit_data(self): Truyền dữ liệu đến trung tâm.
- execute_commands(self): Nhận và thực thi lệnh từ trung tâm.
- run_system(self): Vòng lặp chính điều khiển hoạt động của hệ thống.
# TỔNG KẾT
## Hệ thống được phân chia thành 6 lớp với vai trò cụ thể:
### DataProcessor: Làm sạch và chuẩn bị dữ liệu.
### PowerManagement: Quản lý năng lượng.
### ommunication: Truyền và nhận dữ liệu.
### FaultManagement: Giám sát và khắc phục lỗi.
### MainController: Điều phối hoạt động của toàn bộ hệ thống.
# Sơ đồ lớp PlantUML
![Diagram](https://www.planttext.com/plantuml/png/b5LBRjim4Dth50Ejx8Klm4KG84Lt0GBq0CIK7Dj4AOv0ZkouHKxMHO_KAnII9LMa53JTs03d-zwy6Vt--Uin2KRf6byPZod15mg9Ou8V5G300ImAAh3EoFtXS1Z-0RHsmOdMk_tuODXxCgBxYDrUmOMT7Ks9WitVtwgntYSKV8biA2MESzM8LrrM1kC9W_wFXcR_NPvlluW7i2HzsqVilAIrvnA6SAGjV6sa5XUc8ViCyOMl59ynu8aQ2ZA3f43nTDEUBkGL73sZv9R4NJIa84aS3NAEbCxiRUR_FWKD1oSSzJrXqJMtuXhtdRQjw3qRb9LrXlN4JTC5Pr0SXnbKGY7ldP3sBdnJy9NPJyr73AbnAJbUZn4CDmq6cnHub_u9RCmrgkszWKKov2wafzmzY3axGDVQ7k3HnUQAaTOGF_UQs9ZSe1MT1ALBo_5GZ1orvzF7GEJAMxNE5uewtP9GKnWzd_HGQpVy3Ysicdz65vuuIEptykzgfVk2gsdJ5tkkssaHLRwNeq_R2rat0nzHbRfUp76MXSfLaj4tvobO_kYTmM2dXWjwxfdrq6vXEcEmdhOfppMLs-YLJ2UvafRJwa8vgRUgAYPmE3pCf6-OSiOt74g-DrnojZSSIgwdSxzg01JKYxDTL-KLwoEA0WhgDlB5MHel6BXmvBhAByLs8BsQCuOJ3KAigtBpjeC2YplUxdfATVL8mVPViZy0003__mC0)
