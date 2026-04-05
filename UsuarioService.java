
package com.drover.demo.backend.service;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;

import com.drover.demo.backend.entity.Usuario;
import com.drover.demo.backend.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario guardar(Usuario usuario) {

        if (usuario.getUsuario() == null || usuario.getUsuario().isEmpty()) {
            throw new RuntimeException("Usuario obligatorio");
        }

        if (!usuarioRepository.findByUsuario(usuario.getUsuario()).isEmpty()) {
            throw new RuntimeException("El usuario ya existe");
        }

        if (usuario.getActivo() == null) {
            usuario.setActivo(true);
        }

        usuario.setCreatedAt(LocalDateTime.now());

        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    public List<Usuario> buscarPorNombre(String nombre) {
        return usuarioRepository.findByNombreContainingIgnoreCase(nombre);
    }

    public List<Usuario> buscarPorRol(String rol) {
        return usuarioRepository.findByRol(rol);
    }

    public void desactivar(Integer id) {
        Usuario u = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        u.setActivo(false);
        usuarioRepository.save(u);
    }
}
