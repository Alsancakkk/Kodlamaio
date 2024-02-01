package JavaBootcamp.Kodlama.io.Devs.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor //Lombok ile parametreli constructor
@NoArgsConstructor  //Lombok ile parametresiz constructor
@Getter //Lombok ile getter
@Setter //Lombok ile setter
@Entity
@Table(name = "languages")
public class Languages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Id'yı otomatik artan yapar
    @Column(name = "id")    // Tablodaki id kolonunun karşılığı olarak belirttik.
    private int id;
    @Column(name = "name")  // Tablodaki name kolonunun karşılığı olarak belirttik.
    private String name;


}
