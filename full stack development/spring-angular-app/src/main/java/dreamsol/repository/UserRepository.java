package dreamsol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dreamsol.model.Employee;
import dreamsol.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
