package edu.dosw.parcial.core.models;

import edu.dosw.parcial.core.models.enums.DiaSemana;
import edu.dosw.parcial.core.models.enums.Especialidad;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Barbero {
    private Long id;
    private String nombre;
    private List<Especialidad> especialidades;
    private List<DiaSemana> diasLaborales;
    private LocalTime horarioInicio;
    private LocalTime horarioFin;

    public void agregarEspecialidad(Especialidad especialidad) {
        this.especialidades.add(especialidad);
    }

    public void removerEspecialidad(Especialidad especialidad) {
        this.especialidades.remove(especialidad);
    }
}
