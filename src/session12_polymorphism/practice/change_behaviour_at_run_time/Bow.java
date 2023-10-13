package session12_polymorphism.practice.change_behaviour_at_run_time;

public class Bow implements Weapon{

    @Override
    public void use() {
        System.out.println("Shooting an arrow!");
    }
}
