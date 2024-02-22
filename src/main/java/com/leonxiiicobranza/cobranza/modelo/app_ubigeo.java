package com.leonxiiicobranza.cobranza.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "app_ubigeo", schema = "cobranza")
public class app_ubigeo {
	
	
	@Id
	@Column(name = "idubigeo",length = 8)
	@NotNull
	private String idubigeo;
	
	
	@Column(name = "descripcion",length = 50)
	@NotNull
	private String descripcion;
	
	@Column(name = "nivel",length = 1)
	@NotNull
	private String  nivel;
	
	@Column(name = "ubigeo",length = 150)
	@NotNull
	private String  ubigeo;
	
	@Column(name = "nacionalidad",length = 50)
	private String  nacionalidad;

	public String getIdubigeo() {
		return idubigeo;
	}

	public void setIdubigeo(String idubigeo) {
		this.idubigeo = idubigeo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getUbigeo() {
		return ubigeo;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

     

}
