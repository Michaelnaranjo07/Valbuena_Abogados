package dev.germantovar.springboot.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "evento")

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_evento;
    private Long id_proceso;
    private String anotacion;
    private String fecha_evento;
    private String documento;
}


