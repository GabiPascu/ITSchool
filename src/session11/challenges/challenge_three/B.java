package session11.challenges.challenge_three;

public class B extends Marks {

    private double firstGrade;
    private double secondGrade;
    private double thirdGrade;
    private double fourthGrade;

    public B(double firstGrade, double secondGrade, double thirdGrade, double fourthGrade) {

        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
        this.thirdGrade = thirdGrade;
        this.fourthGrade = fourthGrade;
    }

    @Override
    public double getPercentage() {
        double calculation = firstGrade + secondGrade + thirdGrade + fourthGrade;
        return (calculation / 400) * 100;
    }
}
