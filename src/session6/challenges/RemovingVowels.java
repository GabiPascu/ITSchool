package session6.challenges;

import java.util.Scanner;

public class RemovingVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String word = scanner.nextLine();

        System.out.println(removeVowels(word));
    }

    public static String removeVowels(String str) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < str.length(); index++) {
            char character = str.charAt(index);
            if (!isVowel(character)) {
                result.append(character);
            }
        }
        return result.toString();
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
