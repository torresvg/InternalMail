package com.internal.mail.servicio;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.internal.mail.controlador.dto.UsuarioRegistroDTO;
import com.internal.mail.modelo.Usuario;


public interface UsuarioServicio extends UserDetailsService{

	public Usuario guardar(UsuarioRegistroDTO registroDTO);
	
	public List<Usuario> listarUsuarios();
	
}
