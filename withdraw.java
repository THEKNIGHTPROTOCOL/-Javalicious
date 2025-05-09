class Bank {
    int balance = 1000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println("Withdrawal successful: " + amount);
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class Customer implements Runnable {
    Bank bank;
    int amount;

    Customer(Bank bank, int amount) {
        this.bank = bank;
        this.amount = amount;
    }

    public void run() {
        bank.withdraw(amount);
    }
}

public class TestSync {
    public static void main(String[] args) {
        Bank b = new Bank();
        Thread t1 = new Thread(new Customer(b, 700));
        Thread t2 = new Thread(new Customer(b, 500));

        t1.start();
        t2.start();
    }
}
