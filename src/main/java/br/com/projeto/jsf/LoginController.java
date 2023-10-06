package br.com.projeto.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "LoginController")
public class LoginController {
	
	private String usuario;
	private String senha;
	
	public void ingressar() {
		System.out.println("Usuario: " + usuario);
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "LoginController [usuario=" + usuario + "]";
	}
	
	
	

}
