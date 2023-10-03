package session10.practice.bank_account;

public class BankAccount {

    private double balance;
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("You have deposited: " + amount);
        } else {
            System.out.println("Invalid input");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("The amount is invalid");
        }
    }

    public double checkBalance() {
        return balance;
    }
}
