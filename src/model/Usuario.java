package model;

public class Usuario {
	private String nome;
	private String matricula;
	private String senha;
	private boolean assinante;

	public Usuario(String nome, String matricula, String senha, boolean assinante) {
		this.nome = nome;
		this.matricula = matricula;
		this.senha = senha;
		this.assinante =  assinante;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAssinante() {
		return assinante;
	}
	public void setAssinante(boolean assinante) {
		this.assinante = assinante;
	}
	
	
}
