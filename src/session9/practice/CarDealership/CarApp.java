package session9.practice.CarDealership;

public class CarApp {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Ford");
        car1.setModel("Kuga");
        car1.setSpeed(50);

//        System.out.println(car1);
        System.out.println("My car brand is: " + car1.getBrand());
        System.out.println("My car model is: " + car1.getModel());
        System.out.println("My car speed is: " + car1.getSpeed());

        car1.accelerate();
        car1.accelerate();
        System.out.println("My car speed has increased: " + car1.getSpeed());
    }
}
