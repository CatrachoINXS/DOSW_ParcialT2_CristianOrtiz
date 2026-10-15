package edu.dosw.parcial.core.models;

import edu.dosw.parcial.core.models.enums.EstadoReserva;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reserva {

    private Long id;
    private String clienteId;
    private Turno turno;
    private Servicio servicio;
    private EstadoReserva estado;

    public void cancelar() {
        this.estado = EstadoReserva.CANCELADA;
    }

}