package session14.challenges.just_testing;

import java.util.*;

public class test {

    public static void main(String[] args) {

//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("one", 1);
//        myMap.put("two", 2);
//        myMap.put("three", 3);
//        myMap.put("one", 12);

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        animal1.setName("Koala");
        animal2.setName("Koala");

        Map<Animal, Integer> myMap = new HashMap<>();
        myMap.put(animal1, myMap.getOrDefault(animal1, 0) + 1);
        //output: Koala:null = 1
        myMap.put(animal2, myMap.getOrDefault(animal2, 0) + 1);
        myMap.put(animal2, myMap.getOrDefault(animal2, 0) -1 );


        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());
        System.out.println(myMap.size());
        System.out.println(myMap);

    }
}
