package session9.challenges.challenge_one;

import java.time.LocalDate;

public class Professor {

    private String firstName;
    private String lastName;
    private String sex;
    private short age;
    private LocalDate birthDate;
    private int CNP;
    private String address;

    Professor(String firstName, String lastName, String sex, short age, LocalDate birthDate, int CNP, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.birthDate = birthDate;
        this.CNP = CNP;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public short getAge() {
        return age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getCNP() {
        return CNP;
    }

    public String getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setCNP(int CNP) {
        this.CNP = CNP;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", CNP=" + CNP +
                ", address='" + address + '\'' +
                '}';
    }
}