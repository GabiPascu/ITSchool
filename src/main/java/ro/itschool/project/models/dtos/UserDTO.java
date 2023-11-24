package ro.itschool.project.models.dtos;

import lombok.Data;

@Data
public class UserDTO {

    private Long id;

    private String firstName;
    private String lastName;
    private String email;
}