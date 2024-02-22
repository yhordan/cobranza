package com.leonxiiicobranza.cobranza.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonxiiicobranza.cobranza.modelo.app_analista_gestorcob;



public interface app_analista_gestorcobDao extends JpaRepository<app_analista_gestorcob,String>{

	public List<app_analista_gestorcob> findByIdgestor(String idpersonal);
}
