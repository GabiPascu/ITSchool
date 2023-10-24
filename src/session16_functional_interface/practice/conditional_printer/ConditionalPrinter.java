package session16_functional_interface.practice.conditional_printer;
@FunctionalInterface
public interface ConditionalPrinter {

    void print(String string, Boolean condition);
}
