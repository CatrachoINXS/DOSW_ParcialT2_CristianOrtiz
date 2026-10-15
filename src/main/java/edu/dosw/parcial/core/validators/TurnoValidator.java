package edu.dosw.parcial.core.validators;

import edu.dosw.parcial.core.models.Barbero;
import edu.dosw.parcial.core.models.Turno;
import edu.dosw.parcial.persistence.repositories.BarberoRepository;
import edu.dosw.parcial.persistence.repositories.TurnoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Component
@RequiredArgsConstructor
public class TurnoValidator implements ITurnoValidator {

    private final TurnoRepository repository;
    private final BarberoRepository barberoRepository;

    @Override
    public void validarBarberoExistente(Barbero barbero) {

    }

    @Override
    public void validarFechaEnDiaDisponible(LocalDateTime inicioFranja, Barbero barbero) {
        boolean diaDisponible = barbero.getDiasLaborales().stream()
                .map(Object::toString)
                .anyMatch(d -> inicioFranja.getDayOfWeek().name().equalsIgnoreCase(d));

        LocalTime horario = inicioFranja.toLocalTime();
        boolean horarioHabil = horario.isAfter(barbero.getHorarioInicio()) &&
                horario.isBefore(barbero.getHorarioFin());

        if (!diaDisponible) {
            //Implementar lo de excepciones
        } else if (!horarioHabil) {
            //Implementar excepcion especifica
        }
    }

    @Override
    public void validarTurnoUnico(Turno turno) {

    }
}
