package com.leonxiiicobranza.cobranza.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "app_estadodocumento", schema = "cobranza")
public class app_estadodocumento {
	
	@Id	
	@Column(name = "idestadodoc",length = 2)
	@NotNull
	private String idestadodoc;		
	

	@Column(name = "estado",length = 25)
	private String estado;
	
	@Column(name = "abreviatura",length = 5)
	private String abreviatura;

	public String getIdestadodoc() {
		return idestadodoc;
	}

	public void setIdestadodoc(String idestadodoc) {
		this.idestadodoc = idestadodoc;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	



}
