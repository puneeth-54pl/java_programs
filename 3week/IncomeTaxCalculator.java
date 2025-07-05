import java.util.Scanner;

class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter taxable income (or -1 to quit): ");
            int income = sc.nextInt();

            if (income == -1) {
                System.out.println("bye!");
                break;
            }

            double tax;

            if (income <= 20000) {
                tax = 0;
            } else if (income <= 40000) {
                tax = (income - 20000) * 0.10;
            } else if (income <= 60000) {
                tax = (20000 * 0.10) + (income - 40000) * 0.20;
            } else {
                tax = (20000 * 0.10) + (20000 * 0.20) + (income - 60000) * 0.30;
            }

            System.out.printf("The income tax payable is: %.2f\n", tax);
        }
    }
}
