package session6.challenges;

public class ConcatenateStrings {

    public static void main(String[] args) {

        String word1 = "Programming";
        String word2 = "Is";
        String word3 = "Challenging";

        StringBuilder stringBuilder = new StringBuilder(word1 + " " + word2 + " " + word3);
        System.out.println(stringBuilder);
    }
}