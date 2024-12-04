package ma.ensamcasa.codingspacesys.pcresourceservice.repository;

import ma.ensamcasa.codingspacesys.pcresourceservice.model.PcResource;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PcResourceRepository extends MongoRepository<PcResource, Long> {
}
