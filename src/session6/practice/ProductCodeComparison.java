package session6.practice;

public class ProductCodeComparison {

    public static void main(String[] args) {
        String fixedCode = "PROD12345";

        String code1 = new String("PROD12345");
        String code2 = "PROD12345";
        String code3 = "PROD" + "12345";

        System.out.println("Using == operator method: ");

        System.out.println("fixedCode vs code1: " + (fixedCode == code1)); //false
        System.out.println("fixedCode vs code2: " + (fixedCode == code2)); //true
        System.out.println("fixedCode vs code3: " + (fixedCode == code3)); //true

        System.out.println("Using equals() method: ");

        System.out.println("fixedCode vs code1: " + (fixedCode.equals(code1))); //true
        System.out.println("fixedCode vs code2: " + (fixedCode.equals(code2))); //true
        System.out.println("fixedCode vs code3: " + (fixedCode.equals(code3))); //true
    }
}
