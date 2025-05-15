public class TestAccount {
    public static void main(String[] args) {

        Account acc1 = new Account(5000.00);
        Account acc2 = new Account(4000.00);

        System.out.println("Initial Balances:");
        System.out.println("Account 1: $" + acc1.getBalance());
        System.out.println("Account 2: $" + acc2.getBalance());

        acc1.transfer(acc2, 1000.00);

        System.out.println("\nBalances After Transfer:");
        System.out.println("Account 1: $" + acc1.getBalance());
        System.out.println("Account 2: $" + acc2.getBalance());
    }
}
