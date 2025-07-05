import java.util.Scanner;

public class QuadraticRoots {

   public static void root(double A, double B, double C) {
        if (A == 0) {
            System.out.println("Coefficient A cannot be zero for a quadratic equation.");
            return;
        }
        double discriminant = B * B - 4 * A * C;

        if (discriminant > 0) {
            double root1 = (-B + Math.sqrt(discriminant)) / (2 * A);
            double root2 = (-B - Math.sqrt(discriminant)) / (2 * A);
            System.out.println("Roots are real and distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            double root = -B / (2 * A);
            System.out.println("Roots are real and equal:");
            System.out.println("Root = " + root);
        } else {
            double realPart = -B / (2 * A);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * A);
            System.out.println("Roots are complex and imaginary:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficient A:");
        double A = scanner.nextDouble();

        System.out.println("Enter coefficient B:");
        double B = scanner.nextDouble();

        System.out.println("Enter coefficient C:");
        double C = scanner.nextDouble();

        root(A, B, C);
    }
}
