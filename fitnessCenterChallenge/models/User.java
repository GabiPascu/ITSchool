package fitnessCenterChallenge.models;

import java.util.UUID;

public abstract class User {

    private UUID userID;
    private String name;
    // user HAS_A personal detail


    public User(String name) {
        this.name = name;
    }

    public UUID getUserID() {
        return userID;
    }

    protected void setUserID(UUID userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }


}


