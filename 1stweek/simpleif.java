
import java.util.*;

class simpleif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number:");
        num = sc.nextInt();

        if (num == 1 || num == 2) {
            if (num == 1) {
                num = 2;
            } else {
                num = 1;
            }
        }
        System.out.println("output:" + num);

    }
}
