package com.leonxiiicobranza.cobranza.Controlador;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonxiiicobranza.cobranza.DAO.app_cuotas_convenioDao;
import com.leonxiiicobranza.cobranza.modelo.app_agencias;
import com.leonxiiicobranza.cobranza.modelo.app_cuotas_convenio;



//@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/app_cuotas_convenio")
public class app_cuotas_convenioController {

	@Autowired
	app_cuotas_convenioDao dao;
	
	
	
	
	@PostMapping("/buscar_cuotas_convenio/{tipo_moneda}/{Nro_documento}/{id_agencia}/{id_codigo_pagare}")
	public ResponseEntity<List<app_cuotas_convenio>> obtenersocios(@PathVariable String tipo_moneda,@PathVariable String Nro_documento,@PathVariable String id_agencia,@PathVariable String id_codigo_pagare) throws Exception{
		
		app_agencias agencia= new app_agencias();
		agencia.setIdagencia(id_agencia);		
		
		List<app_cuotas_convenio>  lista_cuotas_convenio= dao.findByTipmonedapAndNrodocpAndIdagenciapAndIddocp(tipo_moneda, Nro_documento, agencia, id_codigo_pagare);

		List<app_cuotas_convenio> lista_cuotas_nueva = lista_cuotas_convenio.stream() 
				  .filter(p -> p.getEstcuota().equals("0"))				  
				  .collect(Collectors.toList());
	
		return new ResponseEntity<>(lista_cuotas_nueva,HttpStatus.OK);

   }

	
	
}
