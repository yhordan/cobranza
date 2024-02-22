package com.leonxiiicobranza.cobranza.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "app_tablas", schema = "cobranza")
public class app_tablas {
	
	@Id
	@Column(name = "idtabla",length = 4)
	@NotNull
	private String idtabla;
	
	
	@Column(name = "descripcion",length = 80)
	@NotNull
	private String descripcion;
	
	@Column(name = "valor",length = 7)
	@NotNull
	private String valor;
	
	@Column(name = "valor2",length = 7)
	@NotNull
	private String valor2;
	
	@Column(name = "tipo",length = 1)
	@NotNull
	private String tipo;
	
	@Column(name = "estado",length = 1)	
	private String estado;
	
	@Column(name = "nombre",length = 15)
	private String nombre;
	

	public String getIdtabla() {
		return idtabla;
	}

	public void setIdtabla(String idtabla) {
		this.idtabla = idtabla;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getValor2() {
		return valor2;
	}

	public void setValor2(String valor2) {
		this.valor2 = valor2;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	



}
