package session10.challenges.multilevel_inheritance;

public class Car {

    private String model;
    private String make;
    private int year;
    private boolean turnedOn;

    public Car(String model, String make, int year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }

    public void start() {
        turnedOn = true;
        if (turnedOn) {
            System.out.println("Engine on");
        }
    }
    public void stop() {
        turnedOn = false;
        if (!turnedOn) {
            System.out.println("Engine off");
        }
    }

    public void accelerate(int speed, int currentSpeed) {
        if (speed > 0) {
            System.out.println("You are accelerating");
            ++currentSpeed;
        }
        if (speed < currentSpeed) {
            System.out.println("You are decelerating");
            --currentSpeed;
        }
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }
}
