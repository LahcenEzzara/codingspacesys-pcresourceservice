package ma.ensamcasa.codingspacesys.pcresourceservice.service;

import ma.ensamcasa.codingspacesys.pcresourceservice.model.PcResource;
import ma.ensamcasa.codingspacesys.pcresourceservice.repository.PcResourceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcResourceService {

    private final PcResourceRepository repository;

    public PcResourceService(PcResourceRepository repository) {
        this.repository = repository;
    }

    public List<PcResource> getAllResources() {
        return repository.findAll();
    }

    public PcResource updateResource(String id, PcResource updatedResource) {
        return repository.findById(id).map(resource -> {
            resource.setStatus(updatedResource.getStatus());
            resource.setLastUpdated(updatedResource.getLastUpdated());
            return repository.save(resource);
        }).orElseThrow(() -> new RuntimeException("Resource not found"));
    }
}
