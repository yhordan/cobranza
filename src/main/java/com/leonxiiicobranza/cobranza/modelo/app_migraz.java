package com.leonxiiicobranza.cobranza.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;





@Entity
@Table(name = "app_migra2", schema = "cobranza")
public class app_migraz {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idapp_migra;
	
	@Column(name = "parametro",length =100)
	@NotNull
	private String parametro;
	
	@Column(name = "valor",length =50)
	@NotNull
	private String valor;
	
	@Column(name = "fecha")
	@NotNull
	private LocalDateTime fecha;

	public int getIdapp_migra() {
		return idapp_migra;
	}

	public void setIdapp_migra(int idapp_migra) {
		this.idapp_migra = idapp_migra;
	}

	public String getParametro() {
		return parametro;
	}

	public void setParametro(String parametro) {
		this.parametro = parametro;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	
	
	


}
