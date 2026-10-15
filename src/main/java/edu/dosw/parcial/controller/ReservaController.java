package edu.dosw.parcial.controller;

import edu.dosw.parcial.controller.dtos.request.ReservaRequestDTO;
import edu.dosw.parcial.controller.dtos.response.ReservaResponseDTO;
import edu.dosw.parcial.core.services.ReservaService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reservas")
@Slf4j
@RequiredArgsConstructor
public class ReservaController {

    private final ReservaService reservaService;

    @PostMapping
    @Operation(summary = "pedir un turno realizando una reserva")
    public ResponseEntity<ReservaResponseDTO> crearReserva(
            @RequestBody @Valid ReservaRequestDTO reserva
            ) {
        log.info("POST /api/v1/reservas");
        return ResponseEntity.ok(new ReservaResponseDTO());
    }

    @GetMapping
    @Operation(summary = "consultar mis reservas")
    public ResponseEntity<List<ReservaResponseDTO>> obtenerPorId(
            @RequestParam Long id
    ) {
        log.info("GET /api/v1/reservas/{clienteId}");
        return ResponseEntity.ok(List.of(new ReservaResponseDTO()));
    }

    @GetMapping
    @Operation(summary = "consultar todas las reservas")
    public ResponseEntity<List<ReservaResponseDTO>> obtenerTodas(
            @Valid Long id
    ) {
        log.info("GET /api/v1/reservas");
        return ResponseEntity.ok(List.of(new ReservaResponseDTO()));
    }


}
