package com.leonxiiicobranza.cobranza.jwt.model;


public class LoginReq {
	
	
    private String codigo;
    private String usuario;
    
    
	public LoginReq(String codigo, String usuario) {
	
		this.codigo = codigo;
		this.usuario = usuario;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

  
}
