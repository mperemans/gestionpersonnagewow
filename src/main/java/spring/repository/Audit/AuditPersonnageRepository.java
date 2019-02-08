package spring.repository.Audit;

import org.springframework.data.repository.CrudRepository;
import spring.entity.Audit.WowAuditPersonnage;

public interface AuditPersonnageRepository extends CrudRepository<WowAuditPersonnage, String> {
}
