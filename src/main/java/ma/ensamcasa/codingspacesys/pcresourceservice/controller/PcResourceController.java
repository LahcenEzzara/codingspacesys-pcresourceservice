package ma.ensamcasa.codingspacesys.pcresourceservice.controller;

import ma.ensamcasa.codingspacesys.pcresourceservice.model.PcResource;
import ma.ensamcasa.codingspacesys.pcresourceservice.service.PcResourceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pc-resources")
public class PcResourceController {

    private final PcResourceService service;

    public PcResourceController(PcResourceService service) {
        this.service = service;
    }

    @GetMapping
    public List<PcResource> getAllResources() {
        return service.getAllResources();
    }

    @PutMapping("/{id}")
    public ResponseEntity<PcResource> updateResource(@PathVariable String id, @RequestBody PcResource resource) {
        return ResponseEntity.ok(service.updateResource(id, resource));
    }
}