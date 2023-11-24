package ro.itschool.project.services;

import ro.itschool.project.models.dtos.UserDTO;

public interface UserService {

    UserDTO createUser(UserDTO userDTO);
}
