package ServerLic.user.repository;

import ServerLic.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{
    User findOneById(String id);
    User findByEmail(String email);
}
