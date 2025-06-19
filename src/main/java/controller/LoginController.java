package com.equipos.equiposfutbol.controller;

import com.equipos.equiposfutbol.model.Usuario;
import com.equipos.equiposfutbol.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/")
    public String mostrarLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String procesarLogin(@RequestParam String usuario, @RequestParam String password, Model model) {
        Usuario u = usuarioRepository.findByUsuario(usuario);

        if (u != null && u.getPassword().equals(password)) {
            return "redirect:/listar";
        } else {
            model.addAttribute("error", "Usuario o contraseña incorrectos.");
            return "login";
        }
    }
}
