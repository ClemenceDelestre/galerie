package galerie.entity;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Galerie {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Column(unique=true)
    @NonNull
    private String nom;
    
    @Column(unique=true)
    @NonNull
    private String adresse;
    
    @OneToMany (mappedBy = "organisateur")
    private List<Exposition> evenements = new LinkedList<>(); 
    
    public float CAannuel (int annee) {
        float ChiffreAffAnnuel = 0 ;
        for (Exposition e : evenements) { 
            LocalDate AnneeEvenement = e.getDebut().plusDays(e.getDuree());
            //On part du principe qu'ici pour une exposition chevauchant deux années, le CA de celle ci part dans l'annee de fin
            //subjectif car pas d'indications
            if (AnneeEvenement.getYear() == annee) {
                ChiffreAffAnnuel += e.CA();
            } 
        }
        return ChiffreAffAnnuel ; 
    }
}
