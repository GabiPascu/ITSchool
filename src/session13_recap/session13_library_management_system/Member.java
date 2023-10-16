package session13_recap.session13_library_management_system;

import java.util.UUID;

public class Member {

    private String name;
    private String address;
    private int contactInfo;
    private UUID ID;

    public Member(String name, UUID ID) {
        this.name = name;
        this.ID = ID;
    }
}
