package com.leonxiiicobranza.cobranza.servicio;

import java.util.List;

import com.leonxiiicobranza.cobranza.modelo.app_cuenta_credito;




public interface app_cuenta_creditoService {
	
	public List<app_cuenta_credito> findByIdanalista(String idpanalista);

}
