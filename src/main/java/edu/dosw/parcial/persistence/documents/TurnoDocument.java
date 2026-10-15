package edu.dosw.parcial.persistence.documents;

import edu.dosw.parcial.core.models.Barbero;
import edu.dosw.parcial.core.models.enums.EstadoTurno;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "turnos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TurnoDocument {

    @Id
    private String id;
    private Barbero barbero;
    private EstadoTurno estado;
    private LocalDateTime inicioFranja;

}
