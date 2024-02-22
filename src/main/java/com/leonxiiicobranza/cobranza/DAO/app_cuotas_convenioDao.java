package com.leonxiiicobranza.cobranza.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonxiiicobranza.cobranza.modelo.app_agencias;
import com.leonxiiicobranza.cobranza.modelo.app_cuotas_convenio;


public interface app_cuotas_convenioDao extends JpaRepository<app_cuotas_convenio,String>{
	
	public List<app_cuotas_convenio> findByTipmonedapAndNrodocpAndIdagenciapAndIddocp(String tipo_moneda,String Nro_documento,app_agencias id_agencia,String id_codigo_pagare);
	
}
