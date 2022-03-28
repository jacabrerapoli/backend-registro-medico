package com.registromedico.service;

import com.registromedico.entity.Registro;
import com.registromedico.entity.Usuario;

import java.util.List;

public interface RegistroService {

    List<Registro> findAll();

    Boolean save(Registro registro);

    List<Registro> findByUsuario(Usuario usuario);
}
