package com.drover.demo.backend.dto.request;

import java.math.BigDecimal;

public class PresupuestoDetalleRequestDTO {
    private Integer cantidad;
    private BigDecimal alto;
    private BigDecimal ancho;
    private BigDecimal costo;
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
    public BigDecimal getCosto() {
        return costo;
    }
    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }
    public BigDecimal getPrecio() {
        return precio;
    }
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }     
}
