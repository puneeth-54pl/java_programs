
import java.util.*;

class extractdigit {

    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number consisting of multiple digits:");
        int n = sc.nextInt();
        while (n != 0) {
            r = n % 10;
            System.out.print(r + " ");
            n = n / 10;
        }

    }
}
