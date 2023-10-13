package session12_polymorphism.practice.fitness_center;

import java.util.UUID;

public class Member {

    private UUID userId;
    private String name;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }
}
