public class Tester extends Employee {
    private boolean automationTester;
    private int scenarioCount;

    public Tester(String employeeId, String firstName, String lastName, double baseSalary,
                  boolean automationTester, int scenarioCount) {
        super(employeeId, firstName, lastName, baseSalary);
        this.automationTester = automationTester;
        this.scenarioCount = scenarioCount;
    }

    // Getters for tester-specific fields
    public boolean isAutomationTester() { return automationTester; }
    public int getScenarioCount() { return scenarioCount; }

    @Override
    public double calculateMonthlyCost() {
        double automationBonus = automationTester ? 500 : 0;
        return getBaseSalary() + automationBonus + (scenarioCount * 5);
    }

    @Override
    public String introduceYourself() {
        String type = automationTester ? "Automation" : "Manual";
        return super.introduceYourself() + " | Role: " + type + " Tester";
    }

    public void runTestingReport() {
        System.out.println("Generating test report for " + scenarioCount + " scenarios...");
    }
}