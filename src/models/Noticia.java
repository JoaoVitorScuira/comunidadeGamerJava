package models;
import models.User;
import java.util.Date;

public class Noticia {
	
	public Noticia() {
		setCriadoEm(new Date());
	}
	private User user;
	private String categoria;
	private String titulo;
	private String conteudo;
	private Date criadoEm;
	
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	
	
	public String toString() {
		return "Categoria da noticia: " +getCategoria() + " \n Titulo: " + getTitulo() 
		+ "\n Notícia: " + getConteudo() + "\n Criado em: " + criadoEm + "\n Por: " + getUser();
	}
}
