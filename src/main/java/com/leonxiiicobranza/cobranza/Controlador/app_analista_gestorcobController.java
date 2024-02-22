package com.leonxiiicobranza.cobranza.Controlador;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.leonxiiicobranza.cobranza.DAO.app_cuenta_creditoDao;
import com.leonxiiicobranza.cobranza.DAO.app_cuenta_credito_paginacionDAO;
import com.leonxiiicobranza.cobranza.modelo.app_analista_gestorcob;
import com.leonxiiicobranza.cobranza.modelo.app_cuenta_credito;
import com.leonxiiicobranza.cobranza.servicio.app_analista_gestorcobService;
import com.leonxiiicobranza.cobranza.servicio.app_cuenta_creditoService;

import org.springframework.data.domain.Pageable;

//@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/app_analista_gestorcob")
public class app_analista_gestorcobController {
	
	@Autowired
	app_analista_gestorcobService Service;
	
	@Autowired
	app_cuenta_creditoService Servicecc;
	
	@Autowired
	app_cuenta_creditoDao  dao;
	
	@Autowired
	app_cuenta_credito_paginacionDAO daop;
	
	
	//@Autowired
	//MyRepository mydao;
	/*
	@GetMapping("/listar")
	public ResponseEntity<List<app_analista_gestorcob>> listarAfp() {
	
		return new ResponseEntity<>(Service.findAll(), HttpStatus.OK);
	}
	
   */
	
	@PostMapping("/buscar/{codigo}")
	public ResponseEntity<List<app_cuenta_credito>> obtenersocios(@PathVariable String codigo) throws Exception{
		
		
	    List<app_cuenta_credito> lista_cuentas_creditos;
		
		if(codigo.equals("0060041"))
		{
			lista_cuentas_creditos=dao.findAll();
		}
		else
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
		}
		
		/* 
		if(codigo.equals("42154991") || codigo.equals("78548609") )
		{
			//cart_atrasada=cartService.findAll();
		}else
		{
			
			cartera_atrasada = Service.findByIdgestor(codigo);
			
		}
		*/
		/*
		List<cartera_atrasada> cartera_atrasa_nueva = cart_atrasada.stream() 
				  .filter(distinctByKey(p -> p.getNum_pagare()))
				  .filter(distinctByKey(p -> p.getDni_socio()))
				  .collect(Collectors.toList());*/
		return new ResponseEntity<>(lista_cuentas_creditos,HttpStatus.OK);
	}
	
	@PostMapping("/buscar/{codigo}/{jerarquia}")
	public ResponseEntity<List<app_cuenta_credito>> obtenersocios(@PathVariable String codigo,@PathVariable String jerarquia) throws Exception{
		
		
	    List<app_cuenta_credito> lista_cuentas_creditos;
		
		if(jerarquia.equals("JEFE") || jerarquia.equals("MASTER") )
		{
			lista_cuentas_creditos=dao.findAll();
		}
		else
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
		}
		
		/* 
		if(codigo.equals("42154991") || codigo.equals("78548609") )
		{
			//cart_atrasada=cartService.findAll();
		}else
		{
			
			cartera_atrasada = Service.findByIdgestor(codigo);
			
		}
		*/
		/*
		List<cartera_atrasada> cartera_atrasa_nueva = cart_atrasada.stream() 
				  .filter(distinctByKey(p -> p.getNum_pagare()))
				  .filter(distinctByKey(p -> p.getDni_socio()))
				  .collect(Collectors.toList());*/
		return new ResponseEntity<>(lista_cuentas_creditos,HttpStatus.OK);
	}
	
	@PostMapping("/buscar/pagare/analista/{codigo}")
	public ResponseEntity<List<app_cuenta_credito>> obtenerpagaresnalistas(@PathVariable String codigo) throws Exception{
	
		List<app_cuenta_credito> lista_cuentas_creditos=dao.findByIdanalista(codigo);		
		
		return new ResponseEntity<>(lista_cuentas_creditos,HttpStatus.OK);
	}

	/*
	@Transactional
	@PostMapping("/buscar_prueba_pagares/{codigo}")
	public ResponseEntity<List<app_cuenta_credito>> obtenerpagares_prueba(@PathVariable String codigo) throws Exception{
		Stream<app_cuenta_credito> lista_cuentas_creditos=null;
			try {  
						lista_cuentas_creditos=mydao.getAll();
				
				}catch(Exception ex)
				{
					System.out.print(ex);
				}
				return new ResponseEntity<>(mydao.getAll().collect(Collectors.toList()),HttpStatus.OK);
	}
	*/
	
	
	@PostMapping("/buscar_prueba/{codigo}")
	public ResponseEntity<List<app_cuenta_credito>> obtenersocios_prueba(@PathVariable String codigo) throws Exception{
		
	    List<app_cuenta_credito> lista_cuentas_creditos = new ArrayList<app_cuenta_credito>();
	  
			Pageable secondPageWithFiveElements = PageRequest.of(0, 5);
			//Page<Product> allProducts =daop.findAll(10,firstPageWithTwoElements);
			Page<app_cuenta_credito> cuentas = daop.findByIdcuentacreditoContaining(codigo,secondPageWithFiveElements);
			 lista_cuentas_creditos = cuentas.getContent();
			
		return new ResponseEntity<>(lista_cuentas_creditos,HttpStatus.OK);
	}
	

}
