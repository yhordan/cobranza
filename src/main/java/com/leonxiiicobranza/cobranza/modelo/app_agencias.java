package com.leonxiiicobranza.cobranza.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "app_agencias", schema = "cobranza")
public class app_agencias {
	
	
	@Id	
	@Column(name = "idagencia",length = 2)
	@NotNull
	private String idagencia;
	
	@Column(name = "agencia",length = 50)
	@NotNull
	private String agencia;
	
	@Column(name = "abrev",length = 4)
	@NotNull
	private String abrev;
	
	@Column(name = "direccion",length = 60)
	@NotNull
	private String direccion;

	public String getIdagencia() {
		return idagencia;
	}

	public void setIdagencia(String idagencia) {
		this.idagencia = idagencia;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getAbrev() {
		return abrev;
	}

	public void setAbrev(String abrev) {
		this.abrev = abrev;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	

	

}
