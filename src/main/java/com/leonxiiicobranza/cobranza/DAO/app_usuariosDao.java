package com.leonxiiicobranza.cobranza.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonxiiicobranza.cobranza.modelo.app_usuarios;



public interface app_usuariosDao extends JpaRepository<app_usuarios,String>{
	
	
	public app_usuarios findByIdpersona(String idpersonal);
	
	public List<app_usuarios> findAll();

}
