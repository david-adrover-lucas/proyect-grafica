package com.drover.demo.backend.mapper;

import com.drover.demo.backend.dto.request.VentaRequestDTO;
import com.drover.demo.backend.dto.response.VentaResponseDTO;
import com.drover.demo.backend.entity.Venta;

public class VentaMapper {

    public static Venta toEntity(VentaRequestDTO dto){
        Venta v = new Venta();
        v.setClienteId(dto.getClienteId());
        v.setUsuarioId(dto.getUsuarioId());
        return v;
    }

    public static VentaResponseDTO toDTO(Venta v){
        VentaResponseDTO dto = new VentaResponseDTO();
        dto.setId(v.getId());
        dto.setClienteId(v.getClienteId());
        dto.setUsuarioId(v.getUsuarioId());
        dto.setEstado(v.getEstado());
        dto.setTotal(v.getTotal());
        return dto;
    }
}