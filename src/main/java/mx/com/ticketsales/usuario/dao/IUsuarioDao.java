package mx.com.ticketsales.usuario.dao;

import org.springframework.data.repository.CrudRepository;

import mx.com.ticketsales.usuario.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

}
