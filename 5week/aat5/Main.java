
abstract class BankAccount {

    int accno;
    double bal;

    BankAccount(int accno, double bal) {
        this.accno = accno;
        this.bal = bal;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    void displayBalance() {
        System.out.println("Account " + accno + " balance: " + bal);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(int accno, double bal) {
        super(accno, bal < 1000 ? 1000 : bal);
        System.out.println("Savings Account created with balance: " + this.bal);
    }

    @Override
    void deposit(double amount) {
        if (amount < 100) {
            System.out.println("Deposit must be at least 100.");
        } else {
            bal += amount;
            System.out.println("Deposited " + amount + ". New balance: " + bal);
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount > bal - 1000) {
            System.out.println("Withdrawal denied. Minimum balance 1000 must be maintained.");
        } else {
            bal -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + bal);
        }
    }
}

class CheckingAccount extends BankAccount {

    CheckingAccount(int accno, double bal) {
        super(accno, bal);
        System.out.println("Checking Account created with balance: " + this.bal);
    }

    @Override
    void deposit(double amount) {
        if (amount < 100) {
            System.out.println("Deposit must be at least 100.");
        } else {
            bal += amount;
            System.out.println("Deposited " + amount + ". New balance: " + bal);
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount > bal) {
            System.out.println("Withdrawal denied. Insufficient balance.");
        } else {
            bal -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + bal);
        }
    }
}

class Customer {

    String name;
    BankAccount[] accounts;
    int count;

    Customer(String name) {
        this.name = name;
        accounts = new BankAccount[5];
        count = 0;
    }

    void addAccount(BankAccount acc) {
        if (count < accounts.length) {
            accounts[count] = acc;
            count++;
            System.out.println("Account " + acc.accno + " added to customer " + name);
        } else {
            System.out.println("Cannot add more accounts.");
        }
    }

    void displayBalances() {
        System.out.println("Balances for customer: " + name);
        for (int i = 0; i < count; i++) {
            accounts[i].displayBalance();
        }
    }

    void depositToAccount(int accno, double amount) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].accno == accno) {
                accounts[i].deposit(amount);
                return;
            }
        }
        System.out.println("Account " + accno + " not found.");
    }

    void withdrawFromAccount(int accno, double amount) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].accno == accno) {
                accounts[i].withdraw(amount);
                return;
            }
        }
        System.out.println("Account " + accno + " not found.");
    }
}

public class Main {

    public static void main(String[] args) {
        Customer cust = new Customer("puneeth");

        SavingsAccount sa = new SavingsAccount(101, 500);
        CheckingAccount ca = new CheckingAccount(102, 2000);

        cust.addAccount(sa);
        cust.addAccount(ca);

        cust.displayBalances();

        cust.depositToAccount(101, 300);
        cust.withdrawFromAccount(102, 500);

        cust.displayBalances();

        cust.withdrawFromAccount(101, 900);

        cust.withdrawFromAccount(101, 200);

        cust.displayBalances();
    }
}
