package ro.itschool.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.itschool.project.models.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}