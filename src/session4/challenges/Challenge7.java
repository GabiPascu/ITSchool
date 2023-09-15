package session4.challenges;

public class Challenge7 {
    public static void main(String[] args) {
        int sideOne = 5;
        int sideTwo = 5;
        int sideThree = 10;

        String result = (sideOne == sideTwo && sideThree > 5) ? "Triangle is an isosceles one" : "The triangle is a scalene";
        System.out.println(result);
    }
}
