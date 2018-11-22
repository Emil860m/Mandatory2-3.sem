package Repositories;

import model.User;
import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository<User, Long> {
}
