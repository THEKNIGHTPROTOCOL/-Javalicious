class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor using 'this' keyword
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void showBalance() {
        System.out.println("Balance for " + this.accountHolder + " is: " + this.balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Asif", 1000);
        acc.deposit(500);
        acc.withdraw(300);
        acc.showBalance();
    }
}
