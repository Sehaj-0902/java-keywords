class Employee {
    private static String companyName = "Tech Corp";
    private static int totalEmployees;
    private final int id;
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    // Method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        System.out.println("Employee Details:");
        Employee emp1 = new Employee(101, "Alice", "Software Engineer");
        emp1.displayEmployeeDetails();

        Employee emp2 = new Employee(102, "Charlie", "Manager");
        emp2.displayEmployeeDetails();

        Employee.displayTotalEmployees();
    }
}

/*
Output:
    Employee Details:
    Company: Tech Corp
    ID: 101
    Name: Alice
    Designation: Software Engineer
    Company: Tech Corp
    ID: 102
    Name: Charlie
    Designation: Manager
    Total Employees: 2
 */