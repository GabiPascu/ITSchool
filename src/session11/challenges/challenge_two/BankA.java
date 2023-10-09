package session11.challenges.challenge_two;

public class BankA extends Bank{

    int credit = 100;

    @Override
    void getBalance() {
        System.out.println(credit);
    }
}
