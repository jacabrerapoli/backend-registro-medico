package com.registromedico.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class UsuarioRequestDto implements Serializable {
    private String nombres;
    private String apellidos;
    private Integer edad;
    private String correo;
    private String direccion;
    private String telefono;
    private String barrio;
    private String contrasena;
    private String genero;
    private Boolean condiciones;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechaNacimiento;
    private RolDto rol;
}
