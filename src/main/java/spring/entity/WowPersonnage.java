package spring.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "wow_personnage")
@AllArgsConstructor
@NoArgsConstructor
public class WowPersonnage {

    @JsonProperty
    @Column(name = "uuid")
    @Id
    private String uuid;

    @JsonProperty
    @Column(name = "name")
    private String name;

    @JsonProperty
    @Column(name = "sex")
    private String sex;

    @JsonProperty
    @Column(name = "id_type")
    private String idType;

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
