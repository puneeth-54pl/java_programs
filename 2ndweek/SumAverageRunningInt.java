
import java.util.*;

class SumAverageRunningInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start;
        int end;
        int sum;
        float avg;
        System.out.print("Enter the starting number:");
        start = sc.nextInt();
        System.out.print("Enter the ending number:");
        end = sc.nextInt();
        sum = (end - start + 1) * (start + end) / 2;
        System.out.println("The sum of " + start + " to " + end + "is: " + sum);
        avg = (float) sum / (end - start + 1);
        System.out.println("The average is: " + avg);
    }
}
