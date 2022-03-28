package com.registromedico.repository;

import com.registromedico.entity.Registro;
import com.registromedico.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistroRepository extends JpaRepository<Registro, Integer> {
    List<Registro> findByUsuario(Usuario usuario);
}