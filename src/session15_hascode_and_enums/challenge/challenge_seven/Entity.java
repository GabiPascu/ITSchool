package session15_hascode_and_enums.challenge.challenge_seven;

import java.time.LocalDateTime;
import java.util.Objects;

public class Entity {

    private int id;
    private String name;
    private LocalDateTime timeStamp;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return id == entity.id && Objects.equals(name, entity.name) && Objects.equals(timeStamp, entity.timeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, timeStamp);
    }

}
