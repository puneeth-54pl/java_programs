interface Taxable {
    double calculateTax();
}

abstract class Employee implements Taxable {
    String name;
    int id;
    double baseSalary;

    Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    abstract double calculateBonus();
    abstract String getDetails();

    public double calculateTax() {
        return 0.10 * baseSalary + 0.05 * calculateBonus();
    }
}


class Manager extends Employee {
    String department;

    Manager(String name, int id, double baseSalary, String department) {
        super(name, id, baseSalary);
        this.department = department;
    }

    @Override
    double calculateBonus() {
        return 0.20 * baseSalary;
    }

    @Override
    String getDetails() {
        return "Manager [Name: " + name + ", ID: " + id + ", Department: " + department + "]";
    }
}

class Intern extends Employee {
    String university;

    Intern(String name, int id, double baseSalary, String university) {
        super(name, id, baseSalary);
        this.university = university;
    }

    @Override
    double calculateBonus() {
        return 500.0;
    }

    @Override
    String getDetails() {
        return "Intern [Name: " + name + ", ID: " + id + ", University: " + university + "]";
    }
}
class Developer extends Employee {
    String level;

    Developer(String name, int id, double baseSalary, String level) {
        super(name, id, baseSalary);
        this.level = level;
    }

    @Override
    double calculateBonus() {
        switch (level.toLowerCase()) {
            case "junior":
                return 0.10 * baseSalary;
            case "mid":
                return 0.15 * baseSalary;
            case "senior":
                return 0.25 * baseSalary;
            default:
                return 0.0;
        }
    }

    @Override
    String getDetails() {
        return "Developer [Name: " + name + ", ID: " + id + ", Level: " + level + "]";
    }
}
public class Company {
    public static void main(String[] args) {
        
        Employee e1 = new Manager("Ramesh", 101, 80000, "Sales");
        Employee e2 = new Intern("Deepak", 102, 20000, "MIT");
        Employee e3 = new Developer("Rocky", 103, 70000, "Senior");

        Employee[] employees = {e1, e2, e3};

        for (Employee e : employees) {
            System.out.println(e.getDetails());
            System.out.println("Base Salary: Rs." + e.baseSalary);
            System.out.println("Bonus: Rs." + e.calculateBonus());
            System.out.println("Tax: Rs." + e.calculateTax());
            System.out.println("Total Salary (Base + Bonus - Tax): Rs." + (e.baseSalary + e.calculateBonus() - e.calculateTax()));
            System.out.println("-----------------------------------");
        }
    }
}
