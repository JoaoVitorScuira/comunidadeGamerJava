package models;
import java.util.Date;

public class User {
	
	public User() {
		setCriadoEm(new Date());
	}
	
	private String nickname;
	private String idade;
	private Date criadoEm;
	private Game game;
	
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	public boolean equals(Object obj) {
		User outroUser = (User) obj;
		return getNickname().equals(outroUser.getNickname());
	}
	
	
	public String toString() {
		return "Nick: " + getNickname() + " | Idade: " + getIdade() + " | " + getGame()
		+ "| Criado em: " +getCriadoEm()+"\n";
	}
	
}
