package coding_kata.medical_center_app;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Reception {

    public static void main(String[] args) {
        Pacient pacient = new Pacient();
        pacient.setPacientId(UUID.randomUUID());
        pacient.setFirstName("Marycica");
        pacient.setLastName("Liviu");
        pacient.setIssue("Heart");

        System.out.println(pacient);

        Doctor doctor = new Doctor();
        Doctor doctor1 = new Doctor();

        doctor.setName("Mike");
        doctor.setSpecialization("Head");
        doctor1.setName("Amber");
        doctor1.setSpecialization("Heart");

        List<Doctor> doctorList = new ArrayList<>();
        doctorList.add(doctor);
        doctorList.add(doctor1);

        LocalDateTime appointmentDate = LocalDateTime.of(2023, 9, 30, 12, 30);
        Appointment appointment = createAppointment(pacient, doctorList, appointmentDate);

        System.out.println("Appointment: " + appointment);
    }
    public static Doctor getAvailableDoctor(Pacient pacient, List<Doctor> doctorList) {
        for (Doctor doctor : doctorList) {
            if (doctor.getSpecialization().equals(pacient.getIssue())) {
                System.out.println("Doctor found: " + doctor.getName());
                return doctor;
            }
        }
        System.out.println("Doctor not found");
        return null;
    }
    public static Appointment createAppointment(Pacient pacient, List<Doctor> doctorList, LocalDateTime appointmentDate) {
        Appointment appointment = new Appointment();
        appointment.setPacient(pacient);
        appointment.setAppointmentDate(appointmentDate);
        appointment.setDoctor(getAvailableDoctor(pacient, doctorList));

        return appointment;
    }
}