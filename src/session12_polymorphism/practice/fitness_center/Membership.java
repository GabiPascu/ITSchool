package session12_polymorphism.practice.fitness_center;

public class Membership extends Member {

    void upBasic() {
        System.out.println("Upgraded to Basic pack");
    }

    void upPremium() {
        System.out.println("Upgraded to premium");
    }

    void upPlatinum() {
        System.out.println("Upgraded to platinum");
    }
}
