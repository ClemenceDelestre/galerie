package galerie.entity;
import javax.persistence.*;
import lombok.*;
import java.time.LocalDate; 
import java.util.LinkedList;
import java.util.List;

@ToString @NoArgsConstructor @Getter @Setter @RequiredArgsConstructor

/**
 *
 * @author clemz
 */
@Entity
public class Exposition {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private LocalDate debut;
    
    @Column(unique=true)
    @NonNull
    private String intitule ;
    
    @Column(unique=true)
    @NonNull
    private Integer duree ;
    
    @ManyToOne
    private Galerie organisateur ;
    
    @ManyToMany
    private List<Tableau> oeuvres = new LinkedList<>();
    
    @OneToMany (mappedBy = "lieuDeVente")
    private List<Transactions> ventes = new LinkedList <>();  
    
    public float CA() {
        float ChiffreAffaire = 0 ; 
        for (Transactions t : ventes) {
            ChiffreAffaire += t.getPrixVente() ;
        }
        return ChiffreAffaire ; 
    }
}
