package session3.challenges;

public class IntegerToRomans {

    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (num > 0) {
            int quotient = num / values[i];
            num %= values[i];
            for (int j = 0; j < quotient; j++) {
                result.append(symbols[i]);
            }
            i++;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int num = 1876; //interchangeable
        String roman = intToRoman(num);
        System.out.println("Roman numeral representation of " + num + " is: " + roman);
    }
}
