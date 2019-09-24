package model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private List<Livro> livros = new ArrayList<>();
	private List<Artigo> artigos = new ArrayList<>();;
	private List<Emprestimo> emprestimos = new ArrayList<>();;

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}
	public void setEmprestimo(Emprestimo emprestimo) {
		System.out.println("Emprestimo: " + emprestimos);
		this.emprestimos.add(emprestimo);
	}
	
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivro(Livro livro) {
		this.livros.add(livro);
	}
	public List<Artigo> getArtigos() {
		return artigos;
	}
	public void setArtigos(List<Artigo> artigos) {
		this.artigos = artigos;
	}
}
