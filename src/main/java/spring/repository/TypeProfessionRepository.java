package spring.repository;

import org.springframework.data.repository.CrudRepository;
import spring.entity.WowTypeProfession;

public interface TypeProfessionRepository extends CrudRepository<WowTypeProfession, String> {
}
