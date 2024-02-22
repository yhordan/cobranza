package com.leonxiiicobranza.cobranza.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonxiiicobranza.cobranza.DAO.app_analista_gestorcobDao;
import com.leonxiiicobranza.cobranza.modelo.app_analista_gestorcob;



@Service
public class app_analista_gestorcobImpl implements app_analista_gestorcobService {

	@Autowired
	app_analista_gestorcobDao dao;
	
	@Override
	public List<app_analista_gestorcob> findByIdgestor(String idpersonal) {
		// TODO Auto-generated method stub
		return dao.findByIdgestor(idpersonal);
	}

}
