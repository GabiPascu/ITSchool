package session12_polymorphism.challanges.challenge_one;

public class VillagerGame {

    public static void main(String[] args) {
        Villager guy = new Villager(new Rake());

        guy.pickItem();
        guy.setAction(new Crop());
        guy.pickItem();
    }
}
