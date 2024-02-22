package com.leonxiiicobranza.cobranza.modelo;

import java.time.LocalDateTime;

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
@Table(name = "app_morosos", schema = "cobranza")
public class app_morosos {
	
	

	@Id	
	@Column(name = "idmoroso",length = 17)
	@NotNull
	private String idmoroso;
	
	
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
	
	@Column(name = "idanalista",length = 7)
	@NotNull
	private String idanalista;

	@Column(name = "idestcuomor",length = 2)
	@NotNull
	private String idestcuomor;

	@Column(name = "idpersona",length = 7)
	@NotNull
	private String idpersona;
	
	@Column(name = "nrocuota",length = 3)
	@NotNull
	private String nrocuota;

	@Column(name = "montoaprobado")
	@NotNull
	private Double montoaprobado;


	@Column(name = "saldo")
	@NotNull
	private Double saldo;

	@Column(name = "amortizacion")
	@NotNull
	private Double amortizacion;

	@Column(name = "tasainteres",length = 18)
	@NotNull
	private String tasainteres;

	@Column(name = "totalcuotas")
	@NotNull
	private Integer totalcuotas;
	
	@Column(name = "cpagadas")
	@NotNull
	private Integer cpagadas;
	
	@Column(name = "cpendientes")
	@NotNull
	private Integer cpendientes;
	
	@Column(name = "cvencidas")
	@NotNull
	private Integer cvencidas;
	
	@Column(name = "capagar")
	@NotNull
	private Integer capagar;
	
	@Column(name = "fechapagar")
	private LocalDateTime fechapagar;
	
	@Column(name = "diasatrazo")
	@NotNull
	private Integer diasatrazo;

	@Column(name = "diasmorosidad")
	@NotNull
	private Integer diasmorosidad;

	@Column(name = "fechadesembolso")
	@NotNull
	private LocalDateTime fechadesembolso;

	@Column(name = "fechaultpagointeres")
	@NotNull
	private LocalDateTime fechaultpagointeres;
	
	@Column(name = "montoalafecha")
	@NotNull
	private Double montoalafecha;
	
	@Column(name = "estadoprestamo",length = 2)
	@NotNull
	private String estadoprestamo;
	
	@Column(name = "fechar")
	private LocalDateTime fechar;

	@Column(name = "iduserr",length = 6)
	@NotNull
	private String iduserr;
	
	@Column(name = "idsocio")
	private String idsocio;
	
	@Column(name = "socio")
	private String socio;
	
	@Column(name = "userasignado",length = 6)
	private String userasignado;

	@Column(name = "gestorasignado",length = 7)
	private String gestorasignado;
	
	
	public String getGestorasignado() {
		return gestorasignado;
	}

	public void setGestorasignado(String gestorasignado) {
		this.gestorasignado = gestorasignado;
	}

	public String getUserasignado() {
		return userasignado;
	}

	public void setUserasignado(String userasignado) {
		this.userasignado = userasignado;
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

	public String getIdmoroso() {
		return idmoroso;
	}

	public void setIdmoroso(String idmoroso) {
		this.idmoroso = idmoroso;
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

	public String getIdanalista() {
		return idanalista;
	}

	public void setIdanalista(String idanalista) {
		this.idanalista = idanalista;
	}

	public String getIdestcuomor() {
		return idestcuomor;
	}

	public void setIdestcuomor(String idestcuomor) {
		this.idestcuomor = idestcuomor;
	}

	public String getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(String idpersona) {
		this.idpersona = idpersona;
	}

	public String getNrocuota() {
		return nrocuota;
	}

	public void setNrocuota(String nrocuota) {
		this.nrocuota = nrocuota;
	}

	public Double getMontoaprobado() {
		return montoaprobado;
	}

	public void setMontoaprobado(Double montoaprobado) {
		this.montoaprobado = montoaprobado;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getAmortizacion() {
		return amortizacion;
	}

	public void setAmortizacion(Double amortizacion) {
		this.amortizacion = amortizacion;
	}

	public String getTasainteres() {
		return tasainteres;
	}

	public void setTasainteres(String tasainteres) {
		this.tasainteres = tasainteres;
	}

	public Integer getTotalcuotas() {
		return totalcuotas;
	}

	public void setTotalcuotas(Integer totalcuotas) {
		this.totalcuotas = totalcuotas;
	}

	public Integer getCpagadas() {
		return cpagadas;
	}

	public void setCpagadas(Integer cpagadas) {
		this.cpagadas = cpagadas;
	}

	public Integer getCpendientes() {
		return cpendientes;
	}

	public void setCpendientes(Integer cpendientes) {
		this.cpendientes = cpendientes;
	}

	public Integer getCvencidas() {
		return cvencidas;
	}

	public void setCvencidas(Integer cvencidas) {
		this.cvencidas = cvencidas;
	}

	public Integer getCapagar() {
		return capagar;
	}

	public void setCapagar(Integer capagar) {
		this.capagar = capagar;
	}

	public LocalDateTime getFechapagar() {
		return fechapagar;
	}

	public void setFechapagar(LocalDateTime fechapagar) {
		this.fechapagar = fechapagar;
	}

	public Integer getDiasatrazo() {
		return diasatrazo;
	}

	public void setDiasatrazo(Integer diasatrazo) {
		this.diasatrazo = diasatrazo;
	}

	public Integer getDiasmorosidad() {
		return diasmorosidad;
	}

	public void setDiasmorosidad(Integer diasmorosidad) {
		this.diasmorosidad = diasmorosidad;
	}

	public LocalDateTime getFechadesembolso() {
		return fechadesembolso;
	}

	public void setFechadesembolso(LocalDateTime fechadesembolso) {
		this.fechadesembolso = fechadesembolso;
	}

	public LocalDateTime getFechaultpagointeres() {
		return fechaultpagointeres;
	}

	public void setFechaultpagointeres(LocalDateTime fechaultpagointeres) {
		this.fechaultpagointeres = fechaultpagointeres;
	}

	public Double getMontoalafecha() {
		return montoalafecha;
	}

	public void setMontoalafecha(Double montoalafecha) {
		this.montoalafecha = montoalafecha;
	}

	public String getEstadoprestamo() {
		return estadoprestamo;
	}

	public void setEstadoprestamo(String estadoprestamo) {
		this.estadoprestamo = estadoprestamo;
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

	
	
	
	

}
