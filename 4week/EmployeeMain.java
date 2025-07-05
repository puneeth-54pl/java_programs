
class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return (firstName + " " + lastName);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    int raiseSalary(int percent) {
        return this.salary = this.salary + (this.salary * percent / 100);
    }

    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }

}

public class EmployeeMain {

    public static void main(String[] args) {
        Employee emp = new Employee(1, "puneeth", "kumar", 15000);
        System.out.println("Employee id:"+emp.getId());
        System.out.println("Employee firstname:"+emp.getFirstName());
        System.out.println("Employee lastname:"+emp.getLastName());
        System.out.println("Employee fullname:"+emp.getName());
        System.out.println("Employee salary:"+emp.getSalary());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        emp.setSalary(20000);
        System.out.println("New salary of employee:"+emp.getSalary());
        emp.raiseSalary(30);
        System.out.println("New salary after 30% raise:"+emp.getSalary());
        System.out.println("Employee details: " + emp.toString());
    }
}
