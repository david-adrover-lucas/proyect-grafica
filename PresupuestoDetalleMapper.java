package com.drover.demo.backend.mapper;

import com.drover.demo.backend.dto.request.PresupuestoDetalleRequestDTO;
import com.drover.demo.backend.dto.response.PresupuestoDetalleResponseDTO;
import com.drover.demo.backend.entity.PresupuestoDetalle;


public class PresupuestoDetalleMapper {
    public static PresupuestoDetalle toEntity(PresupuestoDetalleRequestDTO dto){
       PresupuestoDetalle pd = new PresupuestoDetalle();
       pd.setCantidad(dto.getCantidad());
       pd.setAncho(dto.getAncho());
       pd.setAlto(dto.getAlto());
       pd.setCosto(dto.getCosto());
       pd.setPrecio(dto.getPrecio());
       return pd;

    }
    public static PresupuestoDetalleResponseDTO toDTO(PresupuestoDetalle pd){
        PresupuestoDetalleResponseDTO dto = new PresupuestoDetalleResponseDTO();
        dto.setId(pd.getId());
        dto.setAlto(pd.getAlto());
        dto.setAncho(pd.getAncho());
        dto.setCantidad(pd.getCantidad());
        dto.setPrecio(pd.getPrecio());
        dto.setPresupuestoId(pd.getPresupuestoId());
        dto.setProductoId(pd.getProductoId());
        dto.setCosto(pd.getCosto());
        return dto;

   } 
   
    
}
