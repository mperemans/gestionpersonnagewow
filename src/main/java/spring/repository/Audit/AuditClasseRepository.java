package spring.repository.Audit;

import org.springframework.data.repository.CrudRepository;
import spring.entity.Audit.WowAuditClasse;

public interface AuditClasseRepository extends CrudRepository<WowAuditClasse, String> {
}
