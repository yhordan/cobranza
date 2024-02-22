package com.leonxiiicobranza.cobranza.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name ="Movimientos" , schema = "online" )


//@IdClass(movimientos.class)                         // <--this is the extra annotation to add


public class movimientos implements Serializable {
 
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NroMovi" ,columnDefinition = "CHAR(10)")
	private String nromovi;
	

	@Column(name = "Idagencia" ,columnDefinition = "CHAR(2)")
	private String idagencia;
	

	@Column(name = "IdTipCta" ,columnDefinition = "CHAR(2)")
	private String idtipcta;
	

	@Column(name = "TipMoneda" ,columnDefinition = "CHAR(1)")
	private String TipMoneda;
	

	@Column(name = "NumCuenta" ,columnDefinition = "CHAR(7)")
	private String numcuenta;

	@Column(name = "IdOpe" ,columnDefinition = "CHAR(5)")
	private String idope;
	

	@Column(name = "Operacion" ,length = 180)
	private String operacion;
	
	
	@Column(name = "MontoS" ,columnDefinition = "decimal(18,2)")
	private float MontoS;
	

	@Column(name = "MontoD" ,columnDefinition = "decimal(18,2)")
	private float MontoD;
	
	
	@Column(name = "FecMov" ,columnDefinition = "smalldatetime")
	private LocalDateTime FecMov;
    

	@Column(name = "Hora" ,columnDefinition = "CHAR(8)")
	private String Hora;	 
	

	@Column(name = "Operador" ,columnDefinition = "CHAR(1)")
	private String Operador;	 
	
	
	@Column(name = "IdPersona" ,columnDefinition = "CHAR(7)")
	private String IdPersona;	
	
	
	@Column(name = "nrodoc" ,columnDefinition = "CHAR(7)")
	private String nrodoc;	
	

	@Column(name = "IdTipOpe" ,columnDefinition = "CHAR(2)")
	private String IdTipOpe;


	public String getNromovi() {
		return nromovi;
	}


	public void setNromovi(String nromovi) {
		this.nromovi = nromovi;
	}


	public String getIdagencia() {
		return idagencia;
	}


	public void setIdagencia(String idagencia) {
		this.idagencia = idagencia;
	}


	public String getIdtipcta() {
		return idtipcta;
	}


	public void setIdtipcta(String idtipcta) {
		this.idtipcta = idtipcta;
	}


	public String getTipMoneda() {
		return TipMoneda;
	}


	public void setTipMoneda(String tipMoneda) {
		TipMoneda = tipMoneda;
	}


	public String getNumcuenta() {
		return numcuenta;
	}


	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}


	public String getIdope() {
		return idope;
	}


	public void setIdope(String idope) {
		this.idope = idope;
	}


	public String getOperacion() {
		return operacion;
	}


	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}


	public float getMontoS() {
		return MontoS;
	}


	public void setMontoS(float montoS) {
		MontoS = montoS;
	}


	public float getMontoD() {
		return MontoD;
	}


	public void setMontoD(float montoD) {
		MontoD = montoD;
	}


	public LocalDateTime getFecMov() {
		return FecMov;
	}


	public void setFecMov(LocalDateTime fecMov) {
		FecMov = fecMov;
	}


	public String getHora() {
		return Hora;
	}


	public void setHora(String hora) {
		Hora = hora;
	}


	public String getOperador() {
		return Operador;
	}


	public void setOperador(String operador) {
		Operador = operador;
	}


	public String getIdPersona() {
		return IdPersona;
	}


	public void setIdPersona(String idPersona) {
		IdPersona = idPersona;
	}


	public String getNrodoc() {
		return nrodoc;
	}


	public void setNrodoc(String nrodoc) {
		this.nrodoc = nrodoc;
	}


	public String getIdTipOpe() {
		return IdTipOpe;
	}


	public void setIdTipOpe(String idTipOpe) {
		IdTipOpe = idTipOpe;
	}
	
	
	
		     
}	    
