package com.drover.demo.backend.dto.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;


import jakarta.validation.constraints.NotNull;



public class HistorialPresupuestoRequestDTO {
    @NotNull
    private Integer presupuestoId;

    @NotNull
    private Integer clienteId;
    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }
    @NotNull
    private BigDecimal total;
    @NotNull
    private String estado;
    private LocalDateTime createdAt;
    @NotNull
    private LocalDateTime fecha;

    public Integer getPresupuestoId() {
        return presupuestoId;
    }

    public void setPresupuestoId(Integer presupuestoId) {
        this.presupuestoId = presupuestoId;
    }

  
    public BigDecimal getTotal() {
        return total;
    }
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    
}
