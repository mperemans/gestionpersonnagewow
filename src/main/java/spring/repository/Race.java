package spring.repository;

import org.springframework.data.repository.CrudRepository;
import spring.entity.WowRace;

public interface Race extends CrudRepository<WowRace, String> {
}
