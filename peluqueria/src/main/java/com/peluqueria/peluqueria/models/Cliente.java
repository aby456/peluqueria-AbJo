package com.peluqueria.peluqueria.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="TBL_CLIENTE")
@Getter
@Setter

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "NOMBRE")   
    private String nombre;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "DIRECCION")   
    private String direccion;
    @Column(name = "EMAIL")   
    private String email;
    @Column(name = "PASSWORD")
    private String password;

    @ManyToOne
    @JoinColumn(name="RESERVACION_ID", nullable=false)
    private Reservacion reservacion;
}
