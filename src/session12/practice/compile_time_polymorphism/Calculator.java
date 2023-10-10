package session12.practice.compile_time_polymorphism;

public class Calculator {

    //method overloading - compile-time polymorphism
    public int add (int a, int b) {
        return a + b;
    }

    public int add (int a, int b, int c) {
        return a + b + c;
    }

    public double add (double a, double b) {
        return a + b;
    }
}
