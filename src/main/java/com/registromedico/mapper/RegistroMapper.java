package com.registromedico.mapper;

import com.registromedico.dto.RegistroDto;
import com.registromedico.entity.Registro;
import org.modelmapper.ModelMapper;

public class RegistroMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public Registro registroDtoToRegistro(RegistroDto registroDto) {
        return modelMapper.map(registroDto, Registro.class);
    }
}
