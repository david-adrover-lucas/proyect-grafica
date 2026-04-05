package com.drover.demo.backend.dto.request;

import java.math.BigDecimal;

import com.drover.demo.backend.entity.Insumo.TipoInsumos;

public class InsumoRequestDTO {
    private String nombre;
    private TipoInsumos tipo;
    private BigDecimal costoUnitario;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public TipoInsumos getTipo() {
        return tipo;
    }
    public void setTipo(TipoInsumos tipo) {
        this.tipo = tipo;
    }
    public BigDecimal getCostoUnitario() {
        return costoUnitario;
    }
    public void setCostoUnitario(BigDecimal costoUnitario) {
        this.costoUnitario = costoUnitario;
    }   
}
