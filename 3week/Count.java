import java.util.*;

class Count{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string:");
        String str=sc.nextLine();
        int n=str.length();
        int vowelCount = 0, digitCount = 0;
        char[] ar = str.toCharArray();
        for (char ch : ar) {
            if (Character.isDigit(ch)) {
            digitCount++;
            } else if ("AEIOUaeiou".indexOf(ch) != -1) {
            vowelCount++;
            }
        }
        float vowelper=(float)vowelCount * 100 / n;
        float digitper=(float)digitCount * 100 / n;
        System.out.printf("Number of vowels:%d(%.2f)\n",vowelCount,vowelper);
        System.out.printf("Number of digits:%d(%.2f)",digitCount,digitper);
       }
}
