
class fibonacci {

    public static void main(String[] args) {
        float avg;
        int n = 20;
        int i = 1;
        int n1 = 1;
        int n2 = 1;
        int n3;
        int sum = n1 + n2;
        System.out.print("The first " + n + " Fibonacci numbers are: \n 1 1 ");
        while (i <= n - 2) {
            n3 = n1 + n2;
            sum = sum + n3;
            n1 = n2;
            n2 = n3;
            i++;
            System.out.print(n3 + " ");
        }
        avg = (float) sum / n;

        System.out.println("\nThe average is:" + avg);

    }
}
