package com.aplicacion.entrevista.controles;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aplicacion.entrevista.interfacesService.InterfazAlumnoService;
import com.aplicacion.entrevista.modelo.Alumno;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private InterfazAlumnoService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Alumno>alumnos=service.listar();
		model.addAttribute("alumnos", alumnos);
		return "index";
	}
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("alumno", new Alumno());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Validated Alumno p, Model model) {
		 service.save(p);
		 return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Alumno>alumno=service.listarId(id);
		model.addAttribute("alumno", alumno);
		return "form";
	}
	
	@GetMapping("/borrar/{id}")
	public String borrar(Model model,@PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
	
	
}
