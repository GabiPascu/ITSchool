package ro.itschool.project.utils.design_patterns;

import java.time.LocalDateTime;

public class FacadeExample {

    public static void main(String[] args) {
        TravelPackageFacade travelPackageFacade = new TravelPackageFacade();
        HotelBookingSystem hotelBookingSystem = new HotelBookingSystem();
    }
}

class HotelBookingSystem {

    public void bookRoom(String hotelName, LocalDateTime checkIn, LocalDateTime checkOut) {

    }
}

class FlightBookingSystem {

    public void bookFlight(String departure, String arrive) {

    }
}

class TravelPackageFacade {

    private HotelBookingSystem hotelBookingSystem;
    private FlightBookingSystem flightBookingSystem;

    public TravelPackageFacade() {
        hotelBookingSystem = new HotelBookingSystem();
        flightBookingSystem = new FlightBookingSystem();
    }

    public void bookTravelPackage(String hotelName,
                                  LocalDateTime checkIn,
                                  LocalDateTime checkOut,
                                  String departure,
                                  String arrive) {

        hotelBookingSystem.bookRoom(hotelName, checkIn, checkOut);
        flightBookingSystem.bookFlight(departure, arrive);

    }
}