package session10.challenges.challenge_two;

public class Bicycle {

    private int speed;
    private int gear;

    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public void changeGear() {
        if (speed > 0 && speed <= 20) {
            System.out.println("Gear set to 1");
            gear = 1;
            this.gear = 1;
        }
        if (speed > 20 && speed <= 30) {
            System.out.println("Gear set to 2");
            gear = 2;
            this.gear = 2;
        }
        if (speed > 30 && speed <= 40) {
            System.out.println("Gear set to 3");
            gear = 3;
            this.gear = 3;
        }
        System.out.println("Gear is: " + getGear() + " Speed is: " + getSpeed());
    }

    public void speedUp(int amount) {
        if (amount > 0) {
            System.out.println("You are accelerating");
            this.speed += amount;
        }
        changeGear();

    }

    public void applyBreak(int amount2) {
        if (speed - amount2 <= 0) {
            this.speed = 0;
            System.out.println("You have stopped");
        } else {
            System.out.println("You are decelerating");
            this.speed -= amount2;
        }
        changeGear();
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }
}
