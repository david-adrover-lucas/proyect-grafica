package com.drover.demo.backend.dto.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;

public class UsuarioRequestDTO {
    @NotNull
    private String nombre;
    @NotNull
    private String usuario;   
    @NotNull
    private BigDecimal sueldoMensual;
    @NotNull
    private LocalDateTime createdAt;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public BigDecimal getSueldoMensual() {
        return sueldoMensual;
    }
    public void setSueldoMensual(BigDecimal sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }     
}
