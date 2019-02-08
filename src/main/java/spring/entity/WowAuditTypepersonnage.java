package spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "wow_audit_typepersonnage")
@AllArgsConstructor
@NoArgsConstructor
public class WowAuditTypepersonnage {

    private String id;
    private String operation;
    private Timestamp dateEvent;
    private String idUser;
    private String idTypePersonnage;
    private String idRace;
    private String idClasse;

}
