package com.leonxiiicobranza.cobranza.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "app_cuenta_credito", schema = "cobranza")
public class app_cuenta_credito implements Serializable {
	
	
	@Id	
	@Column(name = "idcuentacredito",length = 14)
	@NotNull
	private String idcuentacredito;
	
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "cuenta_credito",fetch = FetchType.LAZY)   
    private app_detalle_cuenta_credito detalle_cuenta_credito;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "idmaesocios")		
	private app_maesocios idmaesocios;
	
	@Column(name = "idpersona",length = 7)
	@NotNull
	private String idpersona;
	
	@Column(name = "idagenciacta",length = 2)
	@NotNull
	private String idagenciacta;
	
	@Column(name = "tipomonedacta",length = 2)
	@NotNull
	private String tipomonedacta;
	
	@Column(name = "idtipocuenta",length = 2)
	@NotNull
	private String idtipocuenta;
	
	@Column(name = "num_cuenta",length = 7)
	@NotNull
	private String num_cuenta;	
	
	@Column(name = "iddocpagare",length = 4)
	@NotNull
	private String iddocpagare;
	
	@Column(name = "nrodocpagare",length = 7)
	@NotNull
	private String nrodocpagare;
	
	@Column(name = "tipomoneda",length = 1)
	@NotNull
	private String tipomoneda;
	
	@Column(name = "idagenciapagare",length = 2)
	@NotNull
	private String idagenciapagare;
	
	@Column(name = "denominacion",length = 60)
	@NotNull
	private String denominacion;
	
	@Column(name = "idanalista",length =7)
	@NotNull
	private String idanalista;
	
	@Column(name = "plazo_apro")
	private Integer plazo_apro;
	
	@Column(name = "monto_aprobado")
	private Double monto_aprobado;
	
	@Column(name = "saldo")
	private Double saldo;
	
	@Column(name = "cpendientes")
	private Integer cpendientes;
	
	@Column(name = "tasainteres",length = 18)
	private String tasainteres;
	
	@Column(name = "idevalsbs",length = 4)
	private String idevalsbs;

	@Column(name = "calificacionsbs",length = 20)
	private String calificacionsbs;	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "idestadodoc")		
	private app_estadodocumento idestadodoc;
	
	
	@Column(name = "fecdesembolso")
	@NotNull
	private LocalDateTime fecdesembolso;
	
	@Column(name = "convjud",length = 1)
	private String convjud;
	
	@Column(name = "convextra",length = 1)
	private String convextra;
	
	

	public String getConvjud() {
		return convjud;
	}


	public void setConvjud(String convjud) {
		this.convjud = convjud;
	}


	public String getConvextra() {
		return convextra;
	}


	public void setConvextra(String convextra) {
		this.convextra = convextra;
	}


	public String getIdcuentacredito() {
		return idcuentacredito;
	}


	public void setIdcuentacredito(String idcuentacredito) {
		this.idcuentacredito = idcuentacredito;
	}


	public app_detalle_cuenta_credito getDetalle_cuenta_credito() {
		return detalle_cuenta_credito;
	}


	public void setDetalle_cuenta_credito(app_detalle_cuenta_credito detalle_cuenta_credito) {
		this.detalle_cuenta_credito = detalle_cuenta_credito;
	}


	public app_maesocios getIdmaesocios() {
		return idmaesocios;
	}


	public void setIdmaesocios(app_maesocios idmaesocios) {
		this.idmaesocios = idmaesocios;
	}


	public String getIdpersona() {
		return idpersona;
	}


	public void setIdpersona(String idpersona) {
		this.idpersona = idpersona;
	}


	public String getIdagenciacta() {
		return idagenciacta;
	}


	public void setIdagenciacta(String idagenciacta) {
		this.idagenciacta = idagenciacta;
	}


	public String getTipomonedacta() {
		return tipomonedacta;
	}


	public void setTipomonedacta(String tipomonedacta) {
		this.tipomonedacta = tipomonedacta;
	}


	public String getIdtipocuenta() {
		return idtipocuenta;
	}


	public void setIdtipocuenta(String idtipocuenta) {
		this.idtipocuenta = idtipocuenta;
	}


	public String getNum_cuenta() {
		return num_cuenta;
	}


	public void setNum_cuenta(String num_cuenta) {
		this.num_cuenta = num_cuenta;
	}


	public String getIddocpagare() {
		return iddocpagare;
	}


	public void setIddocpagare(String iddocpagare) {
		this.iddocpagare = iddocpagare;
	}


	public String getNrodocpagare() {
		return nrodocpagare;
	}


	public void setNrodocpagare(String nrodocpagare) {
		this.nrodocpagare = nrodocpagare;
	}


	public String getTipomoneda() {
		return tipomoneda;
	}


	public void setTipomoneda(String tipomoneda) {
		this.tipomoneda = tipomoneda;
	}


	public String getIdagenciapagare() {
		return idagenciapagare;
	}


	public void setIdagenciapagare(String idagenciapagare) {
		this.idagenciapagare = idagenciapagare;
	}


	public String getDenominacion() {
		return denominacion;
	}


	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}


	public String getIdanalista() {
		return idanalista;
	}


	public void setIdanalista(String idanalista) {
		this.idanalista = idanalista;
	}


	public Integer getPlazo_apro() {
		return plazo_apro;
	}


	public void setPlazo_apro(Integer plazo_apro) {
		this.plazo_apro = plazo_apro;
	}


	public Double getMonto_aprobado() {
		return monto_aprobado;
	}


	public void setMonto_aprobado(Double monto_aprobado) {
		this.monto_aprobado = monto_aprobado;
	}


	public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public Integer getCpendientes() {
		return cpendientes;
	}


	public void setCpendientes(Integer cpendientes) {
		this.cpendientes = cpendientes;
	}


	public String getTasainteres() {
		return tasainteres;
	}


	public void setTasainteres(String tasainteres) {
		this.tasainteres = tasainteres;
	}


	public String getIdevalsbs() {
		return idevalsbs;
	}


	public void setIdevalsbs(String idevalsbs) {
		this.idevalsbs = idevalsbs;
	}


	public String getCalificacionsbs() {
		return calificacionsbs;
	}


	public void setCalificacionsbs(String calificacionsbs) {
		this.calificacionsbs = calificacionsbs;
	}


	public app_estadodocumento getIdestadodoc() {
		return idestadodoc;
	}


	public void setIdestadodoc(app_estadodocumento idestadodoc) {
		this.idestadodoc = idestadodoc;
	}


	public LocalDateTime getFecdesembolso() {
		return fecdesembolso;
	}


	public void setFecdesembolso(LocalDateTime fecdesembolso) {
		this.fecdesembolso = fecdesembolso;
	}
	
	
	

   
	
	
	

}
