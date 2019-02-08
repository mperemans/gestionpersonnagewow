package spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "wow_server")
@AllArgsConstructor
@NoArgsConstructor
public class WowServer {

    private String uuid;
    private String name;
    private String region;

}
