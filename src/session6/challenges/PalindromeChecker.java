package session6.challenges;

public class PalindromeChecker {

    public static void main(String[] args) {

        String word = "capac";
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

    }

    public static boolean isPalindrome(String string) {

        StringBuilder reversed = new StringBuilder(string).reverse();
        return string.equals(reversed.toString());
    }
}


