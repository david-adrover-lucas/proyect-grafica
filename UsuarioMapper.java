package com.drover.demo.backend.mapper;
import com.drover.demo.backend.dto.request.UsuarioRequestDTO;
import com.drover.demo.backend.dto.response.UsuarioResponseDTO;
import com.drover.demo.backend.entity.Usuario;



public class UsuarioMapper {

    public static Usuario toEntity(UsuarioRequestDTO dto) {
        Usuario user = new Usuario();
        user.setNombre(dto.getNombre());
        user.setUsuario(dto.getUsuario());
        user.setSueldoMensual(dto.getSueldoMensual());
        user.setCreatedAt(dto.getCreatedAt());
        return user;
        
    }

    public static UsuarioResponseDTO toDTO(Usuario user){
        UsuarioResponseDTO dto = new UsuarioResponseDTO();
        dto.setActivo(user.getActivo());
        dto.setContrasena(user.getContrasena());
        dto.setCreatedAt(user.getCreatedAt());
        dto.setId(user.getId());
        dto.setNombre(user.getNombre());
        dto.setRol(user.getRol());
        dto.setSueldoMensual(user.getSueldoMensual());
        dto.setUsuario(user.getUsuario());
        return dto;
    }

    
}