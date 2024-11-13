package dev.germantovar.springboot.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "proceso")

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Proceso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_proceso;
    private Long id_cliente;
    private Long id_abogado;
    private String estado_actual;
    private Long id_radicado;
    private String fecha_creacion;
    private String fecha_asignacion;
    private Long categoria_proc;
    private Long id_evento;
}


