package com.leonxiiicobranza.cobranza.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;



@Entity
@Table(name = "app_resultadovisitas", schema = "cobranza")
public class app_resultadovisitas {
	

	@Id	
	@Column(name = "idresultadovisita",length = 2)
	@NotNull
	private String idresultadovisita;
	
	
	@Column(name = "resultadovisita",length = 70)
	@NotNull
	private String resultadovisita;
	
	@Column(name = "abreviatura",length = 10)
	@NotNull
	private String abreviatura;
	

	public String getIdresultadovisita() {
		return idresultadovisita;
	}

	public void setIdresultadovisita(String idresultadovisita) {
		this.idresultadovisita = idresultadovisita;
	}

	public String getResultadovisita() {
		return resultadovisita;
	}

	public void setResultadovisita(String resultadovisita) {
		this.resultadovisita = resultadovisita;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	
     
	
	
	
	
}
