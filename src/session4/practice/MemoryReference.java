package session4.practice;

public class MemoryReference {

    public static void main(String[] args) {
        Animal lion = new Animal();
        System.out.println(lion.name); //null -> no name set
        System.out.println(lion.age); //0 -> no age set
        lion.setName("Simba");

        Animal lion2 = new Animal();
        lion2.setName("Simba");
        Animal lion3 = new Animal();
        lion3.setName("Simba");

        System.out.println(lion2 == lion3); //false
        System.out.println(lion2.equals(lion3));

        Animal lion4 = new Animal();
        lion4.setAge(10);
        Animal lion5 = new Animal();
        lion5.setAge(5);
        System.out.println("Animals with different age: " + lion4.equals(lion5));
    }
}
