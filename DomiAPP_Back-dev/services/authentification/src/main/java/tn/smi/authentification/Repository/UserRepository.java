package tn.smi.authentification.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.smi.authentification.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByEmail (String Email);

}
