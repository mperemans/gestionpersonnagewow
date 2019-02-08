package spring.repository.Audit;

import org.springframework.data.repository.CrudRepository;
import spring.entity.Audit.WowAuditTypepersonnage;

public interface AuditTypePersonnageRepository extends CrudRepository<WowAuditTypepersonnage, String> {
}
