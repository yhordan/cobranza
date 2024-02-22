package com.leonxiiicobranza.cobranza.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonxiiicobranza.cobranza.modelo.app_morovisiestados;



public interface app_morovisiestadosDao extends JpaRepository<app_morovisiestados,String>{
	
	public List<app_morovisiestados> findAll();
}
