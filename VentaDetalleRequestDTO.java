package com.drover.demo.backend.dto.request;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;

public class VentaDetalleRequestDTO {

    @NotNull   
    private Integer cantidad;
    @NotNull
    private BigDecimal alto;
    @NotNull
    private BigDecimal ancho;
    @NotNull
    private BigDecimal precio;   


    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getAlto() {
        return alto;
    }

    public void setAlto(BigDecimal alto) {
        this.alto = alto;
    }

    public BigDecimal getAncho() {
        return ancho;
    }

    public void setAncho(BigDecimal ancho) {
        this.ancho = ancho;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}
