package spring.repository.Audit;

import org.springframework.data.repository.CrudRepository;
import spring.entity.Audit.WowAuditProfession;

public interface AuditProfessionRepository extends CrudRepository<WowAuditProfession, String> {
}
