package spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "wow_audit_profession")
@AllArgsConstructor
@NoArgsConstructor
public class WowAuditProfession {

    private String id;
    private String operation;
    private Timestamp dateEvent;
    private String idUser;
    private String idProfession;
    private String name;
    private String idTypeprofession;

}
