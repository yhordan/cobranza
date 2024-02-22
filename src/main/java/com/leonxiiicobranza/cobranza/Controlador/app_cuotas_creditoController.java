package com.leonxiiicobranza.cobranza.Controlador;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonxiiicobranza.cobranza.modelo.app_cuotas_credito;
import com.leonxiiicobranza.cobranza.servicio.app_cuotas_creditoService;



//@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/app_cuotas_credito")
public class app_cuotas_creditoController {
	
	@Autowired
	app_cuotas_creditoService Service;
	
	
	@PostMapping("/buscar_cuotas/{tipo_moneda}/{Nro_documento}/{id_agencia}/{id_codigo_pagare}")
	public ResponseEntity<List<app_cuotas_credito>> obtenersocios(@PathVariable String tipo_moneda,@PathVariable String Nro_documento,@PathVariable String id_agencia,@PathVariable String id_codigo_pagare) throws Exception{
		
		//List<app_cuenta_credito>  lista_cuentas_creditos=null;
		//List<app_cuenta_credito> lista_cuentas_creditos = new ArrayList<app_cuenta_credito>();
		
		
		List<app_cuotas_credito>  lista_cuotas= Service.findByTipomonedapAndNrodocpAndIdagenciapAndIddocp(tipo_moneda, Nro_documento, id_agencia, id_codigo_pagare);
		
		List<app_cuotas_credito> lista_cuotas_nueva = lista_cuotas.stream() 
				  .filter(p -> p.getEstcuota().equals("0"))				  
				  .collect(Collectors.toList());
		/*
		lista_analistas.forEach(
				x->{
					List<app_cuenta_credito>  lista_pagares =Servicecc.findByIdanalista(x.getIdanalista());
					System.out.print(x.getIdanalista() +"tamaño :"+lista_pagares.size()+" " );
					 //lista_cuentas_creditos=lista_pagares;
					 lista_pagares.forEach( pagare->
					 				            {
					 				            	lista_cuentas_creditos.add(pagare);
					 				            }
							 
							 );						
							
				}
				);
		
	   */
		return new ResponseEntity<>(lista_cuotas_nueva,HttpStatus.OK);
	}
	
	

}
