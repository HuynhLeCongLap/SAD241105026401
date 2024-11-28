import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Lớp đại diện cho nhân viên
class Employee {
    private String name;
    private int employeeId;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

// Lớp đại diện cho thẻ giờ làm việc
class Timecard {
    private Employee employee;
    private String date;
    private String startTime;
    private String endTime;

    public Timecard(Employee employee, String date, String startTime, String endTime) {
        this.employee = employee;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Phương thức hiển thị thông tin thẻ giờ
    public void displayTimecard() {
        System.out.println("Employee: " + employee.getName());
        System.out.println("Date: " + date);
        System.out.println("Start Time: " + startTime);
        System.out.println("End Time: " + endTime);
    }

    // Phương thức chỉnh sửa thẻ giờ
    public void editTimecard(String newStartTime, String newEndTime) {
        this.startTime = newStartTime;
        this.endTime = newEndTime;
    }

    public String getDate() {
        return date;
    }
}

// Lớp quản lý các thẻ giờ
class TimecardSystem {
    private List<Timecard> timecards;

    public TimecardSystem() {
        timecards = new ArrayList<>();
    }

    // Phương thức thêm thẻ giờ cho nhân viên
    public void addTimecard(Timecard timecard) {
        timecards.add(timecard);
    }

    // Phương thức tìm và hiển thị thẻ giờ của nhân viên
    public void viewTimecard(Employee employee, String date) {
        for (Timecard timecard : timecards) {
            if (timecard.getDate().equals(date) && timecard.employee.getEmployeeId() == employee.getEmployeeId()) {
                timecard.displayTimecard();
                return;
            }
        }
        System.out.println("No timecard found for this date.");
    }

    // Phương thức chỉnh sửa thẻ giờ
    public void editTimecard(Employee employee, String date, String newStartTime, String newEndTime) {
        for (Timecard timecard : timecards) {
            if (timecard.getDate().equals(date) && timecard.employee.getEmployeeId() == employee.getEmployeeId()) {
                timecard.editTimecard(newStartTime, newEndTime);
                System.out.println("Timecard updated successfully.");
                return;
            }
        }
        System.out.println("Timecard not found for this date.");
    }
}

public class TimecardSystemDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo nhân viên
        Employee employee1 = new Employee(1, "John Doe");

        // Tạo hệ thống thẻ giờ
        TimecardSystem timecardSystem = new TimecardSystem();

        // Ghi nhận thẻ giờ cho nhân viên
        Timecard timecard1 = new Timecard(employee1, "2024-11-28", "09:00", "17:00");
        timecardSystem.addTimecard(timecard1);

        // Các thao tác với thẻ giờ
        System.out.println("Welcome to Timecard System.");
        System.out.println("1. View Timecard");
        System.out.println("2. Edit Timecard");
        System.out.print("Please select an option: ");
        int option = scanner.nextInt();
        scanner.nextLine();  // Đọc bỏ dòng mới

        if (option == 1) {
            // Xem thẻ giờ
            System.out.print("Enter date (yyyy-mm-dd) to view: ");
            String date = scanner.nextLine();
            timecardSystem.viewTimecard(employee1, date);
        } else if (option == 2) {
            // Chỉnh sửa thẻ giờ
            System.out.print("Enter date (yyyy-mm-dd) to edit: ");
            String date = scanner.nextLine();
            System.out.print("Enter new start time (hh:mm): ");
            String newStartTime = scanner.nextLine();
            System.out.print("Enter new end time (hh:mm): ");
            String newEndTime = scanner.nextLine();
            timecardSystem.editTimecard(employee1, date, newStartTime, newEnd
