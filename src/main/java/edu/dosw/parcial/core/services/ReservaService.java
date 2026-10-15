package edu.dosw.parcial.core.services;

import edu.dosw.parcial.core.models.Reserva;

import java.util.List;

public interface ReservaService {

    void crear();
    List<Reserva> obtenerPorId(Long id);
    List<Reserva> obtenerTodos();
}
