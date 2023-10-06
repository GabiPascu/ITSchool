package session10.challenges.singlelevel_inheritance;

public class MountainBike extends Bicycle {

    private String suspension;
    private String tireType;

    public MountainBike(int speed, int gear, String suspension, String tireType) {
        super(speed, gear);
        this.suspension = suspension;
        this.tireType = tireType;
    }

    public void adjustSuspension(int value) {
        if (value < 10) {
            this.suspension = "soft";
        }
        if (value > 10 && value < 20) {
            this.suspension = "road";
        }
        if (value > 20) {
            this.suspension = "off-road";
        }
    }


    public String getSuspension() {
        return suspension;
    }
}
