package edu.dosw.parcial.core.models;

import edu.dosw.parcial.core.models.enums.Especialidad;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Servicio {
    private Long id;
    private String nombre;
    private Double precio;
    private Especialidad especialidad;

    public void cobrar() {
    }
}