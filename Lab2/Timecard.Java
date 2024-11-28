import java.time.LocalDate;

public class Timecard {
    private Employee employee;
    private LocalDate date;
    private int hoursWorked; 

    // Constructor
    public Timecard(Employee employee, LocalDate date, int hoursWorked) {
        this.employee = employee;
        this.date = date;
        this.hoursWorked = hoursWorked;
    }

    // Getter cho nhân viên
    public Employee getEmployee() {
        return employee;
    }

    // Getter cho ngày
    public LocalDate getDate() {
        return date;
    }

   
    public int getHoursWorked() {
        return hoursWorked;
    }

    // In thông tin Timecard
    public void printTimecard() {
        System.out.println(employee.getName() + " (" + employee.getPosition() + ") worked " +
            hoursWorked + " hours on " + date);
    }
}
