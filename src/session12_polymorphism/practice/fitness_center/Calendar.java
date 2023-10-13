package session12_polymorphism.practice.fitness_center;

import java.time.LocalDateTime;
import java.util.List;

public class Calendar {

    private LocalDateTime localDateTime;
    private List<Member> list;
    private String Activity;

    private String trainer;

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
        LocalDateTime localDateTime1 = LocalDateTime.of(2023,10,20,18,30);

    }

    public List<Member> getList() {
        return list;
    }

    public void setList(List<Member> list) {
        this.list = list;
    }

    public String getActivity() {
        return Activity;
    }

    public void setActivity(String activity) {
        Activity = activity;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "localDateTime=" + localDateTime +
                ", list=" + list +
                ", Activity='" + Activity + '\'' +
                ", trainer='" + trainer + '\'' +
                '}';
    }
}
