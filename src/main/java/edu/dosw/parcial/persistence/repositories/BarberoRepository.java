package edu.dosw.parcial.persistence.repositories;

import edu.dosw.parcial.core.models.enums.Especialidad;
import edu.dosw.parcial.persistence.documents.BarberoDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BarberoRepository extends MongoRepository<BarberoDocument, String> {

}
