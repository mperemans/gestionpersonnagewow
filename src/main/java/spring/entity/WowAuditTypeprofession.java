package spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "wow_audit_typeprofession")
@AllArgsConstructor
@NoArgsConstructor
public class WowAuditTypeprofession {

    private String id;
    private String operation;
    private Timestamp dateEvent;
    private String idUser;
    private String idTypeprofession;
    private String name;

}
