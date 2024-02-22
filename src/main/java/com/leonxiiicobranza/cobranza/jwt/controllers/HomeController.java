package com.leonxiiicobranza.cobranza.jwt.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leonxiiicobranza.cobranza.DAO.app_cuenta_creditoDao;
import com.leonxiiicobranza.cobranza.modelo.app_analista_gestorcob;
import com.leonxiiicobranza.cobranza.modelo.app_cuenta_credito;
import com.leonxiiicobranza.cobranza.servicio.app_analista_gestorcobService;
import com.leonxiiicobranza.cobranza.servicio.app_cuenta_creditoService;



@Controller
@RequestMapping("/rest/home")
public class HomeController {
   
	@Autowired
	app_analista_gestorcobService Service;
	
	@Autowired
	app_cuenta_creditoService Servicecc;
	
	@Autowired
	app_cuenta_creditoDao  dao;
	
	@ResponseBody
    @RequestMapping(value = "",method = RequestMethod.GET)
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello World");
    }
	
	 @RequestMapping(value = "/buscar/{codigo}",method = RequestMethod.POST)
		public ResponseEntity<List<app_cuenta_credito>> obtenersocios(@PathVariable String codigo) throws Exception{
			
			
		    List<app_cuenta_credito> lista_cuentas_creditos;
			
		///	if(codigo.equals("0060041"))
	//		{
				lista_cuentas_creditos=dao.findAll();
	//		}
		/*	else
			{
				
			lista_cuentas_creditos = new ArrayList<app_cuenta_credito>();
			List<app_analista_gestorcob>  lista_analistas= Service.findByIdgestor(codigo);
			
			lista_analistas.forEach(
					x->{
						List<app_cuenta_credito>  lista_pagares =Servicecc.findByIdanalista(x.getIdanalista());
						//System.out.print(x.getIdanalista() +"tamaño :"+lista_pagares.size()+" " );
						 //lista_cuentas_creditos=lista_pagares;
						 lista_pagares.forEach( pagare->
						 				            {
						 				            	if(!pagare.getIdestadodoc().getIdestadodoc().trim().equals("11") && !pagare.getIdestadodoc().getIdestadodoc().trim().equals("12")&& !pagare.getIdestadodoc().getIdestadodoc().trim().equals("13") )
						 				            	
						 				            	
						 				            	{lista_cuentas_creditos.add(pagare);}
						 				            	
						 				            	
						 				            }							 
								 );				
								
					}
					);
			}*/
		
			return new ResponseEntity<>(lista_cuentas_creditos,HttpStatus.OK);
		}

  
}
