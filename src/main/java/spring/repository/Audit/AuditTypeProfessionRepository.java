package spring.repository.Audit;

import org.springframework.data.repository.CrudRepository;
import spring.entity.Audit.WowAuditTypeprofession;

public interface AuditTypeProfessionRepository extends CrudRepository<WowAuditTypeprofession, String> {
}
