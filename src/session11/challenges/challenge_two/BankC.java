package session11.challenges.challenge_two;

public class BankC extends Bank{

    int credit = 200;

    @Override
    void getBalance() {
        System.out.println(credit);
    }
}
