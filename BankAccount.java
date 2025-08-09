class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance; 

    // Constructor using 'this' keyword
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + this.balance);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + this.balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Display method
    void display() {
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Asif", 1001, 5000.0);
        acc.display();
        acc.deposit(1500);
        acc.withdraw(3000);
        acc.withdraw(5000); // Should show insufficient balance
    }
}
