package fitnessCenterChallenge.models;

import java.util.UUID;

public class Member extends User {

    public Member(String name) {
        super(name);
        setUserID(UUID.randomUUID());
    }

    @Override
    public String toString() {
        return "Member name: " + getName();
    }
}
