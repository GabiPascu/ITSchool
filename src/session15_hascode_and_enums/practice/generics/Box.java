package session15_hascode_and_enums.practice.generics;

public class Box<T> {

    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public static void main(String[] args) {
        Box<String> myString = new Box<>();
        myString.setObject("Hello John");

        System.out.println(myString.getObject() + ", from Box class");

        Integer[] integers = {1,5,7};
        String[] names = {"John", "Alice", "Bob"};

        printArray(integers);
        printArray(names);
    }

    private static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
    }
}
