package edu.dosw.parcial.core.services.impl;

import edu.dosw.parcial.core.validators.ITurnoValidator;
import edu.dosw.parcial.persistence.documents.TurnoDocument;
import edu.dosw.parcial.persistence.mappers.TurnoDocumentMapper;
import edu.dosw.parcial.core.models.Turno;
import edu.dosw.parcial.core.services.TurnoService;
import edu.dosw.parcial.persistence.repositories.TurnoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TurnoServiceImpl implements TurnoService {

    private final TurnoRepository turnoRepository;
    private final TurnoDocumentMapper documentMapper;
    private final ITurnoValidator validator;

    @Override
    public Turno crear(Turno turno) {
        validator.validarTurno(turno);
        TurnoDocument guardado = turnoRepository.save(documentMapper.toDocument(turno));
        return documentMapper.toDomain(guardado);
    }
}
