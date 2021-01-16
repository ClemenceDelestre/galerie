package galerie.entity;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

@ToString @NoArgsConstructor @Getter @Setter @RequiredArgsConstructor

/**
 *
 * @author clemz
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Column(unique=true)
    @NonNull
    private String nom;
    
    @Column(unique=true)
    private String adresse;
    
    @OneToMany (mappedBy = "client")
    private List<Transactions> achats = new LinkedList<>(); 
    
    public float budgetArt (int annee) {
        float budgetArtAnnuel = 0 ; 
        for (Transactions tr : achats) {
            if (tr.getVenduLe().getYear() == annee) {
                budgetArtAnnuel += tr.getPrixVente() ; 
            }
        }
        return budgetArtAnnuel ; 
    }
}

