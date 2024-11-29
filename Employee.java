class Employee {
    private String name;
    private int id;
    private double basicSalary;
    private double grossSalary;

    // Constructor
    public Employee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.grossSalary = calculateGrossSalary();
    }

    // Method to calculate gross salary
    private double calculateGrossSalary() {
        double hra = 0.2 * basicSalary;  // HRA is 20% of basic salary
        double allowances = 0.1 * basicSalary;  // Allowances are 10% of basic salary
        return basicSalary + hra + allowances;
    }

    // Method to apply bonus and update gross salary
    public void applyBonus(double bonus) {
        basicSalary += bonus;
        grossSalary = calculateGrossSalary();
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("-----------------------------");
    }
    // Main method to test the class
    public static void main(String[] args) {
        Employee emp1 = new Employee("suhail", 1, 50000);
        Employee emp2 = new Employee("anan", 2, 60000);

        System.out.println("Before Bonus:");
        emp1.displayDetails();
        emp2.displayDetails();

        // Apply bonuses
        emp1.applyBonus(5000);
        emp2.applyBonus(7000);

        System.out.println("After Bonus:");
        emp1.displayDetails();
        emp2.displayDetails();
    }
}