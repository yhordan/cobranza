package com.leonxiiicobranza.cobranza.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "cartera_atrasada")
public class cartera_atrasada {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cartera;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "dni_socio")
	private String dni_socio;
	
	@Column(name = "nombre_socio")
	private String nombre_socio;
	
	@Column(name = "direccion_socio")
	private String direccion_socio;
	
	@Column(name = "num_pagare")
	private String num_pagare;
	
	@Column(name = "total_cuotas")
	private Integer total_cuotas;
	
	@Column(name = "sdo_cap_total")
	private Double sdo_cap_total;
	
	@Column(name = "primera_cta_vencida")
	private Integer primera_cta_vencida;
	
	@Column(name = "dias_atraso")
	private Integer dias_atraso;
	
	@Column(name = "sdo_primera_cta_vencida")
	private Double  sdo_primera_cta_vencida;
	
	@Column(name = "codigo_producto")
	private String codigo_producto;
	
	@Column(name = "ultima_gestion")
	private LocalDateTime ultima_gestion; 
	
	@Column(name = "dni_aval")
	private String dni_aval;
	
	@Column(name = "nombre_aval")
	private String nombre_aval;
	
	@Column(name = "direccion_aval")
	private String direccion_aval;
	
	@Column(name = "ide_socio")
	private String ide_socio;
	
	@Column(name = "oficina")
	private String oficina;
	
	
	@Column(name = "geolocalizacion_latitud")
	private String geolocalizacion_latitud;
	
	@Column(name = "geolocalizacion_longitu")
	private String geolocalizacion_longitud;
	
	@Column(name = "abreviatura")
	private String abreviatura;

	@Column(name = "celular_actual1")
	private String celular_actual1;
	
	@Column(name = "celular_actual2")
	private String celular_actual2;
	
	@Column(name = "referencia_domiciliaria")
	private String referencia_domiciliaria;
	
	@Column(name = "direccion_alternativa1")
	private String direccion_alternativa1;
	   
	@Column(name = "direccion_alternativa2")
	private String direccion_alternativa2;
	
	@Column(name = "calificacion_deudor")
	private String calificacion_deudor; 
	
	@Column(name = "analista")
	private String analista; 
	
	
	
	public String getAnalista() {
		return analista;
	}

	public void setAnalista(String analista) {
		this.analista = analista;
	}

	public String getCelular_actual1() {
		return celular_actual1;
	}

	public void setCelular_actual1(String celular_actual1) {
		this.celular_actual1 = celular_actual1;
	}

	public String getCelular_actual2() {
		return celular_actual2;
	}

	public void setCelular_actual2(String celular_actual2) {
		this.celular_actual2 = celular_actual2;
	}

	public String getReferencia_domiciliaria() {
		return referencia_domiciliaria;
	}

	public void setReferencia_domiciliaria(String referencia_domiciliaria) {
		this.referencia_domiciliaria = referencia_domiciliaria;
	}

	public String getDireccion_alternativa1() {
		return direccion_alternativa1;
	}

	public void setDireccion_alternativa1(String direccion_alternativa1) {
		this.direccion_alternativa1 = direccion_alternativa1;
	}

	public String getDireccion_alternativa2() {
		return direccion_alternativa2;
	}

	public void setDireccion_alternativa2(String direccion_alternativa2) {
		this.direccion_alternativa2 = direccion_alternativa2;
	}

	public String getCalificacion_deudor() {
		return calificacion_deudor;
	}

	public void setCalificacion_deudor(String calificacion_deudor) {
		this.calificacion_deudor = calificacion_deudor;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
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

	public String getIde_socio() {
		return ide_socio;
	}

	public void setIde_socio(String ide_socio) {
		this.ide_socio = ide_socio;
	}

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

	public int getId_cartera() {
		return id_cartera;
	}

	public void setId_cartera(int id_cartera) {
		this.id_cartera = id_cartera;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDni_socio() {
		return dni_socio;
	}

	public void setDni_socio(String dni_socio) {
		this.dni_socio = dni_socio;
	}



	public String getNombre_socio() {
		return nombre_socio;
	}

	public void setNombre_socio(String nombre_socio) {
		this.nombre_socio = nombre_socio;
	}

	public String getDireccion_socio() {
		return direccion_socio;
	}

	public void setDireccion_socio(String direccion_socio) {
		this.direccion_socio = direccion_socio;
	}

	public String getNum_pagare() {
		return num_pagare;
	}

	public void setNum_pagare(String num_pagare) {
		this.num_pagare = num_pagare;
	}

	public Integer getTotal_cuotas() {
		return total_cuotas;
	}

	public void setTotal_cuotas(Integer total_cuotas) {
		this.total_cuotas = total_cuotas;
	}

	public Double getSdo_cap_total() {
		return sdo_cap_total;
	}

	public void setSdo_cap_total(Double sdo_cap_total) {
		this.sdo_cap_total = sdo_cap_total;
	}

	public Integer getPrimera_cta_vencida() {
		return primera_cta_vencida;
	}

	public void setPrimera_cta_vencida(Integer primera_cta_vencida) {
		this.primera_cta_vencida = primera_cta_vencida;
	}

	public Integer getDias_atraso() {
		return dias_atraso;
	}

	public void setDias_atraso(Integer dias_atraso) {
		this.dias_atraso = dias_atraso;
	}

	public Double getSdo_primera_cta_vencida() {
		return sdo_primera_cta_vencida;
	}

	public void setSdo_primera_cta_vencida(Double sdo_primera_cta_vencida) {
		this.sdo_primera_cta_vencida = sdo_primera_cta_vencida;
	}

	public String getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(String codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public LocalDateTime getUltima_gestion() {
		return ultima_gestion;
	}

	public void setUltima_gestion(LocalDateTime ultima_gestion) {
		this.ultima_gestion = ultima_gestion;
	}

	public String getDni_aval() {
		return dni_aval;
	}

	public void setDni_aval(String dni_aval) {
		this.dni_aval = dni_aval;
	}

	public String getNombre_aval() {
		return nombre_aval;
	}

	public void setNombre_aval(String nombre_aval) {
		this.nombre_aval = nombre_aval;
	}

	public String getDireccion_aval() {
		return direccion_aval;
	}

	public void setDireccion_aval(String direccion_aval) {
		this.direccion_aval = direccion_aval;
	}
	
	    	
		

}
