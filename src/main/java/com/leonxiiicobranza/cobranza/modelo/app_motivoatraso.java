package com.leonxiiicobranza.cobranza.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "app_motivoatraso", schema = "cobranza")
public class app_motivoatraso {
	
	@Id	
	@Column(name = "idmotivoatraso",length = 2)
	@NotNull
	private String idmotivoatraso;
	
	
	@Column(name = "motivoatraso",length = 70)
	@NotNull
	private String motivoatraso;
	
	@Column(name = "abreviatura",length = 10)
	@NotNull
	private String abreviatura;
	

	public String getIdmotivoatraso() {
		return idmotivoatraso;
	}

	public void setIdmotivoatraso(String idmotivoatraso) {
		this.idmotivoatraso = idmotivoatraso;
	}

	public String getMotivoatraso() {
		return motivoatraso;
	}

	public void setMotivoatraso(String motivoatraso) {
		this.motivoatraso = motivoatraso;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	
	



}
