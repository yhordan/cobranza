package com.leonxiiicobranza.cobranza.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonxiiicobranza.cobranza.DAO.app_pagare_gestorjudDao;
import com.leonxiiicobranza.cobranza.modelo.app_pagare_gestorjud;





@Service
public class app_pagare_gestorjudImpl implements app_pagare_gestorjudService {

	@Autowired
	app_pagare_gestorjudDao dao;

	@Override
	public List<app_pagare_gestorjud> findByIdgestor(String idgestor) {
		// TODO Auto-generated method stub
		return dao.findByIdgestor(idgestor);
	}
   


}
