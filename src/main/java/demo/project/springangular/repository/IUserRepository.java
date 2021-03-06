package demo.project.springangular.repository;

import demo.project.springangular.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

//    Optional<User> findByUserName(String username);

    Optional<User> findByEmail(String email);

}
