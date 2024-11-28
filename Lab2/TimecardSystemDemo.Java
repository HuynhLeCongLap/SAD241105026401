import java.time.LocalDate;

public class TimecardSystemDemo {
    public static void main(String[] args) {
        // Tạo đối tượng ProjectManagement
        ProjectManagement projectManagement = new ProjectManagement();

        // Tạo một số nhân viên và thêm vào dự án
        Employee emp1 = new Employee("John", "Developer");
        Employee emp2 = new Employee("Alice", "Manager");
        projectManagement.addEmployee(emp1);
        projectManagement.addEmployee(emp2);

        // Tạo Timecard cho các nhân viên
        Timecard timecard1 = new Timecard(emp1, LocalDate.of(2024, 11, 28), 8);
        Timecard timecard2 = new Timecard(emp2, LocalDate.of(2024, 11, 28), 6);

        // In thông tin Timecard
        timecard1.printTimecard();
        timecard2.printTimecard();

        // Duyệt qua danh sách nhân viên trong dự án và in ra tên của từng nhân viên
        System.out.println("\nEmployees in the project:");
        for (Employee emp : projectManagement.getEmployees()) {
            System.out.println(emp.getName() + " - " + emp.getPosition());
        }
    }
}
