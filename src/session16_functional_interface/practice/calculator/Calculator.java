package session16_functional_interface.practice.calculator;
@FunctionalInterface
public interface Calculator {

    double calculate(double a, double b, char operator);
}
