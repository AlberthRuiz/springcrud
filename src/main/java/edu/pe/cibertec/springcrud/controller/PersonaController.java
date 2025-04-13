package edu.pe.cibertec.springcrud.controller;

import edu.pe.cibertec.springcrud.model.Persona;
import edu.pe.cibertec.springcrud.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping
    public String listarPersonas(Model model) {
        model.addAttribute("personas", personaService.listar());
        return "persona-list";
    }

    @GetMapping("/")
    public String mostrarPaginaInicio() {
        return "index";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaPersona(Model model) {
        model.addAttribute("persona", new Persona());
        return "persona-form";
    }

    @PostMapping
    public String guardarPersona(Persona persona) {
        personaService.registar(persona);
        return "redirect:/personas";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarPersona(@PathVariable int id, Model model) {
        model.addAttribute("persona", personaService.obtener(id));
        return "persona-form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarPersona(@PathVariable int id) {
        personaService.eliminar(id);
        return "redirect:/personas";
    }

}
