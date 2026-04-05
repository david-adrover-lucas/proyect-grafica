package com.drover.demo.backend.mapper;

import com.drover.demo.backend.dto.request.TrabajoTercerizadoRequestDTO;
import com.drover.demo.backend.dto.response.TrabajoTercerizadoResponseDTO;
import com.drover.demo.backend.entity.TrabajoTercerizado;

public class TrabajoTercerizadoMapper {
    public static TrabajoTercerizado toEntity(TrabajoTercerizadoRequestDTO dto){
        TrabajoTercerizado tt = new TrabajoTercerizado();
        tt.setCosto(dto.getCosto());
        tt.setEstado(dto.getEstado());
        tt.setFechaEnvio(dto.getFechaEnvio());
        tt.setFechaRetiro(dto.getFechaRetiro());
        tt.setInsumoNombre(dto.getInsumoNombre());
        return tt;
    }
    public static TrabajoTercerizadoResponseDTO toDTO(TrabajoTercerizado tt){
        TrabajoTercerizadoResponseDTO dto = new TrabajoTercerizadoResponseDTO();
        dto.setCosto(tt.getCosto());
        dto.setEmpresa(tt.getEmpresaId());
        dto.setEstado(tt.getEstado());
        dto.setFechaEnvio(tt.getFechaEnvio());
        dto.setFechaRetiro(tt.getFechaRetiro());
        dto.setId(tt.getId());
        dto.setInsumoId(tt.getInsumoId());
        dto.setInsumoNombre(tt.getInsumoNombre());
        dto.setVentaid(tt.getVentaId());
        return dto;
    }
}
