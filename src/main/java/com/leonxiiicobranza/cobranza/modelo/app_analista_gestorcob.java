package com.leonxiiicobranza.cobranza.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "app_analista_gestorcob", schema = "cobranza")
public class app_analista_gestorcob {
	
	
	
	@Id	
	@Column(name = "idanalistagc",length = 14)
	@NotNull
	private String idanalistagc;
	
	
	@Column(name = "idgestor",length = 7)
	@NotNull
	private String idgestor;
	
	@Column(name = "idanalista",length = 7)
	@NotNull
	private String idanalista;
	
	@Column(name = "activo",length = 1)
	@NotNull
	private String activo;
	

	public String getIdanalistagc() {
		return idanalistagc;
	}

	public void setIdanalistagc(String idanalistagc) {
		this.idanalistagc = idanalistagc;
	}

	public String getIdgestor() {
		return idgestor;
	}

	public void setIdgestor(String idgestor) {
		this.idgestor = idgestor;
	}

	public String getIdanalista() {
		return idanalista;
	}

	public void setIdanalista(String idanalista) {
		this.idanalista = idanalista;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}
	

	

}
