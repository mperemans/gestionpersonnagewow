package spring.entity.Audit;

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
@Table(name = "wow_audit_personnage")
@AllArgsConstructor
@NoArgsConstructor
public class WowAuditPersonnage {

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
    @Column(name = "id_personnage")
    private String idPersonnage;

    @JsonProperty
    @Column(name = "name")
    private String name;

    @JsonProperty
    @Column(name = "sex")
    private String sex;

    @JsonProperty
    @Column(name = "id_type_personnage")
    private String idTypePersonnage;

    @JsonProperty
    @Column(name = "level")
    private long level;

    @JsonProperty
    @Column(name = "armorlevel")
    private long armorlevel;

    @JsonProperty
    @Column(name = "id_server")
    private String idServer;

}
