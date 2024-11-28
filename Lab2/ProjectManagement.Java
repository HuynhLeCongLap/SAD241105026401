import java.util.ArrayList;

public class ProjectManagement {
    private ArrayList<Employee> employees;  // Danh sách nhân viên trong dự án

    // Constructor
    public ProjectManagement() {
        employees = new ArrayList<Employee>();
    }

    // Phương thức thêm nhân viên vào danh sách
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    // Phương thức lấy danh sách nhân viên
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}
