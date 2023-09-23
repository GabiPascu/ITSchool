package session7.online_store;

import java.time.LocalDateTime;

public class OnlineStore {

    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Biden");
        user.setAge(55);
        user.setEmail("john@gmail.com");
        user.setCreateAt(LocalDateTime.now());

        System.out.println("User created: " + user);
    }
}
