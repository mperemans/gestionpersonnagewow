package spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "wow_type_personnage")
@AllArgsConstructor
@NoArgsConstructor
public class WowTypePersonnage {

    private String uuid;
    private String idRace;
    private String idClasse;

}
