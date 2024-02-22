package com.leonxiiicobranza.cobranza.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonxiiicobranza.cobranza.modelo.app_cuotas_credito;




public interface app_cuotas_creditoDao extends JpaRepository<app_cuotas_credito,String>{
	
	public List<app_cuotas_credito> findByTipomonedapAndNrodocpAndIdagenciapAndIddocp(String tipo_moneda,String Nro_documento,String id_agencia,String id_codigo_pagare);
	
}
