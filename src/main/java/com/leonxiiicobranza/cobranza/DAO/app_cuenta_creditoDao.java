package com.leonxiiicobranza.cobranza.DAO;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.leonxiiicobranza.cobranza.modelo.app_cuenta_credito;



public interface app_cuenta_creditoDao extends JpaRepository<app_cuenta_credito,String>{
	
	
	@Query(value = "  select * from cobranza.app_cuenta_credito as ap join cobranza.app_detalle_cuenta_credito as op on ap.idcuentacredito = op.idcuentacredito where op.cvencidas!=0 and ap.idanalista=?; ",nativeQuery = true)
	public List<app_cuenta_credito> findByIdanalista(String idanalista);
	
	
	//@Query(value = "SELECT TOP 1  * FROM cobranza.app_cuenta_credito ",nativeQuery = true)
	public List<app_cuenta_credito> findFirst10ByOrderByIdanalista();
	
	
	//@Transactional(readOnly = true) 
	@Query(value = "select api.*,op.cpagadas\r\n"
			+ "      ,op.cpendientes as pendiente\r\n"
			+ "      ,op.cvencidas\r\n"
			+ "      ,op.diasmorosidad\r\n"
			+ "      ,op.feccuotamorosa\r\n"
			+ "      ,op.fecultpagointeres\r\n"
			+ "      ,op.montoalafecha\r\n"
			+ "      ,op.primeracuotamorosa\r\n"
			+ "      ,op.diasatraso from cobranza.app_cuenta_credito as api\r\n"
			+ "join cobranza.app_detalle_cuenta_credito as op \r\n"
			+ "on api.idcuentacredito= op.idcuentacredito\r\n"
			+ "where op.cvencidas!=0 ",nativeQuery = true)
	public List<app_cuenta_credito> findAll();
	
	
	@Transactional(readOnly = true)
	@Query(value = "  select * from cobranza.app_cuenta_credito as ap join cobranza.app_detalle_cuenta_credito as op on ap.idcuentacredito = op.idcuentacredito where op.cvencidas!=0 ; ",nativeQuery = true)
	public List<app_cuenta_credito> listar_cuentas_credito_todo();
	
	
	
	public List<app_cuenta_credito> findByIdagenciapagareAndIddocpagareAndNrodocpagareAndTipomoneda(String id_agencia,String id_docpagare,String nro_docpagare,String tipo_moneda );

	
	
	
}
