package session15_hascode_and_enums.challenge.challenge_six;

public enum LightColor {

    RED(30,"STOP"),
    YELLOW(5, "CAUTION"),
    GREEN(45, "GO");

    private int duration;
    private String message;
    LightColor(int duration, String message) {
        this.duration = duration;
        this.message = message;
    }
    public int getDuration() {
        return duration;
    }
    public String getMessage() {
        return message;
    }
}
