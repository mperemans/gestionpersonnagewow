package spring.repository.Audit;

import org.springframework.data.repository.CrudRepository;
import spring.entity.Audit.WowAuditRace;

public interface AuditRaceRepository extends CrudRepository<WowAuditRace, String> {
}
