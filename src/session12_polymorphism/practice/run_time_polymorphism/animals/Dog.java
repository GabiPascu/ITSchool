package session12_polymorphism.practice.run_time_polymorphism.animals;

public class Dog extends Animal{

    @Override
    public String sound() {
        return "Dog barks.";
    }
}