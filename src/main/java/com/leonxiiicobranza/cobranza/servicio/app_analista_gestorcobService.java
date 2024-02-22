package com.leonxiiicobranza.cobranza.servicio;

import java.util.List;

import com.leonxiiicobranza.cobranza.modelo.app_analista_gestorcob;

public interface app_analista_gestorcobService {
	
	public List<app_analista_gestorcob> findByIdgestor(String idpersonal);

}
