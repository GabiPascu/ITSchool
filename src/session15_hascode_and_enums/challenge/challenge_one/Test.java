package session15_hascode_and_enums.challenge.challenge_one;

public class Test {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setHeight(5);
        rectangle1.setWidth(10);

        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setHeight(5);
        rectangle2.setWidth(10);

        System.out.println(rectangle2);

        System.out.println(rectangle1.equals(rectangle2));
    }
}
