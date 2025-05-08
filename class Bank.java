class Bank {
    int balance = 1000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
        }
    }
}

class Customer extends Thread {
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

public class SyncExample {
    public static void main(String[] args) {
        Bank account = new Bank();

        Customer c1 = new Customer(account, 700);
        Customer c2 = new Customer(account, 700);

        c1.setName("Customer-1");
        c2.setName("Customer-2");

        c1.start();
        c2.start();
    }
}
