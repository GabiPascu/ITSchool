package fitness_center_challenge.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Schedule {

    private LocalDate dateEvent;
    private LocalTime startHourEvent;
    private LocalTime endHourEvent;

    @Override
    public String toString() {
        return "Schedule{" +
                "dateEvent=" + dateEvent +
                ", startHourEvent=" + startHourEvent +
                ", endHourEvent=" + endHourEvent +
                '}';
    }
}
