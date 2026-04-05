package com.drover.demo.backend.service;


import com.drover.demo.backend.entity.Producto;

import com.drover.demo.backend.repository.ProductoRepository;
import com.drover.demo.backend.repository.VentaDetalleRepository;
import com.drover.demo.backend.repository.VentaRepository;
import com.drover.demo.backend.entity.Venta;
import com.drover.demo.backend.entity.VentaDetalle;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class VentaDetalleService {

    private final VentaDetalleRepository detalleRepository;
    private final ProductoRepository productoRepository;
    private final ProductoService productoService;
    private final VentaRepository ventaRepository;

    public VentaDetalleService(VentaDetalleRepository detalleRepository,
                               ProductoRepository productoRepository,
                               ProductoService productoService,
                               VentaRepository ventaRepository) {
        this.detalleRepository = detalleRepository;
        this.productoRepository = productoRepository;
        this.productoService = productoService;
        this.ventaRepository = ventaRepository;
    }

    /**
     * 🥇 Agregar producto a la venta
     */
    public VentaDetalle agregarProducto(VentaDetalle detalle) {

        if (detalle.getVentaId() == null) {
            throw new RuntimeException("Venta obligatoria");
        }

        if (detalle.getProductoId() == null) {
            throw new RuntimeException("Producto obligatorio");
        }

        if (detalle.getCantidad() <= 0) {
            throw new RuntimeException("Cantidad inválida");
        }

        Producto producto = productoRepository.findById(detalle.getProductoId()) 
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        BigDecimal costoBase = productoService.calcularCosto(producto.getId());
        BigDecimal precioBase = productoService.calcularPrecio(producto.getId());

        BigDecimal multiplicador = BigDecimal.valueOf(detalle.getCantidad());

        // 🔥 si es M2 usa alto * ancho
        if (producto.getTipo() == Producto.TipoProducto.M2) {

            if (detalle.getAlto() == null || detalle.getAncho() == null) {
                throw new RuntimeException("Alto y ancho son obligatorios para productos M2");
            }

            BigDecimal area = detalle.getAlto().multiply(detalle.getAncho());
            multiplicador = multiplicador.multiply(area);
        }

        BigDecimal costoTotal = costoBase.multiply(multiplicador);
        BigDecimal precioTotal = precioBase.multiply(multiplicador);

        detalle.setCosto(costoTotal);
        detalle.setPrecio(precioTotal);

        VentaDetalle guardado = detalleRepository.save(detalle);

        // 💣 actualizar total de la venta
        actualizarTotalVenta(detalle.getVentaId());

        return guardado;
    }

    /**
     * 🥈 Listar detalles por venta
     */
    public List<VentaDetalle> listarPorVenta(Integer ventaId) {
        return detalleRepository.findByVentaId(ventaId);
    }

    /**
     * 💣 Recalcular total de la venta
     */
    private void actualizarTotalVenta(Integer ventaId) {

        List<VentaDetalle> detalles = detalleRepository.findByVentaId(ventaId);

        BigDecimal total = BigDecimal.ZERO;

        for (VentaDetalle d : detalles) {
            total = total.add(d.getPrecio());
        }

        Venta venta = ventaRepository.findById(ventaId)
                .orElseThrow(() -> new RuntimeException("Venta no encontrada"));

        venta.setTotal(total);

        ventaRepository.save(venta);
    }

    /**
     * ❌ Eliminar producto de la venta
     */
    public void eliminar(Integer id) {

        VentaDetalle detalle = detalleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Detalle no encontrado"));

        Integer ventaId = detalle.getVentaId();

        detalleRepository.deleteById(id);

        actualizarTotalVenta(ventaId);
    }


}