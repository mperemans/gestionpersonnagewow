package spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "wow_audit_server")
@AllArgsConstructor
@NoArgsConstructor
public class WowAuditServer {

    private String id;
    private String operation;
    private java.sql.Timestamp dateEvent;
    private String idUser;
    private String idServer;
    private String name;
    private String region;

}
