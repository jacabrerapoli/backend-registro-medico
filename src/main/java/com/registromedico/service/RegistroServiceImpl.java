package com.registromedico.service;

import com.registromedico.entity.Registro;
import com.registromedico.entity.Usuario;
import com.registromedico.repository.RegistroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegistroServiceImpl implements RegistroService {

    private final RegistroRepository registroRepository;

    @Override
    public List<Registro> findAll() {
        return registroRepository.findAll();
    }

    @Override
    public Boolean save(Registro registro) {
        registroRepository.save(registro);
        return true;
    }

    @Override
    public List<Registro> findByUsuario(Usuario usuario) {
        return registroRepository.findByUsuario(usuario);
    }
}
