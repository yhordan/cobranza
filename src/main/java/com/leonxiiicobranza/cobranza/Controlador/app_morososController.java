package com.leonxiiicobranza.cobranza.Controlador;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.text.MaskFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonxiiicobranza.cobranza.DAO.app_morososDao;
import com.leonxiiicobranza.cobranza.DAO.app_morosovisitaDao;
import com.leonxiiicobranza.cobranza.DAO.app_usuariosDao;
import com.leonxiiicobranza.cobranza.modelo.app_morosos;
import com.leonxiiicobranza.cobranza.modelo.app_morosovisitas;
import com.leonxiiicobranza.cobranza.modelo.app_usuarios;
import com.leonxiiicobranza.cobranza.modelo.dto_morosidad;




//@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/moroso")
public class app_morososController {
	
	@Autowired
	app_morososDao dao;
	
	@Autowired
	app_usuariosDao dao_u;
	
	@Autowired
	app_morosovisitaDao daov;
	int visitas=0;
	int compromiso=0;
	
	@GetMapping("/listar_visitas/{iduser}/{fehca_inicial}/{fehca_final}")
	public ResponseEntity<List<app_morosovisitas>> listar_4(@PathVariable String iduser,@PathVariable String fehca_inicial,@PathVariable String fehca_final) {		
		
		List<app_morosovisitas> listaxfechas = daov.listar_x_fecha(iduser,fehca_inicial,fehca_final);
		return new ResponseEntity<>(listaxfechas, HttpStatus.OK);
	}
	
	@GetMapping("/listar_detalle_visitas/{fehca_inicial}/{fehca_final}")
	public ResponseEntity<List<app_morosovisitas>> listar_detalle_fechas(@PathVariable String fehca_inicial,@PathVariable String fehca_final) {		
		
		List<app_morosovisitas> listaxfechas = daov.listar_detallex_fecha(fehca_inicial,fehca_final);
		List<app_usuarios> listar_usuarios = dao_u.findAll();
		
		
		 List<app_morosovisitas> answer = listaxfechas.stream().filter(x->
	
	     {	    	 
	    	 if(buscar(x,listar_usuarios))
	         {return true;}
		     else
		     {return false;}
		 }
			
		 
		 ).collect(Collectors.toList()); 
		return new ResponseEntity<>(answer, HttpStatus.OK);
	}
	
	 boolean buscar (app_morosovisitas x,List<app_usuarios> lista)
	{
		boolean valor=true;
		
		 for(app_usuarios objeto : lista) {
			 {
				 if(objeto.getIdpersona().equals(x.getIdgestor()))
				 {
					valor=true; 
					break;
				 }else
				 {
					 valor=false;
				 }
			 }
		 }
		
		 return valor;
		
	}
	
	@GetMapping("/listar_visitas/{idgestor}")
	public ResponseEntity<List<app_morosos>> listar_5(@PathVariable String idgestor){	
		
		List<app_morosos> listasmorosos = dao.listar_x_idgestor(idgestor);
		return new ResponseEntity<>(listasmorosos, HttpStatus.OK);
	}		
	
	@GetMapping("/listar_detalle_moroso/{idmoroso}")
	public ResponseEntity<List<app_morosovisitas>> listar_6(@PathVariable String idmoroso){	
		
		List<app_morosovisitas> listadetalles = daov.obtener_detalle(idmoroso+"%");
		return new ResponseEntity<>(listadetalles, HttpStatus.OK);
	}
	
	
	@PostMapping("/crear")
	public ResponseEntity<app_morosos> crearAfp(@RequestBody app_morosos moroso){
		
		
		 LocalDateTime datetime = LocalDateTime.now();
         DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
         String formatDateTime = datetime.format(format);  
       	        
           LocalDateTime today = LocalDateTime.parse(formatDateTime.replace(" ","T"));
        
		    moroso.setFechar(today);
			return new ResponseEntity<>(dao.save(moroso), HttpStatus.CREATED);
		
	}
	
