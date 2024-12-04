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

    public String addResource(PcResource resource) {
        repository.save(resource);
        return "Resource added successfully";
    }

    public List<PcResource> getAllResources() {
        return repository.findAll();
    }

    public String updateResource(Long id, PcResource updatedResource) {
        return repository.findById(id).map(resource -> {
            resource.setStatus(updatedResource.getStatus());
            resource.setLastUpdated(updatedResource.getLastUpdated());
            repository.save(resource);
            return "Resource updated successfully";
        }).orElse("Resource not found");
    }
}
