package galerie.entity;
import java.util.*; 
import javax.persistence.*;
import lombok.*;

@ToString @NoArgsConstructor @Getter @Setter @RequiredArgsConstructor
/**
 *
 * @author clemz
 */
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Artiste extends Personne {
    
     @Column(unique=true)
     @NonNull
     private String biographie;
     
     @OneToMany (mappedBy = "auteur")
     private List<Tableau> oeuvres = new LinkedList<>() ; 
         
}
