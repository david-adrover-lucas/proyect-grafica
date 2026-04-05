package com.drover.demo.backend.dto.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.drover.demo.backend.entity.MovimientoCaja.TipoMovimiento;

import io.micrometer.common.lang.NonNull;

public class MovimientoCajaRequestDTO {
    @NonNull
    private TipoMovimiento tipo;    
    @NonNull
    private BigDecimal monto;    
    @NonNull
    private String descripcion;
    @NonNull   
    private LocalDateTime createdAt;
    public TipoMovimiento getTipo() {
        return tipo;
    }
    public void setTipo(TipoMovimiento tipo) {
        this.tipo = tipo;
    }
    public BigDecimal getMonto() {
        return monto;
    }
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }    
}
