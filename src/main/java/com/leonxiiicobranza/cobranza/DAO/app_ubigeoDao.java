package com.leonxiiicobranza.cobranza.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.leonxiiicobranza.cobranza.modelo.app_ubigeo;



public interface app_ubigeoDao extends JpaRepository<app_ubigeo,String>{
	
	public List<app_ubigeo> findAll();
	
	@Query(value = "SELECT * FROM cobranza.app_ubigeo where idubigeo like '0113%'",nativeQuery = true)
	public List<app_ubigeo> listar_ubigeo_libertad();


}
