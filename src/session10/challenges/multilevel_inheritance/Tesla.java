package session10.challenges.multilevel_inheritance;

public class Tesla extends ElectricCar {

    private float autopilotVersion;
    private boolean autoPilot = false;

    public Tesla(String make, String model, int year, int batteryCapacity, int range, float autopilotVersion) {
        super(make, model, year, batteryCapacity, range);
        this.autopilotVersion = autopilotVersion;
    }

    public void enableAutopilot(float version) {
        autoPilot = true;
        if (autoPilot) {
            System.out.println("Auto-pilot turned on");
        } else if (version < autopilotVersion) {
            autoPilot = false;
            System.out.println("Version is outdated, autopilot turned off");
        }
    }

    public float getAutopilotVersion() {
        return autopilotVersion;
    }

    public boolean isAutoPilot() {
        return autoPilot;
    }
}