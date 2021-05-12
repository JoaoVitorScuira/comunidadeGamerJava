package models;
import java.util.Date;
public class Publicacao {
	
	public Publicacao() {
		setCriadoEm(new Date());
	}
	

	private User user;
	private Forum forum;
	private String titulo;
	private String conteudo;
	private String categoria;
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	private Date criadoEm;

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Forum getForum() {
		return forum;
	}
	public void setForum(Forum forum) {
		this.forum = forum;
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
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	public String toString() {
		return "Categoria da publicação: " +getCategoria() + " \n Titulo: " + getTitulo() 
		+ "\n Publicação: " + getConteudo() + "\n Criado em: " + criadoEm + "\n Por: " + getUser();
	}
	
}
