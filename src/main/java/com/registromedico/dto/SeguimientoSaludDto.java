package com.registromedico.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SeguimientoSaludDto {
    private Integer id;
    private String basePatologica;
    private String antecedentesFamiliares;
    private String tiposDeRiesgos;
    private String laboratorios;
    private String remisionEspecialistas;
    private String vacunasRecientes;
}
