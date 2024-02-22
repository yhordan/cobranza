package com.leonxiiicobranza.cobranza.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonxiiicobranza.cobranza.DAO.app_cuenta_creditoDao;
import com.leonxiiicobranza.cobranza.modelo.app_cuenta_credito;


@Service
public class app_cuenta_creditoImpl implements app_cuenta_creditoService {

	@Autowired
	app_cuenta_creditoDao dao;
	
	
	@Override
	public List<app_cuenta_credito> findByIdanalista(String idpanalista) {
		// TODO Auto-generated method stub
		return dao.findByIdanalista(idpanalista);
	}
}
