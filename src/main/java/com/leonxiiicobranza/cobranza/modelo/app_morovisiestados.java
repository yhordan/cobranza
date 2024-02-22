package com.leonxiiicobranza.cobranza.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "app_morovisiestados", schema = "cobranza")
public class app_morovisiestados {
	
	
	@Id	
	@Column(name = "idmorovisiestados",length = 2)
	@NotNull
	private String idmorovisiestados;
	

	@Column(name = "morovisiestados",length = 70)
	@NotNull
	private String morovisiestados;
	
	@Column(name = "abreviatura",length = 10)
	@NotNull
	private String abreviatura;

	public String getIdmorovisiestados() {
		return idmorovisiestados;
	}

	public void setIdmorovisiestados(String idmorovisiestados) {
		this.idmorovisiestados = idmorovisiestados;
	}

	public String getMorovisiestados() {
		return morovisiestados;
	}

	public void setMorovisiestados(String morovisiestados) {
		this.morovisiestados = morovisiestados;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	
	
	

}
