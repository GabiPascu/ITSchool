package session10.challenges.challenge_one;

public class TestAnimal {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Wolf wolf = new Wolf();

        animal.sound();
        dog.sound();
        cat.sound();
        wolf.sound();
    }
}
