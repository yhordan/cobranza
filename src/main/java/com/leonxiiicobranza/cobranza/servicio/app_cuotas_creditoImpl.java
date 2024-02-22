package com.leonxiiicobranza.cobranza.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonxiiicobranza.cobranza.DAO.app_cuotas_creditoDao;
import com.leonxiiicobranza.cobranza.modelo.app_cuotas_credito;


@Service
public class app_cuotas_creditoImpl implements app_cuotas_creditoService {

	@Autowired
	app_cuotas_creditoDao dao;

	@Override
	public List<app_cuotas_credito> findByTipomonedapAndNrodocpAndIdagenciapAndIddocp(String tipo_moneda,
			String Nro_documento, String id_agencia, String id_codigo_pagare) {
		// TODO Auto-generated method stub
		return dao.findByTipomonedapAndNrodocpAndIdagenciapAndIddocp(tipo_moneda, Nro_documento, id_agencia, id_codigo_pagare);
	}
	

}
