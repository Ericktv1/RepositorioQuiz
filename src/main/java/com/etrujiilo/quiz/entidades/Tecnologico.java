package com.etrujiilo.quiz.entidades;

import jakarta.persistence.*;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "TECNOLOGICO_REL") // Cambio de nombre de tabla
@ToString
public class Tecnologico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TEC_CODIGO", nullable = false)
    private int codigoTec;

    @Column(name = "TEC_MODELO", nullable = false)
    private String modelo;

    @Column(name = "TEC_NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "TEC_COSTO", nullable = false)
    private int costo;

    @Column(name = "TRAN_ESTABLECIMIENTO", nullable = false)
    private String establecimiento;

}

