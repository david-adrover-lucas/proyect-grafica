package com.drover.demo.backend.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.drover.demo.backend.entity.MovimientoCaja;
import com.drover.demo.backend.repository.MovimientoCajaRepository;

@Service
public class MovimientoCajaService {

    private final MovimientoCajaRepository repository;

    public MovimientoCajaService(MovimientoCajaRepository repository) {
        this.repository = repository;
    }

    public MovimientoCaja guardar(MovimientoCaja mov) {

        if (mov.getCuentaId() == null) {
            throw new RuntimeException("Cuenta obligatoria");
        }

        if (mov.getTipo() == null) {
            throw new RuntimeException("Tipo obligatorio");
        }

        if (mov.getMonto() == null) {
            throw new RuntimeException("Monto obligatorio");
        }

        mov.setCreatedAt(LocalDateTime.now());

        return repository.save(mov);
    }

    public List<MovimientoCaja> listarPorCuenta(Integer cuentaId) {
        return repository.findByCuentaId(cuentaId);
    }

    public List<MovimientoCaja> listarPorTipo(MovimientoCaja.TipoMovimiento tipo) {
        return repository.findByTipo(tipo);
    }
}
