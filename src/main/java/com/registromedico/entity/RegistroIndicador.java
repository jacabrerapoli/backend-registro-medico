/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.registromedico.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author JaimeCabreraDev
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "registro_indicador")
public class RegistroIndicador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "frecuencia_cardiaca")
    private Double frecuenciaCardiaca;

    @Column(name = "peso")
    private Double peso;

    @Column(name = "tension_arterial")
    private Double tensionArterial;

    @Column(name = "talla")
    private Double talla;

    @Column(name = "saturacion_de_oxigeno")
    private Double saturacionDeOxigeno;

    @Column(name = "ejercicio_fisico")
    private Boolean ejercicioFisico;

    @Column(name = "trota")
    private Boolean trota;

    @Column(name = "frecuencia_trotar")
    private String frecuenciaTrotar;

    @Column(name = "distancia_recorrida_trotar")
    private Double distanciaRecorridaTrotar;

    @Column(name = "pasos_dia")
    private Integer pasosDia;

    @Column(name = "distancia_recorrida_pasos")
    private Double distanciaRecorridaPasos;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    private Date creado;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizado;

}
