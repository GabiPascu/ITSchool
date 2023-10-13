package session12_polymorphism.practice.has_a;

public class Test {

    public static void main(String[] args) {
        //using composition example
        Engine engine = new Engine();
        Car car = new Car(engine);

        car.start();
        car.drive();
    }
}
