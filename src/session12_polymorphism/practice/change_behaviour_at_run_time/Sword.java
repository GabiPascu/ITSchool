package session12_polymorphism.practice.change_behaviour_at_run_time;

public class Sword implements Weapon {

    @Override
    public void use() {
        System.out.println("Swinging the sword!");
    }
}
