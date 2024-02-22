package com.leonxiiicobranza.cobranza.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.leonxiiicobranza.cobranza.modelo.app_morosovisitas;


public interface app_morosovisitaDao extends JpaRepository<app_morosovisitas,String>{
	
	
	@Query(value = "select max(RIGHT(idmorosovisita, 3)) from cobranza.app_morosovisita where idmorosovisita like ? ",nativeQuery = true)	
	public String listar_visitasxgestor(String idmoroso);
		 
	@Query(value = "select *from cobranza.app_morosovisita where iduserr=? and fechar between ?  AND ? order by fechar asc",nativeQuery = true)	
	public List<app_morosovisitas> listar_x_fecha(String iduser,String fecha_inicio,String fecha_final);
	
	@Query(value = "select idmorosovisita,comentario,compromisopago,direccion,fechacompromiso,fechar,fecvisita,null as foto,geolocalizacion_latitud,geolocalizacion_longitud,horafin,horaini,iddocp,idevalsbsalineado,idgestor,idmorovisiestado,idmotatra,idresultadovisita,idsocio,Lower(iduserr)  as iduserr,montocompromiso,nrodocp,nromoroso,nrovisita,tipomonedap,idagenciap,personaatendio from cobranza.app_morosovisita where fechar between ?  AND ? ",nativeQuery = true)	
	public List<app_morosovisitas> listar_detallex_fecha(String fecha_inicio,String fecha_final);
		
	@Query(value = "select * from cobranza.app_morosovisita where idmorosovisita like ?  order by fechar asc",nativeQuery = true)	
	public List<app_morosovisitas> obtener_detalle(String idmoroso);
		
	public app_morosovisitas findByIdmorosovisita(String codigo);
			
			
			
}
