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
import javax.persistence.Lob;
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
@Table(name = "seguimiento_salud")
public class SeguimientoSalud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Lob
    @Column(name = "base_patologica")
    private String basePatologica;

    @Lob
    @Column(name = "antecedentes_familiares")
    private String antecedentesFamiliares;

    @Lob
    @Column(name = "tipos_de_riesgos")
    private String tiposDeRiesgos;

    @Lob
    @Column(name = "laboratorios")
    private String laboratorios;

    @Lob
    @Column(name = "remision_especialistas")
    private String remisionEspecialistas;

    @Lob
    @Column(name = "vacunas_recientes")
    private String vacunasRecientes;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    private Date creado;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizado;

}
