package com.drover.demo.backend.dto.response;

import java.math.BigDecimal;

import com.drover.demo.backend.entity.Venta.EstadoVenta;


public class VentaResponseDTO {

    private Integer id;
    private Integer clienteId;
    private Integer usuarioId;
    private EstadoVenta estado;
    private BigDecimal total;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getClienteId() {
        return clienteId;
    }
    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }
    public Integer getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }
    public EstadoVenta getEstado() {
        return estado;
    }
    public void setEstado(EstadoVenta estado) {
        this.estado = estado;
    }
    public BigDecimal getTotal() {
        return total;
    }
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

}