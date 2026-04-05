package com.drover.demo.backend.dto.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;

public class ClienteRequestDTO {
    @NotNull
    private String nombre;
    @NotNull
    private String telefono;
    @NotNull
    private String email;
    @NotNull    
    private String direccion;
    @NotNull
    private BigDecimal deuda;
    @NotNull
    private LocalDateTime createdAt;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public BigDecimal getDeuda() {
        return deuda;
    }
    public void setDeuda(BigDecimal deuda) {
        this.deuda = deuda;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}