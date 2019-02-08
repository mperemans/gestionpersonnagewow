package spring.repository;

import org.springframework.data.repository.CrudRepository;
import spring.entity.WowTypePersonnage;

public interface TypePersonnageRepository extends CrudRepository<WowTypePersonnage, String> {
}
