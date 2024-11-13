package dev.germantovar.springboot.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "abogado")

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Abogado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_abogado;
    private String cedula_abo;
    private String nombre_abo;
    private String apellido_abo;
    private Long id_categoria_emp;
    private String estado_abo;
    private String fecha_ingreso;
    private String fecha_retiro;
}


