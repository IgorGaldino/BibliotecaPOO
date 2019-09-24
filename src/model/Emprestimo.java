package model;

import java.util.List;

public class Emprestimo {
	
	int prazo;		//prazo em semanas
	Usuario usuario;
	List<Livro> livros;
	List<Artigo> artigos;

	public Emprestimo (int prazo, Usuario usuario, List<Livro> livros, List<Artigo> artigos) {
		this.prazo = prazo;
		this.usuario = usuario;
		this.livros = livros;
		this.artigos = artigos;
	}
	
	public int getPrazo() {
		return prazo;
	}
	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	public List<Artigo> getArtigos() {
		return artigos;
	}
	public void setArtigos(List<Artigo> artigos) {
		this.artigos = artigos;
	}

}
