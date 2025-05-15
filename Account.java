public class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(Account target, double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            target.balance += amount;
        } else {
            System.out.println("Transfer failed. Check balance or amount.");
        }
    }
}
