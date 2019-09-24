package model;

public class Livro {
	private int id;
	private String nome;
	private int numero;
	private String autor;
	private String genero;
	private boolean disponivel;
	
	public Livro(int id, String nome, int numero, String autor, String genero, boolean disponivel) {
		this.id = id;
		this.nome = nome;
		this.numero = numero;
		this.autor = autor;
		this.genero = genero;
		this.disponivel = disponivel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
}
