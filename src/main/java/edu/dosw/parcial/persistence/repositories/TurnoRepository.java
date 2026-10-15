package edu.dosw.parcial.persistence.repositories;

import edu.dosw.parcial.persistence.documents.TurnoDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TurnoRepository extends MongoRepository<TurnoDocument, String> {


}
