package com.leonxiiicobranza.cobranza.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "app_morosovisita", schema = "cobranza")
public class app_morosovisitas {
	

	@Id
	@Column(name = "idmorosovisita",length = 20)
	@NotNull
	private String  idmorosovisita;
	
	
	@Column(name = "nrovisita",length = 3)
	@NotNull
	private String nrovisita;	
	

	@Column(name = "nromoroso",length = 3)
	@NotNull
	private String nromoroso;
	
	@Column(name = "iddocp",length = 4)
	@NotNull
	private String iddocp;
	
	@Column(name = "nrodocp",length = 7)
	@NotNull
	private String nrodocp;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "idagenciap")	
	private app_agencias idagenciap;
	
	@Column(name = "tipomonedap",length = 1)
	@NotNull
	private String tipomonedap;
	
	@Column(name = "idresultadovisita",length = 2)
	@NotNull
	private String idresultadovisita;

	@Column(name = "idmorovisiestado",length = 2)
	@NotNull
	private String idmorovisiestado;
	
	@Column(name = "idmotatra",length = 2)
	private String idmotatra;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "personaatendio")	
	private app_tablas personaatendio;
	
	
	@Column(name = "idgestor",length = 7)
	@NotNull
	private String idgestor;

	@Column(name = "fecvisita")
	@NotNull
	private LocalDateTime fecvisita;
	
	@Column(name = "direccion",length = 250)
	@NotNull
	private String direccion;
	
	@Column(name = "comentario",length = 500)
	@NotNull
	private String comentario;
	
	@Column(name = "compromisopago",length = 1)
	@NotNull
	private String compromisopago;
	
	@Column(name = "montocompromiso")
	private Double montocompromiso;
	
	
	@Column(name = "fechacompromiso")
	private LocalDateTime fechacompromiso;
	
	@Column(name = "horaini",length = 8)
	private String horaini;
	
	@Column(name = "horafin",length = 8)
	private String horafin;
	
	@Column(name = "fechar")
	@NotNull
	private LocalDateTime fechar;
	
	@Column(name = "iduserr",length = 6)
	@NotNull
	private String iduserr;
	
	@Column(name = "idevalsbsalineado",length = 4)
	private String idevalsbsalineado;	
	
	@Column(name = "geolocalizacion_latitud")
	private String geolocalizacion_latitud;
	
	@Column(name = "geolocalizacion_longitud")
	private String geolocalizacion_longitud;	
	
	@Lob
	@Column(name = "foto")
	private  byte[] foto;
	
	@Column(name = "idsocio")
	private String idsocio;
	
	
   public String getIdsocio() {
		return idsocio;
	}

	public void setIdsocio(String idsocio) {
		this.idsocio = idsocio;
	}


	public String getIdmorosovisita() {
		return idmorosovisita;
	}

	public void setIdmorosovisita(String idmorosovisita) {
		this.idmorosovisita = idmorosovisita;
	}

	public String getNrovisita() {
		return nrovisita;
	}

	public void setNrovisita(String nrovisita) {
		this.nrovisita = nrovisita;
	}

	public String getNromoroso() {
		return nromoroso;
	}

	public void setNromoroso(String nromoroso) {
		this.nromoroso = nromoroso;
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

	public app_agencias getIdagenciap() {
		return idagenciap;
	}

	public void setIdagenciap(app_agencias idagenciap) {
		this.idagenciap = idagenciap;
	}

	public String getTipomonedap() {
		return tipomonedap;
	}

	public void setTipomonedap(String tipomonedap) {
		this.tipomonedap = tipomonedap;
	}

	public String getIdresultadovisita() {
		return idresultadovisita;
	}

	public void setIdresultadovisita(String idresultadovisita) {
		this.idresultadovisita = idresultadovisita;
	}

	public String getIdmorovisiestado() {
		return idmorovisiestado;
	}

	public void setIdmorovisiestado(String idmorovisiestado) {
		this.idmorovisiestado = idmorovisiestado;
	}

	public String getIdmotatra() {
		return idmotatra;
	}

	public void setIdmotatra(String idmotatra) {
		this.idmotatra = idmotatra;
	}

	public app_tablas getPersonaatendio() {
		return personaatendio;
	}

	public void setPersonaatendio(app_tablas personaatendio) {
		this.personaatendio = personaatendio;
	}

	public String getIdgestor() {
		return idgestor;
	}

	public void setIdgestor(String idgestor) {
		this.idgestor = idgestor;
	}

	public LocalDateTime getFecvisita() {
		return fecvisita;
	}

	public void setFecvisita(LocalDateTime fecvisita) {
		this.fecvisita = fecvisita;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getCompromisopago() {
		return compromisopago;
	}

	public void setCompromisopago(String compromisopago) {
		this.compromisopago = compromisopago;
	}

	public Double getMontocompromiso() {
		return montocompromiso;
	}

	public void setMontocompromiso(Double montocompromiso) {
		this.montocompromiso = montocompromiso;
	}

	public LocalDateTime getFechacompromiso() {
		return fechacompromiso;
	}

	public void setFechacompromiso(LocalDateTime fechacompromiso) {
		this.fechacompromiso = fechacompromiso;
	}

	public String getHoraini() {
		return horaini;
	}

	public void setHoraini(String horaini) {
		this.horaini = horaini;
	}

	public String getHorafin() {
		return horafin;
	}

	public void setHorafin(String horafin) {
		this.horafin = horafin;
	}

	public LocalDateTime getFechar() {
		return fechar;
	}

	public void setFechar(LocalDateTime fechar) {
		this.fechar = fechar;
	}

	public String getIduserr() {
		return iduserr;
	}

	public void setIduserr(String iduserr) {
		this.iduserr = iduserr;
	}

	public String getIdevalsbsalineado() {
		return idevalsbsalineado;
	}

	public void setIdevalsbsalineado(String idevalsbsalineado) {
		this.idevalsbsalineado = idevalsbsalineado;
	}

	public String getGeolocalizacion_latitud() {
		return geolocalizacion_latitud;
	}

	public void setGeolocalizacion_latitud(String geolocalizacion_latitud) {
		this.geolocalizacion_latitud = geolocalizacion_latitud;
	}

	public String getGeolocalizacion_longitud() {
		return geolocalizacion_longitud;
	}

	public void setGeolocalizacion_longitud(String geolocalizacion_longitud) {
		this.geolocalizacion_longitud = geolocalizacion_longitud;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	

	
}
