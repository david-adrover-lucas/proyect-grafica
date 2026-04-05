package com.drover.demo.backend.service;

import com.drover.demo.backend.entity.ProductoInsumo;
import com.drover.demo.backend.repository.ProductoInsumoRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoInsumoService {

    private final ProductoInsumoRepository  repository;

    public ProductoInsumoService(ProductoInsumoRepository  repository) {
        this.repository = repository;
    }

    /**
     * 🥇 Agregar insumo a producto
     */
    public ProductoInsumo guardar(ProductoInsumo pi) {

        if (pi.getProductoId() == null) {
            throw new RuntimeException("Producto obligatorio");
        }

        if (pi.getInsumoId() == null) {
            throw new RuntimeException("Insumo obligatorio");
        }

        if (pi.getCantidad() == null || pi.getCantidad() <= 0) {
            throw new RuntimeException("Cantidad inválida");
        }

        return repository.save(pi);
    }

    /**
     * 🥈 Ver insumos de un producto
     */
    public List<ProductoInsumo> listarPorProducto(Integer productoId) {
        return repository.findByProductoId(productoId);
    }

    /**
     * 🥉 Ver productos que usan un insumo
     */
    public List<ProductoInsumo> listarPorInsumo(Integer insumoId) {
        return repository.findByInsumoId(insumoId);
    }

    /**
     * ❌ Eliminar relación
     */
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

    /**
     * 🔄 Actualizar cantidad
     */
    public ProductoInsumo actualizarCantidad(Integer id, Integer nuevaCantidad) {

        if (nuevaCantidad == null ||nuevaCantidad <= 0) {
            throw new RuntimeException("Cantidad inválida");
        }

        ProductoInsumo pi = repository.findById(id).orElseThrow(() -> new RuntimeException("Relación no encontrada"));

        pi.setCantidad(nuevaCantidad);

        return repository.save(pi);
    }
}
