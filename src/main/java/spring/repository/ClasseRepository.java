package spring.repository;

import org.springframework.data.repository.CrudRepository;
import spring.entity.WowClasse;

public interface ClasseRepository extends CrudRepository<WowClasse, String> {
}
