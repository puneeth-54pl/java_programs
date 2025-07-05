
import java.util.*;

class Ricebags {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of small rice bags (1 kilo each): ");
        int small = sc.nextInt();
        System.out.print("Enter the number of big rice bags (5 kilo each): ");
        int big = sc.nextInt();
        System.out.print("Enter the kilos of rice: ");
        int r_kilo = sc.nextInt();

        boolean possible = isPossible(small, big, r_kilo);
        if (possible) {
            System.out.println("It is possible to pack the rice.");
        } else {
            System.out.println("It is NOT possible to pack the rice.");
        }
    }

    static boolean isPossible(int small, int big, int r_kilo) {
        int maxBigBags = r_kilo / 5;
        int useBig = Math.min(big, maxBigBags);
        int remaining = r_kilo - (useBig * 5);
        return remaining <= small;
    }
}
