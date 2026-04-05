package com.drover.demo.backend.mapper;

import com.drover.demo.backend.dto.request.VentaDetalleRequestDTO;
import com.drover.demo.backend.dto.response.VentaDetalleResponseDTO;
import com.drover.demo.backend.entity.VentaDetalle;

public class VentaDetalleMapper {
    public static  VentaDetalle toEntity( VentaDetalleRequestDTO dto){
       VentaDetalle vd = new VentaDetalle();
       vd.setPrecio(dto.getPrecio());
       vd.setCantidad(dto.getCantidad());
       vd.setAlto(dto.getAlto());
       vd.setAncho(dto.getAncho());
       return vd;
    }
    public static VentaDetalleResponseDTO toDTO(VentaDetalle vd){
        VentaDetalleResponseDTO dto = new VentaDetalleResponseDTO();
        dto.setId(vd.getId());
        dto.setAlto(vd.getAlto()); 
        dto.setAncho(vd.getAncho());
        dto.setCantidad(vd.getCantidad());
        dto.setCosto(vd.getCosto());
        dto.setProductoId(vd.getProductoId());
        dto.setVentaId(vd.getVentaId());
        dto.setPrecio(vd.getPrecio());
        return dto;       
    }
    
}