package com.leonxiiicobranza.cobranza.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "personal")
public class personal {
	
	
	@Id
	@Column(name = "codigo")
	private String codigo;	
	
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "usuario")	
	private String usuario;
	
	@Column(name = "correo")	
	private String correo;
	
	@Column(name = "abreviatura")	
	private String abreviatura;
	
	@Column(name = "tipo")	
	private String tipo;	
	
	/*
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	*/
	

}
