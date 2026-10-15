package edu.dosw.parcial.persistence.documents;

import edu.dosw.parcial.core.models.enums.DiaSemana;
import edu.dosw.parcial.core.models.enums.Especialidad;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalTime;
import java.util.List;

@Document(collection = "barberos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BarberoDocument {

    @Id
    private String id;
    private String nombre;
    private List<Especialidad> especialidades;
    private List<DiaSemana> diasLaborales;
    private LocalTime horarioInicio;
    private LocalTime horarioFin;
}
