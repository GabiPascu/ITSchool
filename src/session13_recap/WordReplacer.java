package session13_recap;

import java.util.Scanner;

public class WordReplacer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make a sentence using the word apple, please.");

        String input = scanner.nextLine();
        System.out.println("Enter word to be replaced");
        String find = scanner.nextLine();
        System.out.println("Enter replacement word");
        String replace = scanner.nextLine();
        input = input.replaceAll(find, replace);
        System.out.println(input);

    }
}
