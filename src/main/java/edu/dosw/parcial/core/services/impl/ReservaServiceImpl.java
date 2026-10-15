package edu.dosw.parcial.core.services.impl;

import edu.dosw.parcial.core.models.Reserva;
import edu.dosw.parcial.core.services.ReservaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {
    @Override
    public void crear() {

    }

    @Override
    public List<Reserva> obtenerPorId(Long id) {
        return List.of();
    }

    @Override
    public List<Reserva> obtenerTodos() {
        return List.of();
    }
}
