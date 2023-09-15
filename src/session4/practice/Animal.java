package session4.practice;

import java.util.Objects;

public class Animal {
    public String name;
    public int age;
    private double weight;
    private boolean isWild;
    private String sex;
    private String diet;
    private String colour;
    private String animalType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Double.compare(weight, animal.weight) == 0 && isWild == animal.isWild && Objects.equals(getName(), animal.getName()) && Objects.equals(sex, animal.sex) && Objects.equals(diet, animal.diet) && Objects.equals(colour, animal.colour) && Objects.equals(animalType, animal.animalType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), age, weight, isWild, sex, diet, colour, animalType);
    }
}
