package spring.repository;

import org.springframework.data.repository.CrudRepository;
import spring.entity.WowTypeRace;

public interface TypeRaceRepository extends CrudRepository<WowTypeRace, String> {
}
