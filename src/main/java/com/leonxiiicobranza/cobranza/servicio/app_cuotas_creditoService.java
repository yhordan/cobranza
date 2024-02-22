package com.leonxiiicobranza.cobranza.servicio;

import java.util.List;

import com.leonxiiicobranza.cobranza.modelo.app_cuotas_credito;



public interface app_cuotas_creditoService {
	
	public List<app_cuotas_credito> findByTipomonedapAndNrodocpAndIdagenciapAndIddocp(String tipo_moneda,String Nro_documento,String id_agencia,String id_codigo_pagare);
	

}
