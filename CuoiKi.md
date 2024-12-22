# A wilderness weather station
# 1.Thiết kế lớp
# 1.1 Sensors(Cảm biến)
- Định nghĩa: Lớp này đại diện cho các cảm biến được sử dụng để đo các yếu tố khí tượng như nhiệt độ, độ ẩm, áp suất, gió.

## Thuộc tính:
- sensorID (string): Mã ID của cảm biến.
- sensorType (string): Loại cảm biến (nhiệt độ, độ ẩm, gió, v.v.)
- value (float): Giá trị đo được từ cảm biến.
- status (string): Trạng thái của cảm biến (hoạt động, hỏng hóc)
## Phương thức:
- collectData(): Thu thập dữ liệu từ cảm biến.
- checkStatus(): Kiểm tra trạng thái của cảm biến.
- reset(): Đặt lại cảm biến về trạng thái ban đầu.
## Hình ảnh mô tả lớp Sensors(Cảm biến):

![Diagram](https://www.planttext.com/plantuml/png/UhzxlqDnIM9HIMbk3bToJc9niK9mQbvnVb6nGZMN0WWKWxcUBbOAnIL5cNdfoA8XbGMfgE9bYJcbgLOAQJdvYILGbIM99QN5gAgIytDoKfDBN19B4ZKqhHJAyZDJe18PgSdPmM0Tg195gSMf9N2XMYuk00000F__0m00)
# 1.2 DataProcessor (Xử lý Dữ liệu)
- Định nghĩa: Lớp này xử lý dữ liệu từ các cảm biến để tính toán các giá trị khí tượng như nhiệt độ trung bình, độ ẩm, v.v.

## Thuộc tính:
- rawData (list): Dữ liệu thô từ cảm biến.
- processedData (dict): Dữ liệu đã xử lý.
- processingTime (float): Thời gian xử lý dữ liệu.
## Phương thức:
- processData(): Xử lý dữ liệu thô từ các cảm biến để tính toán các giá trị khí tượng.
- validateData(): Kiểm tra tính hợp lệ của dữ liệu (loại bỏ dữ liệu nhiễu).
- formatData(): Định dạng dữ liệu cho phù hợp với hệ thống lưu trữ.
## Hình ảnh mô tả lớp DataProcessor (Xử lý Dữ liệu):

![Diagram](https://www.planttext.com/plantuml/png/UhzxlqDnIM9HIMbk3bToJc9niO9BOabYG55-ScfnSNwHGZMN0WWK9PQ3nAqKSZABIo121H0rgIaGYPJCP5I9pBpqaCpSL2k5j9pyH5Gfa0uDJIk5ilpC58X4MM9EPafYIIgcJ5f-KMvY2OfuBHSN0000__y30000)



# 1.3 FaultDetector (Phát hiện Lỗi)
- Định nghĩa: Lớp này phát hiện các lỗi trong các cảm biến hoặc trong dữ liệu thu thập được.

## Thuộc tính:

- errorLog (list): Nhật ký lỗi đã phát hiện.
- threshold (float): Ngưỡng lỗi cho phép.
- sensorStatus (string): Trạng thái cảm biến (hoạt động, lỗi).
## Phương thức:

- detectFault(): Phát hiện lỗi trong dữ liệu hoặc cảm biến.
- logError(): Ghi lại lỗi vào nhật ký.
- resetFault(): Đặt lại trạng thái lỗi sau khi khắc phục.
## Hình ảnh mô tả lớp FaultDetector (Phát hiện Lỗi):

![Diagram](https://www.planttext.com/plantuml/png/N8mn3i8m40Hxl-9A-88h2a95nmki-70i7Jdfzao3U1a5J-8BA35Ds79cDP_N-m1FvkqcOPG4q2aryICxZwv6Zq3Bs4pjh2MIL7XdFXbZKicHhgBfHy4pr2wUl24ItEfSkibhSytlzf7kMdCNecLO-bjg3FvxFqFu0W00__y30000)
# 1.4 PowerManager (Quản lý Nguồn)
- Định nghĩa: Lớp này quản lý nguồn năng lượng của trạm khí tượng, bao gồm việc giám sát mức pin và tiết kiệm năng lượng.

## Thuộc tính:

- batteryLevel (float): Mức năng lượng của pin (từ 0 đến 100).
- powerStatus (string): Trạng thái nguồn (on/off).
- powerUsage (float): Mức tiêu thụ năng lượng.
## Phương thức:

- monitorPower(): Giám sát mức năng lượng của hệ thống.
- switchToLowPowerMode(): Chuyển sang chế độ tiết kiệm năng lượng khi pin yếu.
- chargeBattery(): Sạc lại pin khi cần thiết.
## Hình ảnh mô tả lớp PowerManager (Quản lý Nguồn)

![Diagram](https://www.planttext.com/plantuml/png/L8v12i8m44NtFSKizGfPYUiAWdg0CHtJG9gHcMc3Y2TpuP6yWjI0sBzz3_vxFryRDHGRXzJuXAgmvqAomuo11EuDp3kZ6ScjfOcIWqjYj0gkitmmj54Tg4dCuG-S50Cj_85pD9RlnshjOEBOLQ8bck-Ft7Af1TpHql0zIg1jJVcXH_C1003__mC0)
# 1.55 TempStorage (Lưu trữ Tạm thời)
- Định nghĩa: Lớp này lưu trữ dữ liệu tạm thời trong quá trình xử lý trước khi đưa vào hệ thống lưu trữ chính.

## Thuộc tính:

- tempData (dict): Dữ liệu tạm thời.
- storageCapacity (float): Dung lượng lưu trữ tạm thời.
- usedStorage (float): Dung lượng đã sử dụng.
## Phương thức:

- storeData(): Lưu trữ dữ liệu tạm thời.
- retrieveData(): Lấy dữ liệu đã lưu trữ tạm thời.
- clearStorage(): Xóa dữ liệu tạm thời khi không cần thiết.
## Hình ảnh mô tả lớp TempStorage (Lưu trữ Tạm thời)

![Diagram](https://www.planttext.com/plantuml/png/UhzxlqDnIM9HIMbk3bToJc9niK98Qcv1S4b-KM9wga8rbm88bAJc5hWabYHQAQHa9fT0n8eXIfmJ2nAJCqighHJISl8JeNAbnQafK2DGn45wKa46QMXQAPJbPwP0X8jIIueoKykmo2Jdf2OMGKs2ozHo0G000F__0m00)
# 1.6 SatelliteComm (Giao tiếp Vệ tinh)
- Định nghĩa: Lớp này cung cấp các phương thức để giao tiếp với vệ tinh, gửi và nhận dữ liệu.

## Thuộc tính:

- satelliteConnection (bool): Kết nối với vệ tinh (True/False).
- signalStrength (float): Cường độ tín hiệu từ vệ tinh.
- satelliteID (string): Mã ID của vệ tinh.
## Phương thức:

- sendData(): Gửi dữ liệu lên vệ tinh.
- receiveData(): Nhận dữ liệu từ vệ tinh.
- checkConnection(): Kiểm tra kết nối với vệ tinh.
## Hình ảnh mô tả lớp SatelliteComm (Giao tiếp Vệ tinh)

![Diagram](https://www.planttext.com/plantuml/png/PCqn3i8m30NGFQVm25V8X4GNvfx0f2QrS6mfCLqG9sFWI5oXggYe17_yJr___NmTccFrMv6G15k37fr4sEbefS0zm9AsbQgKd4qZdCraPSwAqdibpJv6k8YX_onFNOJcbJMlG3fqwBZRHvYCXqzRAH5Fz0zff7JTth_u23C0003__mC0)
# 1.7 CentralSystem (Hệ thống Trung tâm)
- Định nghĩa: Lớp này là trung tâm điều phối toàn bộ hoạt động của trạm khí tượng, bao gồm việc giám sát các cảm biến, xử lý dữ liệu và cảnh báo.

## Thuộc tính:

- status (string): Trạng thái của hệ thống trung tâm (hoạt động, bảo trì).
- sensorList (list): Danh sách các cảm biến kết nối với hệ thống.
- dataLog (list): Nhật ký dữ liệu.
## Phương thức:

- monitorSystem(): Giám sát trạng thái hoạt động của toàn hệ thống.
- processData(): Xử lý dữ liệu từ các cảm biến.
- sendAlert(): Gửi cảnh báo khi có sự cố.
## Hình ảnh mô tả lớp CentralSystem (Hệ thống Trung tâm)

![Diagram](https://www.planttext.com/plantuml/png/LCmn2W8n58JXFgT8gLT8fMYvdITuR1vB89idRsO54KzciKVo2Y8HqIc_7-RvM7UWE9UvXh4A40_Qw59FLr3dU0lnFL2u84NGIvi-fWtcGm5Jh0NiceKosFHBixL2y_wusQPuiP9xEhkD2Xo5yX-WBU-hEhzy3oy0003__mC0)
# 1.8 WeatherStation (Trạm Khí tượng)
- Định nghĩa: Lớp này đại diện cho một trạm khí tượng, chịu trách nhiệm thu thập và gửi dữ liệu khí tượng.

## Thuộc tính:

- location (string): Vị trí của trạm khí tượng.
- weatherData (dict): Dữ liệu khí tượng thu thập được.
- systemStatus (string): Trạng thái của hệ thống (hoạt động, bảo trì).
## Phương thức:

- initialize(): Khởi tạo trạm khí tượng.
- collectWeatherData(): Thu thập dữ liệu khí tượng từ các cảm biến.
- sendWeatherData(): Gửi dữ liệu khí tượng tới hệ thống trung tâm.
## Hình ảnh mô tả lớp WeatherStation (Trạm Khí tượng)

![Diagram](https://www.planttext.com/plantuml/png/R8sn3K8n34JxJE4ILaX5mGOKr5PYWIN_H8hlWm0n6SKVYHLG2CsNS7VlpdVlrx9pSCCyMKZ6xdGKnbdQ0GojXHw1-bbDNnt9qRIS1hsEx9x1aR8c3EmtXqozOVRrWnQ5ikbTDjj8bwfvy5JD9E6ttVlMlal9_ynd-0000F__0m00)
# 1.9 Data Management and Storage Subsystem (Hệ thống Quản lý và Lưu trữ Dữ liệu)
- Định nghĩa: Lớp này quản lý việc lưu trữ và truy xuất dữ liệu từ hệ thống trạm khí tượng.

## Thuộc tính:

- storageCapacity (float): Dung lượng lưu trữ của hệ thống.
- dataRepository (dict): Kho dữ liệu chứa các bản ghi khí tượng.
- accessLog (list): Nhật ký truy cập dữ liệu.
## Phương thức:

- storeData(): Lưu trữ dữ liệu vào kho.
- retrieveData(): Truy xuất dữ liệu từ kho.
- deleteData(): Xóa dữ liệu khi không cần thiết.
## Hình ảnh mô tả lớp Data Management and Storage Subsystem (Hệ thống Quản lý và Lưu trữ Dữ liệu)

![Diagram](https://www.planttext.com/plantuml/png/R8qn2W8n44NxFSMKUeLKWfRQw0a-oHW2oSwI6HU2xCaiF99NaB3R2FxoFNZ_yteVr53jKVBWCrJf1CC58o8N7ktMrBZGSw0-DQc8VCG4dwmvkcU1hIx0SEL9D9dKvYWalnbupwfdYOvoqWts5FUltTxHB2cikBBLnFCV4pYp_V9b-0800F__0m00)
# 1.10 DataProcessingUnit (Đơn vị Xử lý Dữ liệu)
- Định nghĩa: Lớp này chịu trách nhiệm xử lý dữ liệu khí tượng thu thập từ các cảm biến, bao gồm việc phân tích và tính toán các chỉ số khí tượng.

## Thuộc tính:

- processorSpeed (float): Tốc độ xử lý dữ liệu.
- dataQueue (list): Hàng đợi dữ liệu cần xử lý.
- processingTime (float): Thời gian xử lý dữ liệu.
## Phương thức:

- processData(): Xử lý dữ liệu nhận được từ các cảm biến.
- queueData(): Đưa dữ liệu vào hàng đợi xử lý.
- clearQueue(): Xóa hàng đợi khi xử lý xong.
## Hình ảnh mô tả lớp DataProcessingUnit (Đơn vị Xử lý Dữ liệu)

![Diagram](https://www.planttext.com/plantuml/png/UhzxlqDnIM9HIMbk3bToJc9niO9BOabYG55-ScfnSMPUUcXUPeb2DPS221H0HFEBWWjIKrEi5D9oyXDB858fYIM9WQMffQbM2ZcPnL11gFhClFIGpDnK5FLGAP1T6ffM2cNvcIaGYKAG8PZ2oJcfYKLW2-3YjLm00000__y30000)
# 1.1111 DataInterface (Giao diện Dữ liệu)
- Định nghĩa: Lớp này cung cấp giao diện giữa người dùng và hệ thống, cho phép người dùng truy cập và xem dữ liệu khí tượng.

## Thuộc tính:

- interfaceType (string): Loại giao diện (giao diện người dùng, API).
- connectionStatus (bool): Trạng thái kết nối.
- userPermissions (string): Quyền truy cập của người dùng.
## Phương thức:

- displayData(): Hiển thị dữ liệu cho người dùng.
- connectToSystem(): Kết nối với hệ thống.
- sendData(): Gửi dữ liệu cho hệ thống khác.
## Hình ảnh mô tả lớp DataInterface (Giao diện Dữ liệu)

![Diagram](https://www.planttext.com/plantuml/png/L8qn2W8n44Nxd2AbNY6LXOsTi7k1CHbb89bPCXCXo9xCmYDv1LaMY_poFzx_t_Vdf0RLMiakPb3rPp2ui66zGqJ_SduB_OkvBnYyMYL-x2WACqOZuSd0cWP_4yaxQuhrYhMGAWdhA2RI9KFV_Wx7u9z2QLYSPUfgM4Qeo6bGLlS3003__mC0)
# 1.12 MaintenanceSystem (Hệ thống Bảo trì)
- Định nghĩa: Lớp này giúp giám sát và quản lý các công việc bảo trì của hệ thống trạm khí tượng.

## Thuộc tính:

- maintenanceLog (list): Nhật ký bảo trì.
- maintenanceStatus (string): Trạng thái bảo trì (cần bảo trì, không cần bảo trì).
- schedule (string): Lịch trình bảo trì.
## Phương thức:

- performMaintenance(): Thực hiện công việc bảo trì cho hệ thống.
- logMaintenance(): Ghi lại thông tin bảo trì vào nhật ký.
- scheduleMaintenance(): Lên lịch bảo trì cho hệ thống.
## Hình ảnh mô tả lớp MaintenanceSystem (Hệ thống Bảo trì)

![Diagram](https://www.planttext.com/plantuml/png/UhzxlqDnIM9HIMbk3bToJc9niO9lOcPUIMfUObvoQd1bSKbgha8rbm88v28aVFBJhHHoCejBC6I2In9BIekj58fBYZBpqY7InSaPgIcbEQceeWMfHMdvHRb8rcbeMYcKvMUcGEHpyjDnoi5CnAQWbWi0003__mC0)
# 1.13 WeatherStationSubsystem (Hệ thống Con Trạm Khí tượng)
- Định nghĩa: Lớp này đại diện cho các hệ thống con của trạm khí tượng, mỗi hệ thống con có thể bao gồm một số cảm biến hoặc thiết bị phụ trợ.

## Thuộc tính:

- sensorList (list): Danh sách cảm biến trong hệ thống con.
- status (string): Trạng thái của hệ thống con.
- location (string): Vị trí của hệ thống con.
## Phương thức:

- initialize(): Khởi tạo hệ thống con.
- collectData(): Thu thập dữ liệu từ cảm biến.
- sendData(): Gửi dữ liệu lên hệ thống trung tâm.
## Hình ảnh mô tả lớp WeatherStationSubsystem (Hệ thống Con Trạm Khí tượng)

![Diagram](https://www.planttext.com/plantuml/png/LCmn3i8m44JHFgTm2LTmHK59bu9wSLQmqiQMF6CaG9mi1KVY2WX2uodVIF-zl7QWLBRPX-G2XACABrf72gtaiPrm0tKEZo5y1yqezM1W36xWNobiY06ibi-hUKc_HA-MZIPkTzriOxWMcrPFnLqJzqBf3sYUEdqE7m000F__0m00)
# 1.14 SatelliteCommunicationModule (Mô-đun Giao tiếp Vệ tinh)
- Định nghĩa: Lớp này quản lý giao tiếp giữa trạm khí tượng và vệ tinh.

## Thuộc tính:

- satelliteID (string): Mã ID của vệ tinh.
- signalStrength (float): Cường độ tín hiệu.
- communicationStatus (string): Trạng thái giao tiếp.
## Phương thức:

- connect(): Kết nối với vệ tinh.
- sendData(): Gửi dữ liệu lên vệ tinh.
- receiveData(): Nhận dữ liệu từ vệ tinh.
## Hình ảnh mô tả lớp SatelliteCommunicationModule (Mô-đun Giao tiếp Vệ tinh)

![Diagram](https://www.planttext.com/plantuml/png/L8mn3i8m40Hxly8bV24L4caegFA2atsOaovtahrEWtWP1K_Y2mWH9BBbpkwy7iz30rNqMKDIQYrE15OLyD7dkPiaWhYTFNVbU0lna_RRdCOXDbIniW8fHZgXiXLSXtXH9tnH-jTD8FIs_IOtuuJTVeYBIrw5R7aaqBQjd5WMte1xU0C00F__0m00)
# 1.15 CentralDataRepository (Kho Dữ liệu Trung tâm)
- Định nghĩa: Lớp này chứa tất cả dữ liệu khí tượng đã được thu thập và xử lý.

## Thuộc tính:

- repositorySize (float): Dung lượng kho dữ liệu.
- dataRecords (list): Danh sách bản ghi dữ liệu.
- accessHistory (list): Lịch sử truy cập dữ liệu.
## Phương thức:

- storeData(): Lưu trữ dữ liệu vào kho.
- retrieveData(): Truy xuất dữ liệu từ kho.
- archiveData(): Lưu trữ dữ liệu lâu dài.
## Hình ảnh mô tả lớp CentralDataRepository (Kho Dữ liệu Trung tâm)

![Diagram](https://www.planttext.com/plantuml/png/R8qz2e9130NxFKLAlS9MWXRMUeAGZHY8HfBuWOedi_18Na7MFqHyvGp3krskaqZqt6-qa684J7cRZZh3n0NlB2JD3t0gqESVifGZLrYfOJvLUmHatgA2Ihmm4d74NA97tw83xY-ZSON1fBqVqeM7FmQTrl8ZpkKE003__mC0)
# 1.16 CommunicationSystem (Hệ thống Giao tiếp)
- Định nghĩa: Lớp này quản lý giao tiếp giữa các hệ thống trong trạm khí tượng và các hệ thống bên ngoài (như vệ tinh, máy chủ trung tâm).

## Thuộc tính:

- connectionStatus (bool): Trạng thái kết nối.
- dataRate (float): Tốc độ truyền tải dữ liệu.
- protocol (string): Giao thức giao tiếp.
## Phương thức:

- connect(): Kết nối với các hệ thống khác.
- sendData(): Gửi dữ liệu.
- receiveData(): Nhận dữ liệu.
## Hình ảnh mô tả lớp CommunicationSystem (Hệ thống Giao tiếp)

![Diagram](https://www.planttext.com/plantuml/png/LCp12K8n48JX-wjYZzf2Je9Me1MicrK2ILQoamSYLkR1acn1DAVCyVjXFg_tpi4DlUH5ChlJtahfDGaZMJtT7LheiT1lOhMg_1sCxe7EPdcqoE0ZGmDTiZ46tfh1n78WHqlrEjrije5MIt6WQuq71i_QL3IjEeNdyWK00F__0m00)
# 1.17 Users (Người dùng)
- Định nghĩa: Lớp này đại diện cho người dùng của hệ thống, có thể là các nhà nghiên cứu, kỹ thuật viên hoặc quản trị viên.

## Thuộc tính:

- userID (string): Mã ID người dùng.
- userRole (string): Vai trò của người dùng (quản trị viên, nhà nghiên cứu, kỹ thuật viên).
- accessLevel (int): Mức độ truy cập của người dùng (ví dụ: quyền xem, quyền sửa).
## Phương thức:

- viewData(): Xem dữ liệu khí tượng.
- updateSettings(): Cập nhật các thiết lập hệ thống.
- accessReports(): Truy cập các báo cáo khí tượng.
## Hình ảnh mô tả lớp DataProcessor (Xử lý Dữ liệu):

![Diagram](https://www.planttext.com/plantuml/png/UhzxlqDnIM9HIMbk3bToJc9niK9eSMfHiK8rbm88b1Qd5dcwM2aKbnHbvgKZn8BoSr9HHHEJarEBYtrIor9ph1GoyqeWecMPgUKkYIM96ffM2cNvcIbG4mfI4ajIWrDBIZBpqejHvI3c1AKMv1UL8AHgkG00003__mC0)

# Hình ảnh mô tả mmối quan hệ giữa các lớp
![Diagram](https://www.planttext.com/plantuml/png/j9UzZjms4CTxFGKx9yM-W2edTmbYu0uuMtj8FKVDIOGfKYP7krW7hbExJcMuDf8wMwGumE-nJv1N22ZgO_cnCOmWrns76luudFdFxD_7lvvR0aD39ujdxEhf0sVoTFojPxnz-gHQHaQhXhMduw-CsjFnlMeOcTEV7phskdtwnEZp7wVZHxT3WsfO_VInABW4Qrc5ocfZsIy5Stzs_FV5TSai6Q6QyzNjeSTmVGTom98zIWqqxIIWmOQxk9OIELq3mJVVbcodHJqPMkIlg_6Bq63G8YrBxsPMv-7EQ8xMQZCJ6zYxzP99OIU8tk_1sXjgmKE3KCrMT27uP4eXTo153OIfvL6R3i9hBQW_mY3f6WavhQXeZ3OtkZbdfTQWRRMimp2E0QyomQn7dwFxa4RgvWVdFnF9SFV2UAVtQ6v1GOCBuWCGeJdSu0vb61-tEGSq6kujD64yEwq4QJEU4IBPlI3URlMDtdi2NMES5s0Q_DwZfDnRxFgAj846Psp2heyVs_ejLz035tG8w0QBzUGYIbzjCYzja8p0NSR29OAPFAMa5H1AAGYlTDSj9ROkAeMSX5ObUz1QJcRHA90L6LGDjI7T_6McFkiSDKUHXNPrjvwUSb-X8WEoEbZ2bJlp-3vFRuIbyvokWI1AyoaTlCUGvcBbkLjz9z5aKlTd16fzFWgjPaAf-VX_oBZtUvFq655o6IsK805Il8tJqklOT7QUDsSCzClNMuUAukXUpbONprVOQ-j2U3Y_170NkYZMNvt4DKgC12wdkK8rzqhGJ3ozcpPLZrWdm2y7TBqXKUMl4jytpic5gdlfR7dW5uhGF09Vz47C2saFuqiTpBcmrk9WqToXwOIrGgjOYONj9HmoTDxZLkUoFIdL1VmM7AK2nJ5CZMurn5LrzackEdcBzI2Z2_TeNESwEovf91TjiyVSXWl5MGqFljJ24IFMZ9owvElv2-MPhyjyo0Dz7fJmnzrgTyL4hXFHlIpK_DnTxcMc5Fa2vqKLZuNwEX28PJ9QLYhn5ZEAmhMfxVaZU3dvIJW5EVmdIG73sylKGNY2vFYtQXoXWHBf8Csr_7_YUszndOsT6iH9uDPUwRZ49bdsGvHG4-fEu3uzV-ZTT5aXaL1DD0TxF-vb3QscTqNnZDsUZky5UpE0ybD_8qx7tu7nvPT1CK_scqqqE9UEsXRXuhGhQK_kOjgW7QEV_oPg3-KoVr_wA1oEop5H3Lach1tG5i5Skjd4pNxqlnCrMZzx5k6KjTb4uqivFlp44feIvwjObQmR2NoSah2ifqIrLmRnYj2dWAtjwUmkRl_QfrBGj3qiYETz88n6h6aEErDy9Mj1rH9jg5o5J_yCzSW9d6nHF4TLkr-b_m000F__0m00)
