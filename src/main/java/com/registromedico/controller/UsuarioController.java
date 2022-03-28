package com.registromedico.controller;

import com.registromedico.dto.UsuarioRequestDto;
import com.registromedico.entity.Usuario;
import com.registromedico.mapper.UsuarioMapper;
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
@RequestMapping("api/usuarios")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class UsuarioController {

    private final UsuarioService usuarioService;

    private final UsuarioMapper usuarioMapper = new UsuarioMapper();

    @GetMapping
    public ResponseEntity<List<Usuario>> findAll() {
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @PostMapping
    public ResponseEntity<?> add(@RequestBody UsuarioRequestDto usuarioRequestDto) {
        Usuario usuario = usuarioMapper.usuarioRequestDtoToUsuario(usuarioRequestDto);
        return ResponseEntity.ok(usuarioService.save(usuario));
    }

    @GetMapping("/{correo}")
    public ResponseEntity<?> findByCorreo(@PathVariable String correo) {
        Optional<Usuario> usuario = usuarioService.findByCorreo(correo);
        if (usuario.isEmpty()) {
            return ResponseEntity.badRequest().body("Tercero no encontrado");
        }
        return ResponseEntity.ok(usuario.get());
    }

}
