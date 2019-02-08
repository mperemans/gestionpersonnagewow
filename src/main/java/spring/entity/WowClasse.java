package spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "wow_classe")
@AllArgsConstructor
@NoArgsConstructor
public class WowClasse {

    private String uuid;
    private String name;

}
