package com.leonxiiicobranza.cobranza.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;





@Entity
@Table(name = "cuotas_vencidas")
public class cuotas_vencidas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cuota_vencidas;
	
	@Column(name = "dnisocio")
	private String dnisocio;
	
	public String getNumpagare() {
		return numpagare;
	}

	public void setNumpagare(String numpagare) {
		this.numpagare = numpagare;
	}

	@Column(name = "numpagare")
	private String numpagare;
	
	@Column(name = "num_cuota")
	private Integer num_cuota;
	
	@Column(name = "fecha_vencimiento")
	private LocalDateTime fecha_vencimiento;
	
	@Column(name = "dias_atraso")
	private Integer dias_atraso;
	
	@Column(name = "saldo_deudor")
	private Double saldo_deudor;
	
	@Column(name = "saldo_cuota")
	private Double saldo_cuota;
	
	@Column(name = "saldo_mora")
	private Double saldo_mora;
	
	/****** nuevo ****/
	@Column(name = "amortizacion")
	private Double amortizacion;
	
	@Column(name = "intereses")
	private Double intereses;
	 
	@Column(name = "interes_moratorio")
	private Double interes_moratorio;
	
	@Column(name = "interes_compensatorio_vencido")
	private Double interes_compensatorio_vencido;
	  
	@Column(name = "requerimiento_protesto")
	private Double requerimiento_protesto;	
	
	@Column(name = "protesto_pagare")
	private Double protesto_pagare;	
	
	@Column(name = "gasto_judiciales")
	private Double gasto_judiciales;
	
	@Column(name = "notificaciones")
	private Double notificaciones;
	
	@Column(name = "aviso_vencimiento")
	private Double aviso_vencimiento;	 
	  
	@Column(name = "desgravamen")
	private Double desgravamen;	  
	
	
	
	
	
	

	public Double getAmortizacion() {
		return amortizacion;
	}

	public void setAmortizacion(Double amortizacion) {
		this.amortizacion = amortizacion;
	}

	public Double getIntereses() {
		return intereses;
	}

	public void setIntereses(Double intereses) {
		this.intereses = intereses;
	}

	public Double getInteres_moratorio() {
		return interes_moratorio;
	}

	public void setInteres_moratorio(Double interes_moratorio) {
		this.interes_moratorio = interes_moratorio;
	}

	public Double getInteres_compensatorio_vencido() {
		return interes_compensatorio_vencido;
	}

	public void setInteres_compensatorio_vencido(Double interes_compensatorio_vencido) {
		this.interes_compensatorio_vencido = interes_compensatorio_vencido;
	}

	public Double getRequerimiento_protesto() {
		return requerimiento_protesto;
	}

	public void setRequerimiento_protesto(Double requerimiento_protesto) {
		this.requerimiento_protesto = requerimiento_protesto;
	}

	public Double getProtesto_pagare() {
		return protesto_pagare;
	}

	public void setProtesto_pagare(Double protesto_pagare) {
		this.protesto_pagare = protesto_pagare;
	}

	public Double getGasto_judiciales() {
		return gasto_judiciales;
	}

	public void setGasto_judiciales(Double gasto_judiciales) {
		this.gasto_judiciales = gasto_judiciales;
	}

	public Double getNotificaciones() {
		return notificaciones;
	}

	public void setNotificaciones(Double notificaciones) {
		this.notificaciones = notificaciones;
	}

	public Double getAviso_vencimiento() {
		return aviso_vencimiento;
	}

	public void setAviso_vencimiento(Double aviso_vencimiento) {
		this.aviso_vencimiento = aviso_vencimiento;
	}

	public Double getDesgravamen() {
		return desgravamen;
	}

	public void setDesgravamen(Double desgravamen) {
		this.desgravamen = desgravamen;
	}

	public int getId_cuota_vencidas() {
		return id_cuota_vencidas;
	}

	public void setId_cuota_vencidas(int id_cuota_vencidas) {
		this.id_cuota_vencidas = id_cuota_vencidas;
	}



	public String getDnisocio() {
		return dnisocio;
	}

	public void setDnisocio(String dnisocio) {
		this.dnisocio = dnisocio;
	}



	public Integer getNum_cuota() {
		return num_cuota;
	}

	public void setNum_cuota(Integer num_cuota) {
		this.num_cuota = num_cuota;
	}

	public LocalDateTime getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(LocalDateTime fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public Integer getDias_atraso() {
		return dias_atraso;
	}

	public void setDias_atraso(Integer dias_atraso) {
		this.dias_atraso = dias_atraso;
	}

	public Double getSaldo_deudor() {
		return saldo_deudor;
	}

	public void setSaldo_deudor(Double saldo_deudor) {
		this.saldo_deudor = saldo_deudor;
	}

	public Double getSaldo_cuota() {
		return saldo_cuota;
	}

	public void setSaldo_cuota(Double saldo_cuota) {
		this.saldo_cuota = saldo_cuota;
	}

	public Double getSaldo_mora() {
		return saldo_mora;
	}

	public void setSaldo_mora(Double saldo_mora) {
		this.saldo_mora = saldo_mora;
	}

	

		

}
