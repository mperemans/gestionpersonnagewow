package spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "wow_audit_personnage")
@AllArgsConstructor
@NoArgsConstructor
public class WowAuditPersonnage {

    private String id;
    private String operation;
    private Timestamp dateEvent;
    private String idUser;
    private String idPersonnage;
    private String name;
    private String sex;
    private String idTypePersonnage;
    private long level;
    private long armorlevel;
    private String idServer;

}
