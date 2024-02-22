package com.leonxiiicobranza.cobranza.Controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonxiiicobranza.cobranza.DAO.app_cuenta_creditoDao;
import com.leonxiiicobranza.cobranza.DAO.app_pagare_gestorjudDao;
import com.leonxiiicobranza.cobranza.modelo.app_cuenta_credito;
import com.leonxiiicobranza.cobranza.modelo.app_pagare_gestorjud;
import com.leonxiiicobranza.cobranza.servicio.app_pagare_gestorjudService;



//@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/app_gestor_judicial")
public class app_pagare_gestorjudController {
	
	
	@Autowired
	app_pagare_gestorjudService Service;
	
	@Autowired
	app_pagare_gestorjudDao dao;
	
	@Autowired
	app_cuenta_creditoDao daocc;
	
	@PostMapping("/buscar/{codigo}")
	public ResponseEntity<List<app_cuenta_credito>> obtenerpagares(@PathVariable String codigo) throws Exception{
		
		
	   List<app_cuenta_credito> lista_cuentas_creditos = new ArrayList<app_cuenta_credito>();
		
		
		List<app_pagare_gestorjud>  lista_idpagares= Service.findByIdgestor(codigo);
		
		
		lista_idpagares.forEach(
				x->{
					
					List<app_cuenta_credito>  lista_pagares =daocc.findByIdagenciapagareAndIddocpagareAndNrodocpagareAndTipomoneda(x.getIdagenciap(),x.getIdsdocp(),x.getNrodocp(),x.getTipomonedap());
					
					 lista_pagares.forEach( pagare->
					 				            {   if(pagare.getIdestadodoc().getIdestadodoc().trim().equals("11") || pagare.getIdestadodoc().getIdestadodoc().trim().equals("12") || pagare.getIdestadodoc().getIdestadodoc().trim().equals("13") )
					 				            	{lista_cuentas_creditos.add(pagare);}
					 				            }
							 
							 );		
		
							
				}
				);
	
		

		return new ResponseEntity<>(lista_cuentas_creditos,HttpStatus.OK);
	}

}


