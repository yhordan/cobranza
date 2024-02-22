package com.leonxiiicobranza.cobranza.jwt.repositori;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonxiiicobranza.cobranza.modelo.app_usuarios;

public interface UserRepository  extends JpaRepository<app_usuarios,String>{

	
	public app_usuarios findByLogin(String username);
}
