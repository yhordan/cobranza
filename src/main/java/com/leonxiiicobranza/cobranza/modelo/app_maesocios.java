package com.leonxiiicobranza.cobranza.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "app_maesocios", schema = "cobranza")
public class app_maesocios {
	
	
	
	// codigo  unico que  le asigna  la cooperativa 
	
	@Id	
	@Column(name = "idmaesocios",length = 14)
	@NotNull
	private String idmaesocios;
	

	@Column(name = "idpersona",length = 7)
	@NotNull
	private String idpersona;
	
	
	@Column(name = "idsocio",length = 7)
	@NotNull
	private String idsocio;
	
	@Column(name = "socio",length = 120)
	@NotNull
	private String socio;	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "idagencia")	
	private app_agencias idagencia;
	
	

	
	@Column(name = "nrodocumento",length = 20)
	@NotNull
	private String nrodocumento;
	
	@Column(name = "tipodocumento",length = 50)
	@NotNull
	private String tipodocumento;
	
	@Column(name = "idubigeodir",length = 8)
	@NotNull
	private String idubigeodir;
	
	@Column(name = "direccion",length = 120)
	private String direccion;
	
	@Column(name = "referencia",length = 120)
	private String referencia;
	
	@Column(name = "celular1",length = 12)
	private String celular1;
	
	@Column(name = "celular2",length = 12)
	private String celular2;
	
	
	@Column(name = "calificacion",length = 20)
	private String calificacion;


	public String getIdmaesocios() {
		return idmaesocios;
	}


	public void setIdmaesocios(String idmaesocios) {
		this.idmaesocios = idmaesocios;
	}


	public String getIdpersona() {
		return idpersona;
	}


	public void setIdpersona(String idpersona) {
		this.idpersona = idpersona;
	}


	public String getIdsocio() {
		return idsocio;
	}


	public void setIdsocio(String idsocio) {
		this.idsocio = idsocio;
	}


	public String getSocio() {
		return socio;
	}


	public void setSocio(String socio) {
		this.socio = socio;
	}


	public app_agencias getIdagencia() {
		return idagencia;
	}


	public void setIdagencia(app_agencias idagencia) {
		this.idagencia = idagencia;
	}


	public String getNrodocumento() {
		return nrodocumento;
	}


	public void setNrodocumento(String nrodocumento) {
		this.nrodocumento = nrodocumento;
	}


	public String getTipodocumento() {
		return tipodocumento;
	}


	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
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


	public String getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}


	


	

}
