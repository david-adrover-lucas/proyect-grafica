package com.drover.demo.backend.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.drover.demo.backend.entity.MovimientoCaja;
import com.drover.demo.backend.entity.Pago;
import com.drover.demo.backend.repository.MovimientoCajaRepository;
import com.drover.demo.backend.repository.PagoRepository;

@Service
public class PagoService {

    private final PagoRepository pagoRepository;
    private final MovimientoCajaRepository movimientoRepository;

    public PagoService(PagoRepository pagoRepository,
                       MovimientoCajaRepository movimientoRepository) {
        this.pagoRepository = pagoRepository;
        this.movimientoRepository = movimientoRepository;
    }

    public Pago registrarPago(Pago pago) {

        if (pago.getVentaId() == null) {
            throw new RuntimeException("Venta obligatoria");
        }

        if (pago.getCuentaId() == null) {
            throw new RuntimeException("Cuenta obligatoria");
        }

        if (pago.getMonto() == null || pago.getMonto().compareTo(BigDecimal.ZERO) <= 0) {
            throw new RuntimeException("Monto inválido");
        }

        pago.setCreatedAt(LocalDateTime.now());

        Pago guardado = pagoRepository.save(pago);

        // 💣 impacta en caja
        MovimientoCaja mov = new MovimientoCaja();
        mov.setCuentaId(pago.getCuentaId());
        mov.setTipo(MovimientoCaja.TipoMovimiento.INGRESO);
        mov.setMonto(pago.getMonto());
        mov.setDescripcion("Pago venta #" + pago.getVentaId());
        mov.setVentaId(pago.getVentaId());
        mov.setCreatedAt(LocalDateTime.now());

        movimientoRepository.save(mov);

        return guardado;
    }

    public List<Pago> listarPorVenta(Integer ventaId) {
        return pagoRepository.findByVentaId(ventaId);
    }
}
