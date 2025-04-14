package br.edu.ifsp.arq;

public class Livro {
	private int id; // Identificador ´unico do livro
	private String titulo;
	private String autor;
	private String[] genero;
	private int anoPublicacao;
	
	
	public Livro(int id, String titulo, String autor, String[] generos, String anoPublicacao) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = generos;
		this.anoPublicacao = Integer.parseInt(anoPublicacao);
	}


	public int getId() {
		return id;
	}


	public String getTitulo() {
		return titulo;
	}


	public String getAutor() {
		return autor;
	}


	public String getGenero() {
		String var = " ";
		for(String generos : genero) {
			if(generos != null) {
				var+=" ";
				var+= generos;
			}
		}
		return var;
	}


	public int getAnoPublicacao() {
		return anoPublicacao;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public void setGenero(String[] genero) {
		this.genero = genero;
	}


	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}


	
}


	
	
	

	

