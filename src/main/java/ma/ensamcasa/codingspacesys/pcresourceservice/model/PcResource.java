package ma.ensamcasa.codingspacesys.pcresourceservice.model;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class PcResource {

    @Id
    private Long id;

    private String status;
    private String lastUpdated;
}
