package edu.dosw.parcial.core.models;

import edu.dosw.parcial.core.models.enums.EstadoTurno;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Turno {
    private Long id;
    private Barbero barbero;
    private EstadoTurno estado;
    private LocalDateTime inicioFranja;

    public void cambiarEstado(EstadoTurno estado) {
        this.estado = estado;
    }
}
