package spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "wow_profession")
@AllArgsConstructor
@NoArgsConstructor
public class WowProfession {

    private String uuid;
    private String name;
    private String idTypeprofession;

}
