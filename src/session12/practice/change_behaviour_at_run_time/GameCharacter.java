package session12.practice.change_behaviour_at_run_time;

public class GameCharacter {

    private Weapon weapon; //using composition

    public GameCharacter(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.use();
    }
}
