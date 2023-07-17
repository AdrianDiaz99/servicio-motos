package com.app.serviciobicicleta.controller;

import com.app.serviciobicicleta.entity.Moto;
import com.app.serviciobicicleta.service.MotosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/motos")
public class MotosController {

    @Autowired
    private MotosService motosService;

    @GetMapping
    public ResponseEntity<List<Moto>> obtenerTodos(){
        List<Moto> motos = motosService.getAll();

        if(motos.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(motos);
    }

    @GetMapping("/por_id_usuario/{idUsuario}")
    public ResponseEntity<List<Moto>> obtenerPorIdUsuario(@PathVariable(name = "idUsuario") Integer idUsuario){
        List<Moto> motos = motosService.getByIdUsuario(idUsuario);

        if(motos.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(motos);
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<Moto> obtenerPorId(@PathVariable("idUsuario") Integer idUsuario){

        Moto moto = motosService.getById(idUsuario);

        if(moto == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(moto);
    }

    @PostMapping
    public ResponseEntity<Moto> guardar(@RequestBody Moto moto){
        return ResponseEntity.status(HttpStatus.CREATED).body(motosService.guardar(moto));
    }
}
