package spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "wow_race")
@AllArgsConstructor
@NoArgsConstructor
public class WowRace {

    private String uuid;
    private String name;
    private String idTyperace;

}
