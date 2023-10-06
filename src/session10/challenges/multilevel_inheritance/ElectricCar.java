package session10.challenges.multilevel_inheritance;

public class ElectricCar extends Car {

    private int batteryCapacity;
    private int range;
    private int batteryLevel;

    public ElectricCar(String make, String model, int year, int batteryCapacity, int range) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    public void charge(int percentage) {
        batteryLevel += percentage;
        if (percentage == batteryCapacity) {
            System.out.println("Battery full, unplug the charger");
        } else if (percentage < batteryCapacity) {
            System.out.println("Charging...");
        }
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getRange() {
        return range;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}
