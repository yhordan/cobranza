package com.leonxiiicobranza.cobranza.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.leonxiiicobranza.cobranza.modelo.app_agencias;
import com.leonxiiicobranza.cobranza.modelo.app_morosos;
import com.leonxiiicobranza.cobranza.modelo.app_morosovisitas;


public interface app_morososDao extends JpaRepository<app_morosos,String>{
	
	//cambio
	@Query(value = "select max(RIGHT(idmorosovisita,3)) from cobranza.app_morosovisita where idmorosovisita like ? ",nativeQuery = true)	
	public String obtener_maximo_valor_id_mrorvisita(String idmoroso);
	
	
	 
	@Query(value = "select *from cobranza.app_morosos where iduserr=? and fechar between ?  AND ?",nativeQuery = true)	
	public List<app_morosovisitas> listar_x_fecha(String iduser,String fecha_inicio,String fecha_final);
	
	public app_morosos findByIdmoroso(String idmoroso);
	

	@Query(value = "select *from cobranza.app_morosos where gestorasignado=? order by fechar desc ",nativeQuery = true)	
	public List<app_morosos> listar_x_idgestor(String iduser);
	
	public app_morosos findByTipomonedapAndNrodocpAndIdagenciapAndIddocp(String tipo_moneda,String nro_doc,app_agencias idagencia,String id_doc);

}
