package com.leonxiiicobranza.cobranza.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
@Table(name = "app_detalle_cuenta_credito", schema = "cobranza")
public class app_detalle_cuenta_credito implements Serializable {

    @Id
	@Column(name = "idcuentacredito",length = 14)
	@NotNull
	private String idcuentacredito;	
    @OneToOne(fetch = FetchType.EAGER)
    @MapsId
    @JoinColumn(name = "idcuentacredito")
    @JsonIgnore
    private app_cuenta_credito cuenta_credito;
	

	@Column(name = "diasmorosidad")
	@NotNull
	private Integer diasmorosidad;
	
	@Column(name = "fecultpagointeres")
	@NotNull
	private LocalDateTime fecultpagointeres;	
	
	@Column(name = "montoalafecha")
	@NotNull
	private Double montoalafecha;
	
	@Column(name = "cpagadas")
	@NotNull
	private Integer cpagadas;
	
	@Column(name = "cpendientes")
	@NotNull
	private Integer cpendientes;
	
	@Column(name = "cvencidas")
	@NotNull
	private Integer cvencidas;
	
	
	@Column(name = "primeracuotamorosa",length = 3)
	@NotNull
	private String primeracuotamorosa;
	
	@Column(name = "feccuotamorosa")
	@NotNull
	private LocalDateTime feccuotamorosa;
	
	@Column(name = "diasatraso")
	private Integer  diasatraso;
	
	

	public Integer getDiasatraso() {
		return diasatraso;
	}

	public void setDiasatraso(Integer diasatraso) {
		this.diasatraso = diasatraso;
	}

	public String getIdcuentacredito() {
		return idcuentacredito;
	}

	public void setIdcuentacredito(String idcuentacredito) {
		this.idcuentacredito = idcuentacredito;
	}

	public app_cuenta_credito getCuenta_credito() {
		return cuenta_credito;
	}

	public void setCuenta_credito(app_cuenta_credito cuenta_credito) {
		this.cuenta_credito = cuenta_credito;
	}

	public Integer getDiasmorosidad() {
		return diasmorosidad;
	}

	public void setDiasmorosidad(Integer diasmorosidad) {
		this.diasmorosidad = diasmorosidad;
	}

	public LocalDateTime getFecultpagointeres() {
		return fecultpagointeres;
	}

	public void setFecultpagointeres(LocalDateTime fecultpagointeres) {
		this.fecultpagointeres = fecultpagointeres;
	}

	public Double getMontoalafecha() {
		return montoalafecha;
	}

	public void setMontoalafecha(Double montoalafecha) {
		this.montoalafecha = montoalafecha;
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

	public String getPrimeracuotamorosa() {
		return primeracuotamorosa;
	}

	public void setPrimeracuotamorosa(String primeracuotamorosa) {
		this.primeracuotamorosa = primeracuotamorosa;
	}

	public LocalDateTime getFeccuotamorosa() {
		return feccuotamorosa;
	}

	public void setFeccuotamorosa(LocalDateTime feccuotamorosa) {
		this.feccuotamorosa = feccuotamorosa;
	}
	
	

	
	

}
