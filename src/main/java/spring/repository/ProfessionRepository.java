package spring.repository;

import org.springframework.data.repository.CrudRepository;
import spring.entity.WowProfession;

public interface ProfessionRepository extends CrudRepository<WowProfession, String> {
}
