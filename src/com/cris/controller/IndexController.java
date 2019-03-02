package com.cris.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

//Clase controladora con controladores dentro

@Controller
@SessionAttributes("resultado")
public class IndexController {
	
	//metodo que acepta una petición http y resuelve un nombre lógico
	//y así el Dispatcher server se encargue
	
	@RequestMapping("/")
	public String showIndex(Model model){
		model.addAttribute("resultado","Resultado desde Session");
		return "index";
	}
	
	@RequestMapping("/about")
	public String showAbout(){
		return "about";
	}
}
