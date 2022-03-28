package com.registromedico.service;

import com.registromedico.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<Usuario> findAll();

    Usuario save(Usuario usuario);

    Optional<Usuario> findByCorreo(String correo);
}
