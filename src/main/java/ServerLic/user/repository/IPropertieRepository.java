package ServerLic.user.repository;
import ServerLic.user.domain.Propertie;
import ServerLic.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPropertieRepository extends JpaRepository<Propertie, Long> {
        Propertie findOneById(Long id);
}
