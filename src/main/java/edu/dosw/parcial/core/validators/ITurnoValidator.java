package edu.dosw.parcial.core.validators;

import edu.dosw.parcial.core.models.Barbero;
import edu.dosw.parcial.core.models.Turno;

import java.time.LocalDateTime;

public interface ITurnoValidator {

    default void validarTurno(Turno turno) {
        Barbero barbero = turno.getBarbero();
        validarBarberoExistente(barbero);
        validarFechaEnDiaDisponible(turno.getInicioFranja(), barbero);
        validarTurnoUnico(turno);
    }

    void validarBarberoExistente(Barbero barbero);
    void validarFechaEnDiaDisponible(LocalDateTime inicioFranja, Barbero barbero);
    void validarTurnoUnico(Turno turno);
}
