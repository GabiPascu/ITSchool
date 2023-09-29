package session8.challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class challenge5 {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("Miami");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a city name: ");
        String cityName = scanner.nextLine();
        if (cities.contains(cityName)) {
            System.out.println("This city is already in the list as a duplicate.");
        } else {
            cities.add(cityName);
            System.out.println(cityName + " has been added to the list.");
        }
        System.out.println("Updated list of cities:");
        for (String city : cities) {
            System.out.println(city);
        }
        scanner.close();
    }
}