package com.registromedico.dto;

import com.registromedico.dto.RegistroDto;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class RegistroIndicadorDto {
    private Integer id;
    private Double frecuenciaCardiaca;
    private Double peso;
    private Double tensionArterial;
    private Double talla;
    private Double saturacionDeOxigeno;
    private Boolean ejercicioFisico;
    private Boolean trota;
    private String frecuenciaTrotar;
    private Double distanciaRecorridaTrotar;
    private Integer pasosDia;
    private Double distanciaRecorridaPasos;
}
