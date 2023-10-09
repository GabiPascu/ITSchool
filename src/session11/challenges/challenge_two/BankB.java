package session11.challenges.challenge_two;

public class BankB extends Bank{

    int credit = 150;

    @Override
    void getBalance() {
        System.out.println(credit);
    }
}
