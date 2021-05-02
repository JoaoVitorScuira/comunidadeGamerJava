package models;

public class Game {
	
	private String nome;
	private String genero;
	private String ano;
	private String desenvolvedora;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getDesenvolvedora() {
		return desenvolvedora;
	}
	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}
	
	
	public String toString() {
		return "Nome do Jogo: " + getNome() + " | Ano do Jogo: " + getAno() + " | Desenvolvedora: " + getDesenvolvedora();
	}
}
