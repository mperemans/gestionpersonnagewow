package spring.repository;

import org.springframework.data.repository.CrudRepository;
import spring.entity.WowPersonnage;

public interface PersonnageRepository extends CrudRepository<WowPersonnage, String> {
}
