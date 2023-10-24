package session15_hascode_and_enums.challenge.challenge_six;

public class Test {

    public static void main(String[] args) {

        System.out.println("Green light: " + LightColor.GREEN.getMessage() + "(" + LightColor.GREEN.getDuration() + " seconds)");
        System.out.println("Yellow light: " + LightColor.YELLOW.getMessage() + "(" + LightColor.YELLOW.getDuration() + " seconds)");
        System.out.println("Red light: " + LightColor.RED.getMessage() + "(" + LightColor.RED.getDuration() + " seconds)");
    }
}
