package galerie.dao;

/**
 *
 * @author clemz
 */
import org.springframework.data.jpa.repository.JpaRepository;
import galerie.entity.Exposition;
import org.springframework.data.jpa.repository.Query;


// This will be AUTO IMPLEMENTED by Spring 

public interface ExpositionRepository extends JpaRepository<Exposition, Integer> {
    /**
    * Calculer le chiffre d'affaires pour une exposition
    * @param id la clé primaire de l'exposition
    * @return le chiffre d'affaires de cette exposition
    */
    @Query( 
            value = 
            "SELECT sum(prix_Vente)"
            + "FROM Transactions INNER JOIN Exposition ON (Transactions.lieu_de_vente_id = Exposition.id) "
            + "WHERE Exposition.id = :id",
            nativeQuery = true
    )
    
    float chiffreAffairePour(Integer id);
}
