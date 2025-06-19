package com.equipos.equiposfutbol.repository;

import com.equipos.equiposfutbol.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    Usuario findByUsuario(String usuario);
}
