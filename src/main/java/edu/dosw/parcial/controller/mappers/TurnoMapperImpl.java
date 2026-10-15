package edu.dosw.parcial.controller.mappers;

import edu.dosw.parcial.controller.dtos.request.TurnoRequestDTO;
import edu.dosw.parcial.controller.dtos.response.TurnoResponseDTO;
import edu.dosw.parcial.core.models.Barbero;
import edu.dosw.parcial.core.models.Turno;
import edu.dosw.parcial.core.models.enums.EstadoTurno;
import edu.dosw.parcial.core.utils.DateTimeUtils;
import org.springframework.stereotype.Component;

@Component
public class TurnoMapperImpl implements TurnoMapper {
    @Override
    public Turno toDomain(TurnoRequestDTO dto) {
        Turno turno = new Turno();
        Barbero barberoTemp = new Barbero();
        barberoTemp.setNombre(dto.getNombreBarbero());
        barberoTemp.setEspecialidades(dto.getEspecialidades());

        turno.setBarbero(barberoTemp);
        turno.setEstado(EstadoTurno.DISPONIBLE);
        turno.setInicioFranja(
                DateTimeUtils.pasarALocalDateTime(dto.getFecha(), dto.getHora())
        );
        return turno;
    }

    @Override
    public TurnoResponseDTO toResponse(Turno turno) {
        TurnoResponseDTO dto = new TurnoResponseDTO();
        dto.setId(turno.getId());
        dto.setEstadoTurno(turno.getEstado().toString());
        return dto;
    }
}
