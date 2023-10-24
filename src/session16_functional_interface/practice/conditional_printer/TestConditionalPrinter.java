package session16_functional_interface.practice.conditional_printer;

public class TestConditionalPrinter {

    public static void main(String[] args) {
        ConditionalPrinter conditionalPrinter = (str, condition) -> showCondition(str, condition);

        conditionalPrinter.print("Hello", true);
        conditionalPrinter.print("Another Hello", false);
        }

    public static void showCondition (String str,boolean condition){
        if (condition)
            System.out.println(str);
    }
}
