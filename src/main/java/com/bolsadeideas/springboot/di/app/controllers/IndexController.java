package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.service.LosServicios;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;

@Controller
public class IndexController {
	
	@Autowired
	private LosServicios miservicio;
	
	@GetMapping({"/","/index"})
	public String index(Model model) {
		model.addAttribute("objeto",miservicio.operacion());
		return "index";
	}
	
}
