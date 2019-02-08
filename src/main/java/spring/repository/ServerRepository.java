package spring.repository;

import org.springframework.data.repository.CrudRepository;
import spring.entity.WowServer;

public interface ServerRepository extends CrudRepository<WowServer, String> {
}
