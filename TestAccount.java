public class TestAccount {
    public static void main(String[] args) {
        // Create two accounts
        Account acc1 = new Account("A001", "John", 5000);
        Account acc2 = new Account("A002", "Jane", 4000);

        // Display balance of both accounts
        System.out.println("Initial Balances:");
        System.out.println("Account 1: $" + acc1.getBalance());
        System.out.println("Account 2: $" + acc2.getBalance());

        // Transfer $1000 from acc1 to acc2
        acc1.transferTo(acc2, 1000);

        // Display balance of both accounts after the transfer
        System.out.println("\nBalances after transferring $1000 from Account 1 to Account 2:");
        System.out.println("Account 1: $" + acc1.getBalance());
        System.out.println("Account 2: $" + acc2.getBalance());
    }
}
