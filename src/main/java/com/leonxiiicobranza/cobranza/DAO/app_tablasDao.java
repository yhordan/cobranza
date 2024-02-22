package com.leonxiiicobranza.cobranza.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.leonxiiicobranza.cobranza.modelo.app_tablas;


public interface app_tablasDao extends JpaRepository<app_tablas,String>{
	
	
	@Query(value = "SELECT * FROM cobranza.app_tablas where idtabla like '51%' and valor!=0",nativeQuery = true)
	public List<app_tablas> listar_persona_atienden();

}
