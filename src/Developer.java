public class Developer extends Employee {
    private String mainLanguage;
    private int repositoryCount;

    public Developer(String employeeId, String firstName, String lastName, double baseSalary,
                     String mainLanguage, int repositoryCount) {
        super(employeeId, firstName, lastName, baseSalary);
        this.mainLanguage = mainLanguage;
        this.repositoryCount = repositoryCount;
    }

    @Override
    public double calculateMonthlyCost() {
        // Base salary + bonus for each repository
        return getBaseSalary() + (repositoryCount * 100);
    }

    @Override
    public String introduceYourself() {
        return super.introduceYourself() + " | Role: Developer (Main Language: " + mainLanguage + ")";
    }

    public void printTechnologies() {
        System.out.println("Tech Stack: " + mainLanguage + ", Repositories: " + repositoryCount);
    }

    @Override
    public String toString() {
        return super.toString() + " [Developer: " + mainLanguage + "]";
    }
}