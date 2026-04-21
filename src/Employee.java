import java.util.Objects;

public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private double baseSalary;

    // Constructor to initialize shared fields
    public Employee(String employeeId, String firstName, String lastName, double baseSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    // Final method: Cannot be overridden by child classes
    public final String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public double getBaseSalary() { return baseSalary; }

    // Method to be overridden
    public double calculateMonthlyCost() {
        return baseSalary;
    }

    // Method to be overridden
    public String introduceYourself() {
        return "Employee ID: " + employeeId + ", Name: " + firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Employee[ID=" + employeeId + ", Name=" + firstName + " " + lastName + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }
}