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
@Table(name = "app_cuotas_convenio", schema = "cobranza")
public class app_cuotas_convenio {
	
	
	@Id	
	@Column(name = "idcuotasconvenio",length = 17)
	@NotNull
	private String idcuotasconvenio;
	
	@Column(name = "idpersona",length = 7)
	@NotNull
	private String idpersona;
	
	@Column(name = "iddocp",length = 4)
	@NotNull
	private String iddocp;
	
	@Column(name = "nrodocp",length = 7)
	@NotNull
	private String nrodocp;
	
	@Column(name = "tipmonedap",length = 1)
	@NotNull
	private String tipmonedap;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "idagenciap")	
	private app_agencias idagenciap;
	
	@Column(name = "iddocconv",length = 4)
	@NotNull
	private String iddocconv;
	
	@Column(name = "nrodocconv",length = 7)
	@NotNull
	private String nrodocconv;
	
	@Column(name = "tipmonedaconv",length = 1)
	@NotNull
	private String tipmonedaconv;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "idagenciaconv")	
	private app_agencias idagenciaconv;
	
	
	@Column(name = "nrocuota",length = 3)
	@NotNull
	private String nrocuota;
	
	@Column(name = "fecven")
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
	
	@Column(name = "intmoratorio")
	private Double intmoratorio;
	
	@Column(name = "intvencido")
	private Double intvencido;
	
	@Column(name = "interesmoraconv")
	private Double interesmoraconv;
	
	@Column(name = "interesvencconv")
	private Double interesvencconv;
	
	@Column(name = "gastos")
	private Double gastos;
	
	

	public Double getGastos() {
		return gastos;
	}

	public void setGastos(Double gastos) {
		this.gastos = gastos;
	}

	public String getIdcuotasconvenio() {
		return idcuotasconvenio;
	}

	public void setIdcuotasconvenio(String idcuotasconvenio) {
		this.idcuotasconvenio = idcuotasconvenio;
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

	public String getTipmonedap() {
		return tipmonedap;
	}

	public void setTipmonedap(String tipmonedap) {
		this.tipmonedap = tipmonedap;
	}

	public app_agencias getIdagenciap() {
		return idagenciap;
	}

	public void setIdagenciap(app_agencias idagenciap) {
		this.idagenciap = idagenciap;
	}

	public String getIddocconv() {
		return iddocconv;
	}

	public void setIddocconv(String iddocconv) {
		this.iddocconv = iddocconv;
	}

	public String getNrodocconv() {
		return nrodocconv;
	}

	public void setNrodocconv(String nrodocconv) {
		this.nrodocconv = nrodocconv;
	}

	public String getTipmonedaconv() {
		return tipmonedaconv;
	}

	public void setTipmonedaconv(String tipmonedaconv) {
		this.tipmonedaconv = tipmonedaconv;
	}

	public app_agencias getIdagenciaconv() {
		return idagenciaconv;
	}

	public void setIdagenciaconv(app_agencias idagenciaconv) {
		this.idagenciaconv = idagenciaconv;
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

	public Double getIntmoratorio() {
		return intmoratorio;
	}

	public void setIntmoratorio(Double intmoratorio) {
		this.intmoratorio = intmoratorio;
	}

	public Double getIntvencido() {
		return intvencido;
	}

	public void setIntvencido(Double intvencido) {
		this.intvencido = intvencido;
	}

	public Double getInteresmoraconv() {
		return interesmoraconv;
	}

	public void setInteresmoraconv(Double interesmoraconv) {
		this.interesmoraconv = interesmoraconv;
	}

	public Double getInteresvencconv() {
		return interesvencconv;
	}

	public void setInteresvencconv(Double interesvencconv) {
		this.interesvencconv = interesvencconv;
	}
	
	
	
	
}
