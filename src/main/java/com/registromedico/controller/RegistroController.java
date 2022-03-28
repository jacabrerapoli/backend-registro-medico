package com.registromedico.controller;

import com.registromedico.entity.Registro;
import com.registromedico.entity.Usuario;
import com.registromedico.mapper.RegistroMapper;
import com.registromedico.service.RegistroService;
import com.registromedico.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/registros")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class RegistroController {

    private final RegistroService registroService;

    private final UsuarioService usuarioService;

    private final RegistroMapper registroMapper = new RegistroMapper();

    @GetMapping
    public ResponseEntity<List<Registro>> findAll() {
        return ResponseEntity.ok(registroService.findAll());
    }

    @PostMapping
    public ResponseEntity<Registro> add(@RequestBody Registro registro) {
        registroService.save(registro);
        return ResponseEntity.ok(registro);
    }

    @GetMapping("/{correo}")
    public ResponseEntity<?> findByCorreo(@PathVariable String correo) throws Exception {
        Optional<Usuario> usuario = usuarioService.findByCorreo(correo);
        if (usuario.isEmpty()) {
            throw new Exception("Usuario no econtrado");
        }
        if (registroService.findByUsuario(usuario.get()).isEmpty()) {
            return ResponseEntity.badRequest().body("El usuario no tiene registros medicos");
        }
        return ResponseEntity.ok(registroService.findByUsuario(usuario.get()));
    }
}
