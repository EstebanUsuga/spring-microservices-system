package com.vaxi.Spring.boot_.microservice_1_inmueble.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "inmueble")
public class Inmueble {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( name= "name", length = 150, nullable = false)
    private String nombre;


    @Column(name= "direccion", length = 500, nullable = false)
    private String direccion;

    @Column(name= "foto", length = 1200, nullable = true)
    private String picture;

    @Column(name="precio", nullable = false)
    private Double precio;

    @Column(name="fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;
}
