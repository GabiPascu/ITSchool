package session11.match_example;

public class Circle implements MathConstants{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return PI  * radius * radius;
    }
}
