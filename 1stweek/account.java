
import java.util.*;

class Myaccount {

    String name;
    int accno;
    boolean typeofacc;//true for savings, false for current.
    int amt;
    float balance;

    Myaccount(int accno, String name, boolean typeofacc, float balance) {
        this.accno = accno;
        this.name = name;
        this.typeofacc = typeofacc;
        if (balance >= 50) {
            this.balance = balance;
        } else {
            System.out.println("Initial balance is less than 50. Setting balance to 50.");
            this.balance = 50;
        }
    }

    void deposit(int amt) {
        this.balance = this.balance + amt;
    }

    void display() {
        System.out.println("Account holder name: " + this.name + "\nBalance:" + this.balance);
    }

}

class account {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Myaccount m1 = new Myaccount(26523, "puneeth", true, 10000);
        m1.display();
        System.out.print("Enter the amount to deposit:");
        int amt = sc.nextInt();
        m1.deposit(amt);
        m1.display();
    }
}
