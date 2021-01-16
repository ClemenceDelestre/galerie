package galerie.dao;

/**
 *
 * @author clemz
 */
import org.springframework.data.jpa.repository.JpaRepository;
import galerie.entity.Exposition;

// This will be AUTO IMPLEMENTED by Spring 

public interface ExpositionRepository extends JpaRepository<Exposition, Integer> {

}
