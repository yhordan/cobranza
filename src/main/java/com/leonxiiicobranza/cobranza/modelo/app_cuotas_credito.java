package com.leonxiiicobranza.cobranza.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "app_cuotas_credito", schema = "cobranza")
public class app_cuotas_credito {
	
	@Id	
	@Column(name = "idcuotascredito",length = 17)
	@NotNull
	private String idcuotascredito;	
	
	
	// id del socio aqui
	@Column(name = "idpersona",length = 7)
	@NotNull
	private String idpersona;
	
	@Column(name = "iddocp",length = 4)
	@NotNull
	private String iddocp;
	
	@Column(name = "nrodocp",length = 7)
	@NotNull
	private String nrodocp;
	
	@Column(name = "tipomonedap",length = 1)
	@NotNull
	private String tipomonedap;
	
	@Column(name = "idagenciap",length = 2)
	@NotNull
	private String idagenciap;
	
	@Column(name = "nrocuota",length = 3)
	@NotNull
	private String nrocuota;
	
	@Column(name = "fecven",length = 3)
	@NotNull
	private LocalDateTime fecven;
	
	@Column(name = "estcuota",length = 1)
	@NotNull
	private String estcuota;
	
	@Column(name = "diasatraso")
	private Integer diasatraso;
	
	@Column(name = "amortiza")	
	private Double amortiza;
	
	@Column(name = "interes")
	private Double interes;
	
	@Column(name = "desgravamen")
	private Double desgravamen;
	
	@Column(name = "interesmora")
	private Double interesmora;
	
	@Column(name = "interesvenc")
	private Double interesvenc;

	public String getIdcuotascredito() {
		return idcuotascredito;
	}

	public void setIdcuotascredito(String idcuotascredito) {
		this.idcuotascredito = idcuotascredito;
	}

	public String getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(String idpersona) {
		this.idpersona = idpersona;
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

	public String getTipomonedap() {
		return tipomonedap;
	}

	public void setTipomonedap(String tipomonedap) {
		this.tipomonedap = tipomonedap;
	}

	public String getIdagenciap() {
		return idagenciap;
	}

	public void setIdagenciap(String idagenciap) {
		this.idagenciap = idagenciap;
	}

	public String getNrocuota() {
		return nrocuota;
	}

	public void setNrocuota(String nrocuota) {
		this.nrocuota = nrocuota;
	}

	public LocalDateTime getFecven() {
		return fecven;
	}

	public void setFecven(LocalDateTime fecven) {
		this.fecven = fecven;
	}

	public String getEstcuota() {
		return estcuota;
	}

	public void setEstcuota(String estcuota) {
		this.estcuota = estcuota;
	}

	public Integer getDiasatraso() {
		return diasatraso;
	}

	public void setDiasatraso(Integer diasatraso) {
		this.diasatraso = diasatraso;
	}

	public Double getAmortiza() {
		return amortiza;
	}

	public void setAmortiza(Double amortiza) {
		this.amortiza = amortiza;
	}

	public Double getInteres() {
		return interes;
	}

	public void setInteres(Double interes) {
		this.interes = interes;
	}

	public Double getDesgravamen() {
		return desgravamen;
	}

	public void setDesgravamen(Double desgravamen) {
		this.desgravamen = desgravamen;
	}

	public Double getInteresmora() {
		return interesmora;
	}

	public void setInteresmora(Double interesmora) {
		this.interesmora = interesmora;
	}

	public Double getInteresvenc() {
		return interesvenc;
	}

	public void setInteresvenc(Double interesvenc) {
		this.interesvenc = interesvenc;
	}
	

	
	
	
	

}
