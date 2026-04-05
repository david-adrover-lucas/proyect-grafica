package com.drover.demo.backend.dto.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;

public class TrabajoTercerizadoRequestDTO {
    @NotNull   
    private String insumoNombre;
    @NotNull   
    private BigDecimal costo;
    @NotNull   
    private String estado;
    @NotNull   
    private LocalDateTime fechaEnvio;
    @NotNull   
    private LocalDateTime fechaRetiro;
    public String getInsumoNombre() {
        return insumoNombre;
    }
    public void setInsumoNombre(String insumoNombre) {
        this.insumoNombre = insumoNombre;
    }
    public BigDecimal getCosto() {
        return costo;
    }
    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }
    public void setFechaEnvio(LocalDateTime fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
    public LocalDateTime getFechaRetiro() {
        return fechaRetiro;
    }
    public void setFechaRetiro(LocalDateTime fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }    
}
