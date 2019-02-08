package spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "wow_type_profession")
@AllArgsConstructor
@NoArgsConstructor
public class WowTypeProfession {

    private String uuid;
    private String name;

}