	@PostMapping("/crear_visita")
	public ResponseEntity<app_morosovisitas> crear(@RequestBody dto_morosidad moroso){
		//if(afpServicio.validarAfp(afp.getCodigo(), afp.getDecripcion_afp()) == null) {
		 int width = 3;
		 String codigo="";
		 app_morosos  moroso1=null;
	  
		    moroso1 = dao.findByTipomonedapAndNrodocpAndIdagenciapAndIddocp(moroso.getMorosos().getTipomonedap(),moroso.getMorosos().getNrodocp(),moroso.getMorosos().getIdagenciap(),moroso.getMorosos().getIddocp());
		           if(moroso1 ==null)
		         {
		        	  
		        	app_morosos moro= dao.save(moroso.getMorosos());
		            codigo=moro.getIdmoroso();  
		        	
		         }
		           if(moroso1 !=null)
			         {
		        	   moroso.getMorosovisitas().setNromoroso(moroso1.getNromoroso());
		        	   moroso1.setGestorasignado(moroso.getMorosos().getGestorasignado());
			           dao.save(moroso1);
			           
			        	 codigo=moroso1.getIdmoroso();
			         }
		           
		              
		        
		         if(dao.obtener_maximo_valor_id_mrorvisita(codigo+"%")!=null)
		         {
		        	 String numero1 = String.format("%0" + width + "d", Integer.valueOf(dao.obtener_maximo_valor_id_mrorvisita(codigo+"%"))+1);
			         moroso.getMorosovisitas().setIdmorosovisita(moroso1.getIdmoroso()+numero1);
			        
			      
					moroso.getMorosovisitas().setNrovisita(numero1);
				    
			     }
	            else
	           {
		        	 moroso.getMorosovisitas().setIdmorosovisita(codigo+"001");
			         moroso.getMorosovisitas().setNrovisita("001");
		        	 
		       }
		         
		     moroso.getMorosovisitas().setHoraini(hora_arreglada(moroso.getMorosovisitas().getHoraini()));
		     moroso.getMorosovisitas().setHorafin(hora_arreglada(moroso.getMorosovisitas().getHorafin()));
		        
		  	        
		         
			return new ResponseEntity<>(daov.save(moroso.getMorosovisitas()), HttpStatus.CREATED);
		
	}

	@PostMapping("/crear_visita_prueba")
	public ResponseEntity<app_morosovisitas> crear_prueba(@RequestBody dto_morosidad moroso){

		       
		       app_morosovisitas mro= daov.findByIdmorosovisita("01000600104446025001");
		         
			return new ResponseEntity<>(mro, HttpStatus.CREATED);
		
	}
	
	public String hora_arreglada(String valor)
	{
		try {
		 String mensaje = valor;
         String hora="";
         String minuto="";
         String segundo="";
         String resultado="";
        		 
         if(mensaje.length()<8)
         { 
        	 int indice_1p = mensaje.indexOf(":");
         
             if(mensaje.substring(0,indice_1p).length()==1)
             {
            	 String phoneMask= "0#";
            	 String hora_reparar=mensaje.substring(0,indice_1p);
            	 MaskFormatter maskFormatter= new MaskFormatter(phoneMask);
    	         maskFormatter.setValueContainsLiteralCharacters(false);     
    	       	 hora= maskFormatter.valueToString(hora_reparar);
             }	else
             {
            	 hora=mensaje.substring(0,indice_1p);
             }
            
            int indice_2_p = mensaje.substring(indice_1p+1, mensaje.length()).indexOf(":");
             
             if(mensaje.substring(indice_1p+1, mensaje.length()).substring(0, indice_2_p).length()==1)
             {
            	 String phoneMask= "0#";
            	 String minuto_reparar=mensaje.substring(indice_1p+1, mensaje.length()).substring(0, indice_2_p).substring(0,indice_2_p);
            	 MaskFormatter maskFormatter= new MaskFormatter(phoneMask);
    	         maskFormatter.setValueContainsLiteralCharacters(false);     
    	       	 minuto= maskFormatter.valueToString(minuto_reparar);
             }	else
             {
            	 minuto=mensaje.substring(indice_1p+1, mensaje.length()).substring(0,indice_2_p);
             }
                        
             
           segundo=mensaje.substring(indice_1p+1, mensaje.length()).substring(indice_2_p+1, mensaje.substring(indice_1p+1, mensaje.length()).length());
             
             if(segundo.length()==1)
             {
            	 String phoneMask= "0#";	                	
            	 MaskFormatter maskFormatter= new MaskFormatter(phoneMask);
    	         maskFormatter.setValueContainsLiteralCharacters(false);     
    	       	 segundo= maskFormatter.valueToString(segundo);
             }
             
            
            resultado=hora+":"+minuto+":"+segundo;
          
         }else
         {
        	 resultado=mensaje;
	          
        	 
         }
         return resultado;
		}catch(Exception ex)
		{
			return valor;
		}
	}

}
