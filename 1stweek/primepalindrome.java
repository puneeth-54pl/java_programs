

/*5. A number is said to be palindrome if it is invariant under reversion; that is, the number is the same if its digits are reversed. For example, 3456543 is palindromic. Write a program that checks each of the first 10,000 prime numbers and prints those that are palindromic.*/
public class primepalindrome {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int n) {
        String str = Integer.toString(n);
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        
        while (count < 10000) {
            if (isPrime(num)) {
                count++;
                if (isPalindrome(num)) {
                    
                    System.out.print(num+"\t");
                }
            }
            num++;
        }
        
    }
}
