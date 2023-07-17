package com.app.serviciobicicleta.repository;

import com.app.serviciobicicleta.entity.Moto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MotosRepository extends JpaRepository<Moto, Integer> {

    List<Moto> findByIdUsuario(Integer idUsuario);
}
