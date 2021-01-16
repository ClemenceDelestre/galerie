package galerie.entity;
import java.util.*; 
import javax.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
/**
 *
 * @author clemz
 */
@Entity
public class Tableau {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private String titre;
    
    @Column(unique=true)
    @NonNull
    private String support ;
    
    @Column(unique=true)
    @NonNull
    private int largeur ;
    
    @Column(unique=true)
    @NonNull
    private int hauteur ;
    
    @OneToOne (mappedBy  = "oeuvre")
    private Transactions vendu ;
    
    @ManyToOne
    private Artiste auteur ; 
    
    @ManyToMany (mappedBy = "oeuvres")
    private List<Exposition> accrochages = new LinkedList<>(); 
}
