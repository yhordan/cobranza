package com.leonxiiicobranza.cobranza.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonxiiicobranza.cobranza.DAO.app_ubigeoDao;
import com.leonxiiicobranza.cobranza.modelo.app_ubigeo;



@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/app_ubigeo")
public class app_ubigeoController {
	
	@Autowired
	app_ubigeoDao dao;
	
	@GetMapping("/listar")
	public ResponseEntity<List<app_ubigeo>> listar() {
	
		return new ResponseEntity<>(dao.listar_ubigeo_libertad(), HttpStatus.OK);
	}

}
