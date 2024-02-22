package com.leonxiiicobranza.cobranza.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonxiiicobranza.cobranza.DAO.app_morovisiestadosDao;
import com.leonxiiicobranza.cobranza.DAO.app_motivoatrasoDao;
import com.leonxiiicobranza.cobranza.DAO.app_resultadovisitasDao;
import com.leonxiiicobranza.cobranza.DAO.app_tablasDao;
import com.leonxiiicobranza.cobranza.modelo.app_morovisiestados;
import com.leonxiiicobranza.cobranza.modelo.app_motivoatraso;
import com.leonxiiicobranza.cobranza.modelo.app_resultadovisitas;
import com.leonxiiicobranza.cobranza.modelo.app_tablas;



//@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/app_combos_visita")
public class app_combos_visitaController {
	
	@Autowired
	app_motivoatrasoDao motivodao;
	
	@Autowired
	app_morovisiestadosDao morosidadodao;
	
	@Autowired
	app_resultadovisitasDao resultadodao;
	
	@Autowired
	app_tablasDao tablasdao;
	
	
	@GetMapping("/listar_morovisiestados")
	public ResponseEntity<List<app_morovisiestados>> listar() {		
		
		List<app_morovisiestados> morovisi = morosidadodao.findAll();		
		return new ResponseEntity<>(morovisi, HttpStatus.OK);
	}
	
	@GetMapping("/listar_motivo_atraso")
	public ResponseEntity<List<app_motivoatraso>> listar_2() {		
		
		List<app_motivoatraso> motivo = motivodao.findAll();		
		return new ResponseEntity<>(motivo, HttpStatus.OK);
	}	
	
	
	@GetMapping("/listar_resultado_visita")
	public ResponseEntity<List<app_resultadovisitas>> listar_3() {		
		
		List<app_resultadovisitas> motivo = resultadodao.findAll();		
		return new ResponseEntity<>(motivo, HttpStatus.OK);
	}
	
	@GetMapping("/listar_persona_atendio")
	public ResponseEntity<List<app_tablas>> listar_4() {		
		
		List<app_tablas> lista_persona = tablasdao.listar_persona_atienden();		
		return new ResponseEntity<>(lista_persona, HttpStatus.OK);
	}
	

}
