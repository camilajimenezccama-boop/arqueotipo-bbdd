package es.daw.app.controller;

import es.daw.app.repository.AlumnoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlumnoController {

    private final AlumnoRepository alumnoRepository;

    public AlumnoController(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    @GetMapping("/")
    public String inicio() {
        return "alumnos";
    }

    @GetMapping("/listar")
    public String listar(Model model) {

        model.addAttribute(
                "alumnos",
                alumnoRepository.findAll()
        );

        return "alumnos";
    }
}