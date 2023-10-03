package session10.practice.bank_account;

public class BankApp {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println("initial balance: " + account.checkBalance());

        account.deposit(500.35);
        account.withdraw(200.35);
        System.out.println("Final balance: " + account.checkBalance());
    }
}
