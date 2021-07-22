package mx.com.ticketsales.usuario.service;

import java.util.List;

import mx.com.ticketsales.usuario.entity.Usuario;


public interface IUsuarioService {
	public List<Usuario> findAll();
}
