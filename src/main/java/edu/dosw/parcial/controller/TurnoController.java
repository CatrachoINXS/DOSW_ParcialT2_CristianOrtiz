package edu.dosw.parcial.controller;

import edu.dosw.parcial.controller.dtos.request.TurnoRequestDTO;
import edu.dosw.parcial.controller.dtos.response.TurnoResponseDTO;
import edu.dosw.parcial.core.models.Turno;
import edu.dosw.parcial.core.services.TurnoService;
import edu.dosw.parcial.controller.mappers.TurnoMapper;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/turnos")
@Slf4j
@RequiredArgsConstructor
public class TurnoController {

    private final TurnoService turnoService;
    private final TurnoMapper turnoMapper;

    @PostMapping
    @Operation(summary = "Crear un nuevo turno")
    public ResponseEntity<TurnoResponseDTO> crearTurno(
            @RequestBody @Valid TurnoRequestDTO dto
            ) {
        log.info("POST /api/v1/turnos");
        Turno turno = turnoMapper.toDomain(dto);
        Turno creado = turnoService.crear(turno);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(turnoMapper.toResponse(creado));
    }

}
