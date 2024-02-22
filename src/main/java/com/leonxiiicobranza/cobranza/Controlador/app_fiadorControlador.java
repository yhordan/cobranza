package com.leonxiiicobranza.cobranza.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonxiiicobranza.cobranza.DAO.app_fiadorDAO;
import com.leonxiiicobranza.cobranza.modelo.app_fiador;



//@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/fiador")
public class app_fiadorControlador {
	
	@Autowired
	app_fiadorDAO dao;
	
	@PostMapping("/buscar_fiadores/{id_agencia}/{id_docpagare}/{nro_docpagare}/{tipo_moneda}")
	public ResponseEntity<List<app_fiador>> obtenerfiadores(@PathVariable String id_agencia,@PathVariable String id_docpagare,@PathVariable String nro_docpagare,@PathVariable String tipo_moneda) throws Exception{
		
			
		
		List<app_fiador>  lista_fiadores = dao.findByIdagenciapAndIddocpAndNrodocpAndTipmonedap(id_agencia, id_docpagare, nro_docpagare, tipo_moneda);
		return new ResponseEntity<>(lista_fiadores,HttpStatus.OK);

   }

}
