package session6.practice;

public class StringMethodsPractice {

    public static void main(String[] args) {
        String name = "John Doe";
        printStringLength("Test");
        printStringCharAt("Alice", 0);
        //                      012345
        printStringIndexAt("Alice", "i");
        printSubstring("Hello world", 6, 11);

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name + " contains Doe: " + name.contains("Doe"));

        System.out.println("Replaced 'e' from Hello: " + "Hello".replace('e', 'a'));

        String email = "user@google.com";
        String domain = email.substring(email.indexOf('@') + 1);
        System.out.println("The domain name is: " + domain);
    }

    private static void printStringLength(String input) {
        System.out.println("String input length: " + input.length());
    }

    private static void printStringCharAt(String input, int index) {
        System.out.println("The character at index: " + input.charAt(index));
    }

    private static void printStringIndexAt(String input, String target) {
        System.out.println("The index of target is: " + input.indexOf(target));
    }


    private static void printSubstring(String input, int startIndex, int endIndex) {
        System.out.println("The substring is: " + input.substring(startIndex, endIndex));
    }
}
