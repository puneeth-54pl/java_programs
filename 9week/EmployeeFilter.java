import java.util.*;

// Simple Employee class to store employee information
class Employee {
    String name;
    String department;
    double salary;

    // Constructor to create an employee
    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee information nicely
    public String toString() {
        return name + " | " + department + " | Rs." + salary;
    }
}

public class EmployeeFilter {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("puneeth", "IT", 60000),
            new Employee("harish", "HR", 40000),
            new Employee("prashanth", "IT", 45000),
            new Employee("raaki", "Finance", 52000)
        );

        System.out.println("Employees with salary > 50,000:");
        employees.stream()
                .filter(e -> e.salary > 50000)
                .forEach(System.out::println);

        System.out.println("\nEmployees in IT department:");
        employees.stream()
                .filter(e -> e.department.equals("IT"))
                .forEach(System.out::println);
    }
}
