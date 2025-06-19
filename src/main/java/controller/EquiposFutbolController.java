package com.equipos.equiposfutbol.controller;

import com.equipos.equiposfutbol.model.EquiposFutbol;
import com.equipos.equiposfutbol.repository.EquiposFutbolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class EquiposFutbolController {

    @Autowired
    private EquiposFutbolRepository equiposFutbolRepository;

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("equipo", new EquiposFutbol());
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardarEquipo(@ModelAttribute EquiposFutbol equipo) {
        equiposFutbolRepository.save(equipo);
        return "redirect:/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarEquipo(@PathVariable Long id) {
        equiposFutbolRepository.deleteById(id);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEdicion(@PathVariable Long id, Model model) {
        EquiposFutbol equipo = equiposFutbolRepository.findById(id).orElse(null);
        model.addAttribute("equipo", equipo);
        return "formulario";
    }


    @GetMapping("/listar")
    public String listarEquipos(Model model) {
        model.addAttribute("listaEquipos", equiposFutbolRepository.findAll());
        return "listar";
    }


}

