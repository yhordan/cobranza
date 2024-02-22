package com.leonxiiicobranza.cobranza.modelo;

public class dto_convenio {
	
	private String tipo_moneda;
	private String Nro_documento;
	private app_agencias id_agencia;
	private String id_codigo_pagare;
	
	
	public String getTipo_moneda() {
		return tipo_moneda;
	}
	public void setTipo_moneda(String tipo_moneda) {
		this.tipo_moneda = tipo_moneda;
	}
	public String getNro_documento() {
		return Nro_documento;
	}
	public void setNro_documento(String nro_documento) {
		Nro_documento = nro_documento;
	}
	public app_agencias getId_agencia() {
		return id_agencia;
	}
	public void setId_agencia(app_agencias id_agencia) {
		this.id_agencia = id_agencia;
	}
	public String getId_codigo_pagare() {
		return id_codigo_pagare;
	}
	public void setId_codigo_pagare(String id_codigo_pagare) {
		this.id_codigo_pagare = id_codigo_pagare;
	}
	

	
	
	
}
