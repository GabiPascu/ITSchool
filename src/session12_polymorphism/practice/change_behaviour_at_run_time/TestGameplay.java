package session12_polymorphism.practice.change_behaviour_at_run_time;

public class TestGameplay {

    public static void main(String[] args) {
        GameCharacter knight = new GameCharacter(new Sword());

        knight.attack();

        knight.setWeapon(new Bow());
        knight.attack();
    }
}
