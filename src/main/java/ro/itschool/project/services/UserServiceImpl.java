package ro.itschool.project.services;

import org.springframework.stereotype.Service;
import ro.itschool.project.models.dtos.UserDTO;
import ro.itschool.project.models.entities.User;
import ro.itschool.project.repositories.UserRepository;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        //validate DTO
        //convert DTO to entity
        //save entity to database
        //convert entity to DTO

        //validation
        if (userDTO.getFirstName().length() < 3) {
            throw new IllegalArgumentException("Invalid first name.");
        }

        //conversion to entity
        User userEntity = new User();
        userEntity.setFirstName(userDTO.getFirstName());
        userEntity.setLastName(userDTO.getLastName());
        userEntity.setEmail(userDTO.getEmail());

        //save entity to database
        User savedUser = userRepository.save(userEntity);

        //conversion to DTO
        UserDTO userResponseDTO = new UserDTO();
        userResponseDTO.setId(savedUser.getId());
        userResponseDTO.setEmail(savedUser.getEmail());
        userResponseDTO.setFirstName(savedUser.getFirstName());
        userResponseDTO.setLastName(savedUser.getLastName());

        return userResponseDTO;
    }
}
