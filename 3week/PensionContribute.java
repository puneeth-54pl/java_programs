import java.util.Scanner;

class PensionContribute {
    public static void main(String[] args) {
        final double SALARY_CEILING = 6000;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the monthly salary: $");
        double salary = sc.nextDouble();

        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        double contributionSalary = Math.min(salary, SALARY_CEILING);

        double employeeRate;
        double employerRate;

        if (age <= 55) {
            employeeRate = 0.20;
            employerRate = 0.17;
        } else if (age <= 60) {
            employeeRate = 0.13;
            employerRate = 0.13;
        } else if (age <= 65) {
            employeeRate = 0.075;
            employerRate = 0.09;
        } else {
            employeeRate = 0.05;
            employerRate = 0.075;
        }

        double employeeContribution = contributionSalary * employeeRate;
        double employerContribution = contributionSalary * employerRate;
        double totalContribution = employeeContribution + employerContribution;

        System.out.printf("The employee's contribution is: $%.2f\n", employeeContribution);
        System.out.printf("The employer's contribution is: $%.2f\n", employerContribution);
        System.out.printf("The total contribution is: $%.2f\n", totalContribution);
    }
}
