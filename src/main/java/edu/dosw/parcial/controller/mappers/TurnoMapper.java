package edu.dosw.parcial.controller.mappers;

import edu.dosw.parcial.controller.dtos.request.TurnoRequestDTO;
import edu.dosw.parcial.controller.dtos.response.TurnoResponseDTO;
import edu.dosw.parcial.core.models.Turno;

public interface TurnoMapper {

    Turno toDomain(TurnoRequestDTO dto);
    TurnoResponseDTO toResponse(Turno turno);
}
