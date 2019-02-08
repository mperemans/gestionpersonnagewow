package spring.repository.Audit;

import org.springframework.data.repository.CrudRepository;
import spring.entity.Audit.WowAuditTyperace;

public interface AuditTypeRaceRepository extends CrudRepository<WowAuditTyperace, String> {
}
