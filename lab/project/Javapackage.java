import calculator.Adder;
import calculator.Subtractor;

public class Javapackage {
    public static void main(String[] args) {
        Adder adder = new Adder();
        Subtractor subtractor = new Subtractor();

        int sum = adder.add(10, 5);
        int diff = subtractor.subtract(10, 5);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
    }
}
