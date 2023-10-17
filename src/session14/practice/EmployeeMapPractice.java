package session14.practice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMapPractice {

    public static void main(String[] args) {
        Map<String, String> employeeMap1 = new HashMap<>();
        employeeMap1.put("E100", "Maria");
        employeeMap1.put("E101", "John");
        employeeMap1.put("E102", "Bob");


        Map<String, String> employeeMap2 = new HashMap<>();
        employeeMap2.put("E102", "Bob");
        employeeMap2.put("E103", "Bill");

//        displayEmployeeInfo(employeeMap1);

        Map<String, String> commonEntriesMap = getCommonEntries(employeeMap1, employeeMap2);
        displayEmployeeInfo(commonEntriesMap);
    }

    private static Map<String, String> getCommonEntries(Map<String, String> firstMap, Map<String, String> secondMap) {
        Map<String, String> result = new HashMap<>();

        for (String key : firstMap.keySet()) {
            if ((secondMap.containsKey(key)) &&secondMap.get(key).equals(firstMap.get(key))){
                result.put(key, firstMap.get(key));
            }
        }
        return result;
    }

    private static void displayEmployeeInfo(Map<String, String> map) {
        for (Map.Entry<String, String> employee : map.entrySet()) {
            System.out.println("Employee id: " + employee.getKey() + ", employee name: " + employee.getValue());
        }
    }
}