package com.internal.mail.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.internal.mail.controller.dto.UsuarioRegistroDTO;
import com.internal.mail.model.Usuario;


public interface UsuarioServicio extends UserDetailsService{

	public Usuario guardar(UsuarioRegistroDTO registroDTO);
	
	public List<Usuario> listarUsuarios();
	
}
