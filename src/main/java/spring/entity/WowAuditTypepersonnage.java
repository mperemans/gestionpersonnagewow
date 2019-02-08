package spring.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "wow_audit_typepersonnage")
@AllArgsConstructor
@NoArgsConstructor
public class WowAuditTypepersonnage {

    @JsonProperty
    @Column(name = "id")
    @Id
    private String id;

    @JsonProperty
    @Column(name = "operation")
    private String operation;

    @JsonProperty
    @Column(name = "dateEvent")
    private Timestamp dateEvent;

    @JsonProperty
    @Column(name = "id_user")
    private String idUser;

    @JsonProperty
    @Column(name = "id_type_personnage")
    private String idTypePersonnage;

    @JsonProperty
    @Column(name = "id_race")
    private String idRace;

    @JsonProperty
    @Column(name = "id_classe")
    private String idClasse;

}
