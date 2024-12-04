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

    @PostMapping
    public ResponseEntity<String> addResource(@RequestBody PcResource resource) {
        String response = service.addResource(resource);
        return ResponseEntity.status(201).body(response);
    }

    @GetMapping
    public ResponseEntity<List<PcResource>> getAllResources() {
        List<PcResource> resources = service.getAllResources();
        return ResponseEntity.ok(resources);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateResource(@PathVariable Long id, @RequestBody PcResource resource) {
        String response = service.updateResource(id, resource);
        return ResponseEntity.ok(response);
    }
}
