package com.drover.demo.backend.mapper;
import com.drover.demo.backend.dto.request.VentaDetalleInsumoExtraRequestDTO;
import com.drover.demo.backend.dto.response.VentaDetalleInsumoExtraResponseDTO;
import com.drover.demo.backend.entity.VentaDetalleInsumoExtra;

public class VentaDetalleInsumoExtraMapper {
     
   public static VentaDetalleInsumoExtra toEntity(VentaDetalleInsumoExtraRequestDTO dto){
      VentaDetalleInsumoExtra vdie = new VentaDetalleInsumoExtra();
      vdie.setVentaDetalleId(dto.getVentaDetalleId());
      vdie.setInsumoId(dto.getInsumoId());
      vdie.setCantidad(dto.getCantidad());
      vdie.setCostoUnitario(dto.getCostoUnitario());
      return vdie;
   }
   public static VentaDetalleInsumoExtraResponseDTO toDTO(VentaDetalleInsumoExtra vdie){
      VentaDetalleInsumoExtraResponseDTO dto = new VentaDetalleInsumoExtraResponseDTO();
      dto.setCantidad(vdie.getCantidad());
      dto.setCostoUnitario(vdie.getCostoUnitario());
      dto.setId(vdie.getId());
      dto.setInsumoId(vdie.getInsumoId());
      dto.setVentaDetalleId(vdie.getVentaDetalleId());
      
      return dto;
   }
}
