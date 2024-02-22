package com.leonxiiicobranza.cobranza.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonxiiicobranza.cobranza.modelo.app_resultadovisitas;



public interface app_resultadovisitasDao extends JpaRepository<app_resultadovisitas,String>{
	
	public List<app_resultadovisitas> findAll();
}
