package com.drover.demo.backend.dto.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.drover.demo.backend.entity.Pago.TipoPago;

import jakarta.validation.constraints.NotNull;

public class PagoRequestDTO {
    @NotNull    
    private BigDecimal monto;
    @NotNull    
    private TipoPago tipoPago;
    @NotNull    
    private LocalDateTime createdAt;
    public BigDecimal getMonto() {
        return monto;
    }
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }
    public TipoPago getTipoPago() {
        return tipoPago;
    }
    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
