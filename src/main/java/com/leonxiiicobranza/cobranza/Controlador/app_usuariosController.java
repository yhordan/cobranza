package com.leonxiiicobranza.cobranza.Controlador;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonxiiicobranza.cobranza.DAO.app_usuariosDao;
import com.leonxiiicobranza.cobranza.modelo.app_usuarios;



//@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/app_usuarios")
public class app_usuariosController {
	
	
	@Autowired
	app_usuariosDao dao;
	
	@GetMapping("/listar")
	public ResponseEntity<List<app_usuarios>> listar() {
	
		return new ResponseEntity<>(dao.findAll(), HttpStatus.OK);
	}

	
	@PostMapping("/actualizar_habilitado/{idpersona}/{habilitado}")
	public ResponseEntity<app_usuarios> actualizar_user(@PathVariable String idpersona,@PathVariable boolean habilitado){
	      
		app_usuarios user = dao.findByIdpersona(idpersona);
		
		if(user!=null)
		{
			String a="";
			if(habilitado)
			{
				a="1";
			}else
			{
				a="0";
			}
			user.setHabilitado(a);			
			return new ResponseEntity<>(dao.save(user),HttpStatus.OK);
	    }
		
		return new ResponseEntity<>(user,HttpStatus.BAD_REQUEST);
		
	}

}
