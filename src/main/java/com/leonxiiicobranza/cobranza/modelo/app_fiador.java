package com.leonxiiicobranza.cobranza.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "app_fiador", schema = "cobranza")
public class app_fiador {
	
	@Id	
	@Column(name = "idfiador",length = 21)
	@NotNull
	private String idfiador;
	
	@Column(name = "idsocio",length = 7)
	@NotNull
	private String idsocio;		
	

	@Column(name = "idpersonatitular",length = 7)
	@NotNull
	private String idpersonatitular;
	
	@Column(name = "iddocp",length = 4)
	@NotNull
	private String iddocp;
    
	@Column(name = "nrodocp",length = 7)
	@NotNull
	private String nrodocp;
  
	@Column(name = "tipmonedap",length = 1)
	@NotNull
	private String tipmonedap;

	@Column(name = "idagenciap",length = 2)
	@NotNull
	private String idagenciap;
	
	@Column(name = "idpersonafiador",length = 7)
	@NotNull
	private String idpersonafiador;
	
	@Column(name = "fiador",length = 250)
	@NotNull
	private String fiador;
	
	@Column(name = "tipodocumento",length = 100)
	@NotNull
	private String tipodocumento;
    
	@Column(name = "nrodocumento",length = 18)
	@NotNull
	private String nrodocumento;
	
	@Column(name = "idubigeodir",length = 8)
	@NotNull
	private String idubigeodir;
   
	@Column(name = "direccion",length = 200)
	private String direccion;
	
	
	@Column(name = "referencia",length = 200)
	private String referencia;
 
	@Column(name = "celular1",length = 12)
	private String celular1;
   
	@Column(name = "celular2",length = 12)
	private String celular2;

	public String getIdfiador() {
		return idfiador;
	}

	public void setIdfiador(String idfiador) {
		this.idfiador = idfiador;
	}

	public String getIdsocio() {
		return idsocio;
	}

	public void setIdsocio(String idsocio) {
		this.idsocio = idsocio;
	}

	public String getIdpersonatitular() {
		return idpersonatitular;
	}

	public void setIdpersonatitular(String idpersonatitular) {
		this.idpersonatitular = idpersonatitular;
	}

	public String getIddocp() {
		return iddocp;
	}

	public void setIddocp(String iddocp) {
		this.iddocp = iddocp;
	}

	public String getNrodocp() {
		return nrodocp;
	}

	public void setNrodocp(String nrodocp) {
		this.nrodocp = nrodocp;
	}

	public String getTipmonedap() {
		return tipmonedap;
	}

	public void setTipmonedap(String tipmonedap) {
		this.tipmonedap = tipmonedap;
	}

	public String getIdagenciap() {
		return idagenciap;
	}

	public void setIdagenciap(String idagenciap) {
		this.idagenciap = idagenciap;
	}

	public String getIdpersonafiador() {
		return idpersonafiador;
	}

	public void setIdpersonafiador(String idpersonafiador) {
		this.idpersonafiador = idpersonafiador;
	}

	public String getFiador() {
		return fiador;
	}

	public void setFiador(String fiador) {
		this.fiador = fiador;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getNrodocumento() {
		return nrodocumento;
	}

	public void setNrodocumento(String nrodocumento) {
		this.nrodocumento = nrodocumento;
	}

	public String getIdubigeodir() {
		return idubigeodir;
	}

	public void setIdubigeodir(String idubigeodir) {
		this.idubigeodir = idubigeodir;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getCelular1() {
		return celular1;
	}

	public void setCelular1(String celular1) {
		this.celular1 = celular1;
	}

	public String getCelular2() {
		return celular2;
	}

	public void setCelular2(String celular2) {
		this.celular2 = celular2;
	}
	
  
	
	
	

}
