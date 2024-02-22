package com.leonxiiicobranza.cobranza.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonxiiicobranza.cobranza.modelo.app_motivoatraso;




public interface app_motivoatrasoDao extends JpaRepository<app_motivoatraso,String>{
	
	public List<app_motivoatraso> findAll();
}
