package com.registromedico.mapper;

import com.registromedico.dto.UsuarioRequestDto;
import com.registromedico.entity.Usuario;
import org.modelmapper.ModelMapper;

public class UsuarioMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public UsuarioRequestDto usuarioToUsuarioRequestDto(Usuario usuario) {
        return modelMapper.map(usuario, UsuarioRequestDto.class);
    }

    public Usuario usuarioRequestDtoToUsuario(UsuarioRequestDto usuarioRequestDto) {
        return modelMapper.map(usuarioRequestDto, Usuario.class);
    }
}
