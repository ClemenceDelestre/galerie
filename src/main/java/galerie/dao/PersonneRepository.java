
package galerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import galerie.entity.Personne ; 
// This will be AUTO IMPLEMENTED by Spring 


/**
 *
 * @author clemz
 */
public interface PersonneRepository extends JpaRepository<Personne, Integer> {
    
}
