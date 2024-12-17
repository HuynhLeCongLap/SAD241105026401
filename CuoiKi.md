# A wilderness weather station
## Thiết kế lớp
# 1.Lớp WeatherStation

- Đại diện cho trạm thời tiết. Chịu trách nhiệm quản lý các cảm biến, thu thập dữ liệu và báo cáo thông tin.
## Thuộc tính:
- stationID: ID của trạm.
- location: Vị trí của trạm.
- sensors: Danh sách các cảm biến kết nối với trạm.
## Phương thức:
- addSensor(Sensor sensor): Thêm cảm biến.
- removeSensor(Sensor sensor): Loại bỏ cảm biến.
- collectData(): Thu thập dữ liệu từ tất cả cảm biến.
- generateReport(): Tạo báo cáo từ dữ liệu thu thập.
# 2.Lớp Sensor (Lớp cơ sở - Abstract Class)

- Đại diện cho các cảm biến chung (ví dụ: nhiệt độ, độ ẩm, áp suất).
## Thuộc tính:
- sensorID: ID của cảm biến.
- type: Loại cảm biến (nhiệt độ, độ ẩm, v.v.).
## Phương thức:
- getData(): Phương thức trừu tượng để lấy dữ liệu từ cảm biến.
# 3.Lớp TemperatureSensor (Kế thừa từ Sensor)

- Cảm biến đo nhiệt độ.
## Thuộc tính:
- unit: Đơn vị đo (°C, °F, v.v.).
## Phương thức:
- getData(): Lấy dữ liệu nhiệt độ.
# 4.Lớp HumiditySensor (Kế thừa từ Sensor)

- Cảm biến đo độ ẩm.
## Thuộc tính:
- unit: Đơn vị đo (%).
## Phương thức:
- getData(): Lấy dữ liệu độ ẩm.
# 5.Lớp PressureSensor (Kế thừa từ Sensor)

- Cảm biến đo áp suất khí quyển.
## Thuộc tính:
- unit: Đơn vị đo (hPa, atm, v.v.).
## Phương thức:
- getData(): Lấy dữ liệu áp suất.
# 6.Lớp WeatherData

- Lưu trữ dữ liệu thời tiết được thu thập.
## Thuộc tính:
- temperature: Nhiệt độ.
- humidity: Độ ẩm.
-- pressure: Áp suất khí quyển.
- timestamp: Thời gian thu thập dữ liệu.
## Phương thức:
- toString(): Trả về dữ liệu thời tiết ở dạng chuỗi.

![Diagram](https://www.planttext.com/plantuml/png/f9DDQiCm48NtEeMMza8NC25aOKeBNPGuaFNK7XA1VencN0XDJzP5ZzGh55kA6xaj5EATtXl6dzwCFjy_DiGGUB1627Wc3j2oR0qGoGOT-I1VXPm-ceuFTIKR3jeTaiod7XVI0Ra6XgAiv9tnmE9DYDXoXxR703m4pBehEJZD_svpFrZTQJxTqkCf8D6D77i4Fc8OtRa1Vr_nKX-DOuBErJvXv2fhYyHW-qhMmBZJ5Yzn-yWsqYJA9Kx3mDgxcOZYUJ4v9Orl9sCXnpbJ9HyryIh6iqv_XwwBGX6hghGaPV83Ml-I8lsZfFN6O3idUXNX7BSRyyCjzZvmKOxtIqDQdPNwkKEPcwz6PkKJ5s8HbrBhXFgRSyqfDkYwySLy0G00__y30000)


## Mô tả sơ đồ
- Sensor: Là lớp trừu tượng dùng làm cơ sở cho các loại cảm biến như TemperatureSensor, HumiditySensor, và PressureSensor.
- WeatherStation: Chứa danh sách các cảm biến, có chức năng thu thập dữ liệu và tạo báo cáo.
- WeatherData: Lưu trữ dữ liệu thời tiết bao gồm nhiệt độ, độ ẩm, áp suất và thời gian thu thập.
## Quan hệ:
- Lớp WeatherStation có quan hệ với Sensor (mối quan hệ chứa).
- Lớp Sensor là lớp cha của các cảm biến con (TemperatureSensor, HumiditySensor, PressureSensor).
