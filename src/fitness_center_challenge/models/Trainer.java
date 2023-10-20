package fitness_center_challenge.models;

import java.util.UUID;

public class Trainer extends User {

    public Trainer(UUID userID, String name) {
        super(name);
    }
}
