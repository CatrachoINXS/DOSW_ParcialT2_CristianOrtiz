package edu.dosw.parcial.controller.dtos.response;

import edu.dosw.parcial.core.models.enums.EstadoTurno;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TurnoResponseDTO {

    private Long id;
    private String estadoTurno;
}
