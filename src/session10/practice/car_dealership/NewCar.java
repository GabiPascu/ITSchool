package session10.practice.car_dealership;

import java.time.LocalDate;

public class NewCar extends Car {

    private LocalDate expirationDate;

    public NewCar(String model, int year, double price, LocalDate expirationDate){
        super (model, year, price);
        this.expirationDate = expirationDate;
    }

    public String printExpirationDate() {
        return expirationDate.toString();
    }
}
