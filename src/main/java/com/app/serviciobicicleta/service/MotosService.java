package com.app.serviciobicicleta.service;

import com.app.serviciobicicleta.entity.Moto;
import com.app.serviciobicicleta.repository.MotosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotosService {

    @Autowired
    MotosRepository motosRepository;

    public List<Moto> getAll(){
        return motosRepository.findAll();
    }

    public Moto getById(Integer id){
        return motosRepository.findById(id).orElse(null);
    }

    public Moto guardar(Moto moto){
        return motosRepository.save(moto);
    }

    public List<Moto> getByIdUsuario(Integer idUsuario){
        return motosRepository.findByIdUsuario(idUsuario);
    }
}
