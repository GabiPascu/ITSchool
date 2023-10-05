package session10.challenges.challenge_one;

public class challenge_zoo {
}

class Animal {
    void sound() {
        System.out.println("Animal makes sounds: ");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Meow");
    }
}

class Wolf extends Animal {
    @Override
    void sound() {
        System.out.println("How");
    }
}