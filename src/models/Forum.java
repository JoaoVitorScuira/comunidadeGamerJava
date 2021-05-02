package models;

public class Forum {
	private String categoria;

	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String toString() {
		return "Categoria da noticia: " + getCategoria();
	}
}
