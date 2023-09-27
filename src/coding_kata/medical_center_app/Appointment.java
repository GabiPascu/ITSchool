package coding_kata.medical_center_app;

import java.time.LocalDateTime;

public class Appointment {

    private LocalDateTime appointmentDate;
    private String description;
    private Pacient pacient;

    private Doctor doctor;


    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentDate=" + appointmentDate +
                ", description='" + description + '\'' +
                ", pacient=" + pacient +
                ", doctor=" + doctor +
                '}';
    }
}
