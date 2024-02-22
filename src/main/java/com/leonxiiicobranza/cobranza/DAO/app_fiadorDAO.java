package com.leonxiiicobranza.cobranza.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonxiiicobranza.cobranza.modelo.app_fiador;



public interface app_fiadorDAO extends JpaRepository<app_fiador,String>{

	public List<app_fiador> findByIdagenciapAndIddocpAndNrodocpAndTipmonedap(String id_agencia,String id_docpagare,String nro_docpagare,String tipo_moneda );

}