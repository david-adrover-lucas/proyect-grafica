package com.drover.demo.backend.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.drover.demo.backend.entity.Caja;
import com.drover.demo.backend.repository.CajaRepository;

@Service
public class CajaService {

    private final CajaRepository repository;

    public CajaService(CajaRepository repository) {
        this.repository = repository;
    }

    public void actualizarSaldo(Integer cuentaId, BigDecimal monto, boolean suma) {

        Caja caja = repository.findByCuentaId(cuentaId)
                .orElseGet(() -> {
                    Caja nueva = new Caja();
                    nueva.setCuentaId(cuentaId);
                    nueva.setSaldo(BigDecimal.ZERO);
                    return nueva;
                });

        if (suma) {
            caja.setSaldo(caja.getSaldo().add(monto));
        } else {
            caja.setSaldo(caja.getSaldo().subtract(monto));
        }

        repository.save(caja);
    }

    public BigDecimal obtenerSaldo(Integer cuentaId) {
        return repository.findByCuentaId(cuentaId)
                .map(Caja::getSaldo)
                .orElse(BigDecimal.ZERO);
    }
    public void eliminarCaja(Integer cuentaId) {
        repository.deleteByCuentaId(cuentaId);
    }
    public List<Caja> listarCajas() {
        return repository.findAll();
    }
}
