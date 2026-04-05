package com.drover.demo.backend.service;

import com.drover.demo.backend.entity.EmpresaTercerizada;
import com.drover.demo.backend.repository.EmpresaTercerizadaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaTercerizadaService {

    private final EmpresaTercerizadaRepository empresaRepository;

    public EmpresaTercerizadaService(EmpresaTercerizadaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    // Crear empresa
    public EmpresaTercerizada guardar(EmpresaTercerizada empresa) {

        if (empresa.getNombre() == null || empresa.getNombre().trim().isEmpty()) {
            throw new RuntimeException("El nombre es obligatorio");
        }

        if (!empresaRepository.findByNombre(empresa.getNombre()).isEmpty()) {
            throw new RuntimeException("La empresa ya existe");
        }

        if (empresa.getActivo() == null) {
            empresa.setActivo(true);
        }

        return empresaRepository.save(empresa);
    }

    // Listar todas
    public List<EmpresaTercerizada> listar() {
        return empresaRepository.findAll();
    }

    // Listar activas
    public List<EmpresaTercerizada> listarActivas() {
        return empresaRepository.findByActivo(true);
    }

    // Buscar por nombre
    public List<EmpresaTercerizada> buscarPorNombre(String nombre) {
        return empresaRepository.findByNombre(nombre);
    }

    // Desactivar
    public void desactivar(Integer id) {
        EmpresaTercerizada empresa = empresaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Empresa no encontrada"));

        empresa.setActivo(false);
        empresaRepository.save(empresa);
    }
}
