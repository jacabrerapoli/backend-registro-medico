package com.registromedico.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class RegistroDto {
    private Integer id;
    private Date creado;
    private Date actualizado;
    private RegistroIndicadorDto registroIndicador;
    private SeguimientoSaludDto seguimientoSalud;
    private UsuarioRequestDto usuarioRequestDto;
}
