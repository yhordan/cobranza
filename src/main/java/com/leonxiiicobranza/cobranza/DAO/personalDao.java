package com.leonxiiicobranza.cobranza.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leonxiiicobranza.cobranza.modelo.app_usuarios;


@Repository
public interface personalDao extends JpaRepository<app_usuarios,String>{


	
	
	
	public app_usuarios findByLoginAndPassword(String username, String password);
	public app_usuarios findByLoginAndCorreo(String codigo, String correo);
	public app_usuarios findByLogin(String codigo);
	public app_usuarios findByIdpersona(String idpersona);
}
