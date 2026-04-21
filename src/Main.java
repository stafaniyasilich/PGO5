public class Main {
    public static void main(String[] args) {
        ProjectTeam team = new ProjectTeam("CyberSystem 2026");

        // Requirement: Parent-type reference pointing to child objects
        Employee dev1 = new Developer("D01", "Alex", "Brown", 5000, "Java", 15);
        Employee test1 = new Tester("T01", "Maria", "White", 4000, true, 50);

        team.addEmployee(dev1);
        team.addEmployee(test1);

        // Print team info
        team.printTeamMembers();

        System.out.println("\nTotal Project Monthly Cost: $" + team.calculateTotalCost());

        // Requirement: Show casting after checking 'instanceof'
        System.out.println("\nDetailed check:");
        if (dev1 instanceof Developer) {
            Developer specificDev = (Developer) dev1; // Casting
            specificDev.printTechnologies();
        }

        System.out.println("\nFiltering Team:");
        team.printAutomationTesters();
    }
}git init