package com.leonxiiicobranza.cobranza.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "app_usuarios", schema = "cobranza")
public class app_usuarios {
	
	@Id
	@Column(name = "idpersona",length = 7)
	private String idpersona;
	
	
	@Column(name = "idcargo",length = 2)
	private String idcargo;
	
	//abreviatura
	@Column(name = "iduser",length = 6)
	private String iduser;
	
	@Column(name = "persona",length = 120)
	private String persona;
	
	//codigo de personal unico
	
	
	@Column(name = "estado",length = 30)
	private String estado;
	
	@Column(name = "cargo",length = 30)
	private String cargo;
	
	@Column(name = "correo",length = 50)
	private String correo;
	
	@Column(name = "login",length = 8)
	private String login;
	
	@Column(name = "password",length = 130)
	private String password;
	
	@Column(name = "habilitado",length = 1)
	private String habilitado;

	public String getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(String idpersona) {
		this.idpersona = idpersona;
	}

	public String getIdcargo() {
		return idcargo;
	}

	public void setIdcargo(String idcargo) {
		this.idcargo = idcargo;
	}

	public String getIduser() {
		return iduser;
	}

	public void setIduser(String iduser) {
		this.iduser = iduser;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}
	
	

	
	
	

    
	

}
