package session11.challenges.challenge_three;

public class A extends Marks {

    private double firstGrade;
    private double secondGrade;
    private double thirdGrade;

    public A(double firstGrade, double secondGrade, double thirdGrade) {
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
        this.thirdGrade = thirdGrade;

    }

    @Override
    public double getPercentage() {
        double calculation = firstGrade + secondGrade + thirdGrade;
        return (calculation / 300) * 100;
    }
}