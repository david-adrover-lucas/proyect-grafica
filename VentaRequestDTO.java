package com.drover.demo.backend.dto.request;

import jakarta.validation.constraints.NotNull;

public class VentaRequestDTO {

    @NotNull
    private Integer clienteId;

    @NotNull
    private Integer usuarioId;

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


}
