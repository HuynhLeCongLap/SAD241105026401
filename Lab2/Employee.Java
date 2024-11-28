public class Employee {
    private String name;
    private String position;

    // Constructor
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Getter cho tên
    public String getName() {
        return name;
    }

    // Getter cho vị trí công việc
    public String getPosition() {
        return position;
    }
}
