package session10.challenges.challenge_two;

public class SingleInheritance {

    public static void main(String[] args) {

        MountainBike mountainBike = new MountainBike(30, 3, "orice", "road");
        mountainBike.changeGear();
        mountainBike.speedUp(10);
        mountainBike.applyBreak(15);
        mountainBike.adjustSuspension(15);
        System.out.println(mountainBike.getSuspension());
    }
}
