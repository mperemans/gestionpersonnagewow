package spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "wow_personnage")
@AllArgsConstructor
@NoArgsConstructor
public class WowPersonnage {

    private String uuid;
    private String name;
    private String sex;
    private String idType;
    private long level;
    private long armorlevel;
    private String idServer;

}
