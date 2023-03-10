package learn.spring.loginregisterspringsecurity.repository;

import learn.spring.loginregisterspringsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// a repository to perform CRUD operations.
@Repository
public interface UserRepository extends JpaRepository<User,Long > {
}
