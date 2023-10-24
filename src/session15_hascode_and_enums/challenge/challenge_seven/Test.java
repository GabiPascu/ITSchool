package session15_hascode_and_enums.challenge.challenge_seven;

import java.time.LocalDateTime;

public class Test {

    public static void main(String[] args) {
        Entity entity1 = new Entity();
        entity1.setId(23);
        entity1.setName("John");
        entity1.setTimeStamp(LocalDateTime.of(2023, 12,12,20,30));

        Entity entity2 = new Entity();
        entity1.setId(22);
        entity1.setName("John");
        entity1.setTimeStamp(LocalDateTime.of(2023, 12,12,20,40));

        System.out.println(entity2.equals(entity1));
    }
}
