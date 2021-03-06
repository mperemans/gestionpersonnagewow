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
@Table(name = "wow_type_profession")
@AllArgsConstructor
@NoArgsConstructor
public class WowTypeProfession {

    @JsonProperty
    @Column(name = "uuid")
    @Id
    private String uuid;

    @JsonProperty
    @Column(name = "name")
    private String name;

}
