package session9.challenges.challenge_one;

public class Courses {

    private String math;
    private String computerScience;
    private String physics;
    private String chemistry;
    private String biology;
    private String geography;
    private String english;
    private String history;
    private String startClass;

    Courses(String math, String computerScience, String physics, String chemistry, String biology, String geography, String english, String history, String startClass){
        this.math = math;
        this.computerScience = computerScience;
        this.physics = physics;
        this.chemistry = chemistry;
        this.biology = biology;
        this.geography = geography;
        this.english = english;
        this.history = history;
        this.startClass = startClass;
    }

    public String getStartClass() {
        return startClass;
    }
    public void setStartClass(){
        this.startClass = startClass;
    }
    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getComputerScience() {
        return computerScience;
    }

    public void setComputerScience(String computerScience) {
        this.computerScience = computerScience;
    }

    public String getPhysics() {
        return physics;
    }

    public void setPhysics(String physics) {
        this.physics = physics;
    }

    public String getChemistry() {
        return chemistry;
    }

    public void setChemistry(String chemistry) {
        this.chemistry = chemistry;
    }

    public String getBiology() {
        return biology;
    }

    public void setBiology(String biology) {
        this.biology = biology;
    }

    public String getGeography() {
        return geography;
    }

    public void setGeography(String geography) {
        this.geography = geography;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "math='" + math + '\'' +
                ", computerScience='" + computerScience + '\'' +
                ", physics='" + physics + '\'' +
                ", chemistry='" + chemistry + '\'' +
                ", biology='" + biology + '\'' +
                ", geography='" + geography + '\'' +
                ", english='" + english + '\'' +
                ", history='" + history + '\'' +
                ", startClass='" + startClass + '\'' +
                '}';
    }
}
