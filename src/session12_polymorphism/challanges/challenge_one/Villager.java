package session12_polymorphism.challanges.challenge_one;

public class Villager {

    private Action action;

    public Villager(Action action) {
        this.action = action;
    }

    public void setAction (Action action) {
        this.action = action;
    }

    public void pickItem () {
        action.doing();
    }
}
