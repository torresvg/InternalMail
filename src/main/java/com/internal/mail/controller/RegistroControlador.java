package com.internal.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.internal.mail.service.UsuarioServicio;

@Controller
public class RegistroControlador {

	@Autowired
	private UsuarioServicio service;
	
	@GetMapping("/login")
	public String iniciarSesion() {
		return "login";
	}
	
	@GetMapping("/")
	public String verPaginaDeInicio(Model model) {
		model.addAttribute("usuarios", service.listarUsuarios());
		return "index";
	}
}
