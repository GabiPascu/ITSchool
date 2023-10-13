package session12_polymorphism.practice.fitness_center;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GymApp {

    public static void main(String[] args) {

        Membership membership = new Membership();

        Member ken = new Member();
        ken.setName("Ken");
        ken.setUserId(UUID.randomUUID());

        System.out.println(ken);
        membership.upPremium();

        Calendar calendar = new Calendar();

        calendar.setTrainer("Dobrica");
       // calendar.setLocalDateTime(LocalDateTime.of(2023, 10,20,18,30));
        calendar.setLocalDateTime(calendar.getLocalDateTime());
        System.out.println(calendar);
    }
}
