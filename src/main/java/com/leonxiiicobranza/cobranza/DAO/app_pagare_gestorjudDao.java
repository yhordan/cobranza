package com.leonxiiicobranza.cobranza.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonxiiicobranza.cobranza.modelo.app_pagare_gestorjud;



public interface app_pagare_gestorjudDao extends JpaRepository<app_pagare_gestorjud,String>{
	
	public List<app_pagare_gestorjud> findByIdgestor(String idgestor);

}