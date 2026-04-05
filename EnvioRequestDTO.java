package com.drover.demo.backend.dto.request;

import java.time.LocalDateTime;

import com.drover.demo.backend.entity.Envio.EstadoEnvio;
import com.drover.demo.backend.entity.Envio.TipoEnvio;

import jakarta.validation.constraints.NotNull;

public class EnvioRequestDTO {
    @NotNull
    private EstadoEnvio estado;
    @NotNull
    private TipoEnvio tipo;
    @NotNull
    private LocalDateTime createdAt;
    @NotNull
    private LocalDateTime fechaEntrega;
    public EstadoEnvio getEstado() {
        return estado;
    }
    public void setEstado(EstadoEnvio estado) {
        this.estado = estado;
    }
    public TipoEnvio getTipo() {
        return tipo;
    }
    public void setTipo(TipoEnvio tipo) {
        this.tipo = tipo;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public LocalDateTime getFechaEntrega() {
        return fechaEntrega;
    }
    public void setFechaEntrega(LocalDateTime fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }    
    
}
