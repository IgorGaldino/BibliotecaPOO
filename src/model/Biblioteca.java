package model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	List<Livro> livros = new ArrayList<>();
	List<Emprestimo> emprestimos = new ArrayList<>();;

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}
	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimos.add(emprestimo);
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivro(Livro livro) {
		this.livros.add(livro);
	}

	public void removeEmprestimo(Emprestimo emprestimo) {
		this.emprestimos.remove(emprestimo);
	}
}
