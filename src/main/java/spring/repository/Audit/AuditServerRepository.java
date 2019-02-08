package spring.repository.Audit;

import org.springframework.data.repository.CrudRepository;
import spring.entity.Audit.WowAuditServer;

public interface AuditServerRepository extends CrudRepository<WowAuditServer, String> {
}
