package session14.practice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, Integer> myMap = initializeMap();

        int retrievedValue = retrieveValue(myMap, "two");
        System.out.println("Retrieved value: " + retrievedValue);

        updateMap(myMap, "three", 10);
        System.out.println("Updated value: " + retrieveValue(myMap, "three"));
    }

    private static void updateMap(Map<String, Integer> map, String key, int value) {
        map.put(key, value);
    }

    private static int retrieveValue(Map<String, Integer> map, String key) {
        return map.get(key);
    }

    private static Map<String, Integer> initializeMap() {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("one", 1);
        myMap.put("one", 4);
        myMap.put("two", 2);
        myMap.put("three", 3);

        return myMap;
    }
}