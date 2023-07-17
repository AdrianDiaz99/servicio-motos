package com.app.serviciobicicleta.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Motos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Moto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Marca", length = 30, nullable = false)
    private String marca;

    @Column(name = "Modelo", length = 30, nullable = false)
    private String modelo;

    @Column(name = "id_usuario", nullable = false)
    private int idUsuario;

}
