package com.emp.laudex.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.emp.laudex.entity.Alumno;
import com.emp.laudex.repository.AlumnoRepository;
import com.emp.laudex.service.AlumnoService;
@Controller
public class AppController {

	@Autowired
	private AlumnoService alumnoservice;
	@GetMapping({"/","/login"})
	public String index() {
		return "index";
	}
	@GetMapping({"/menu"})
	public String viewMenu(){
		return "menu";
	}
	@GetMapping({"/list"})
	public String viewList(Model model){
		List<Alumno> alumno = alumnoservice.listar();
		model.addAttribute("alumnos",alumno);
		return "listar";
	}
	@GetMapping({"/agregar"})
	public String viewAdd(Model model) {
		model.addAttribute("alumno",new Alumno());
		return "agregar";
	}
	@PostMapping({"/save"})
	public String save(@Validated Alumno alum, Model model) {
		alumnoservice.save(alum);
		return "redirect:/list";
	}
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Alumno> alumno = alumnoservice.listarid(id);
		model.addAttribute("alumno", alumno);
		return "agregar";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		alumnoservice.delete(id);
		return "redirect:/list";
	}
}