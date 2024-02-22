package com.leonxiiicobranza.cobranza.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "app_personal", schema = "cobranza")
public class personal_cobranza {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpersonal;
	
	//abreviatura
	@Column(name = "iduser")
	private String iduser;
	
	//codigo de personal unico
	@Column(name = "idpersona")
	private String idpersona;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "cargo")
	private String cargo;
	
	@Column(name = "correo")
	private String correo;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "habilitado")
	private boolean habilitado;
	
	
	public int getIdpersonal() {
		return idpersonal;
	}

	public void setIdpersonal(int idpersonal) {
		this.idpersonal = idpersonal;
	}

	public String getIduser() {
		return iduser;
	}

	public void setIduser(String iduser) {
		this.iduser = iduser;
	}

	public String getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(String idpersona) {
		this.idpersona = idpersona;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	
	
	
	
	
	
}
