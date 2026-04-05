package com.drover.demo.backend.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.drover.demo.backend.entity.Caja;
import com.drover.demo.backend.service.CajaService;

@RestController
@RequestMapping("/caja")
public class CajaController {
    private final CajaService service;
    public CajaController(CajaService service) {
        this.service = service;
    }
   @PostMapping
   public Caja actualizarSaldo(@RequestParam Integer cuentaId, @RequestParam BigDecimal monto, @RequestParam boolean suma) {
       service.actualizarSaldo(cuentaId, monto, suma);
       Caja caja = new Caja();
       caja.setCuentaId(cuentaId);
       caja.setSaldo(service.obtenerSaldo(cuentaId));
       return caja;
   }
   @GetMapping
   public List<Caja> listarCajas() {
       return service.listarCajas();
   }
   @DeleteMapping("/{cuentaId}")
    public void eliminarCaja(@PathVariable Integer cuentaId) {
         service.eliminarCaja(cuentaId);
    }
}
