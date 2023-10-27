package session14.challenges.just_testing;

import java.util.Objects;

public class Animal {

    private String name;
    private String race;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return name + ":" + race;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(getName(), animal.getName()) && Objects.equals(getRace(), animal.getRace());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRace());
    }
}
