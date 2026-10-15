package edu.dosw.parcial.persistence.mappers;

import edu.dosw.parcial.core.models.Turno;
import edu.dosw.parcial.persistence.documents.TurnoDocument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TurnoDocumentMapper {

    Turno toDomain(TurnoDocument documento);
    TurnoDocument toDocument(Turno turno);
}
