package com.leonxiiicobranza.cobranza.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "app_pagare_gestorjud", schema = "cobranza")
public class app_pagare_gestorjud {
	
	
	@Id	
	@Column(name = "idpgestorjud",length = 21)
	@NotNull
	private String idpgestorjud;
	
	
	@Column(name = "idgestor",length = 7)
	@NotNull
	private String idgestor;
	
	@Column(name = "idsocio",length = 7)
	@NotNull
	private String idsocio;
	
	@Column(name = "iddocp",length = 4)
	@NotNull
	private String idsdocp;
	
	@Column(name = "nrodocp",length = 7)
	@NotNull
	private String nrodocp;
	
	@Column(name = "tipomonedap",length = 1)
	@NotNull
	private String  tipomonedap;
	
	@Column(name = "idagenciap",length = 2)
	@NotNull
	private String  idagenciap;
	
	@Column(name = "extrajudicial",length = 1)
	@NotNull
	private String  extrajudicial;

	public String getIdpgestorjud() {
		return idpgestorjud;
	}

	public void setIdpgestorjud(String idpgestorjud) {
		this.idpgestorjud = idpgestorjud;
	}

	public String getIdgestor() {
		return idgestor;
	}

	public void setIdgestor(String idgestor) {
		this.idgestor = idgestor;
	}

	public String getIdsocio() {
		return idsocio;
	}

	public void setIdsocio(String idsocio) {
		this.idsocio = idsocio;
	}

	public String getIdsdocp() {
		return idsdocp;
	}

	public void setIdsdocp(String idsdocp) {
		this.idsdocp = idsdocp;
	}

	public String getNrodocp() {
		return nrodocp;
	}

	public void setNrodocp(String nrodocp) {
		this.nrodocp = nrodocp;
	}

	public String getTipomonedap() {
		return tipomonedap;
	}

	public void setTipomonedap(String tipomonedap) {
		this.tipomonedap = tipomonedap;
	}

	public String getIdagenciap() {
		return idagenciap;
	}

	public void setIdagenciap(String idagenciap) {
		this.idagenciap = idagenciap;
	}

	public String getExtrajudicial() {
		return extrajudicial;
	}

	public void setExtrajudicial(String extrajudicial) {
		this.extrajudicial = extrajudicial;
	}

	
	
	
	
	
	
	
}
