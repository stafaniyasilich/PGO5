import java.util.ArrayList;

public class ProjectTeam {
    private String projectName;
    private ArrayList<Employee> employees;

    public ProjectTeam(String projectName) {
        this.projectName = projectName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printTeamMembers() {
        System.out.println("Project Team: " + projectName);
        for (Employee emp : employees) {
            System.out.println(emp.introduceYourself());
        }
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Employee emp : employees) {
            total += emp.calculateMonthlyCost();
        }
        return total;
    }

    public Employee findById(String employeeId) {
        for (Employee emp : employees) {
            if (emp.getEmployeeId().equals(employeeId)) {
                return emp;
            }
        }
        return null;
    }

    public void printAutomationTesters() {
        System.out.println("Searching for automation testers...");
        for (Employee emp : employees) {
            if (emp instanceof Tester) {
                Tester tester = (Tester) emp; // Downcasting after checking instanceof
                if (tester.isAutomationTester()) {
                    System.out.println("- " + tester.getFirstName() + " " + tester.getLastName());
                }
            }
        }
    }
}