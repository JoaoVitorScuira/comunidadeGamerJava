package views;

import java.util.Scanner;

import controllers.UserController;
import models.Game;
import models.User;

public class CadastrarUsuario {
	private static User user;
	private static Game gamePreferido;
	private static Scanner teclado = new Scanner (System.in);
	
	public static void renderizar() {
	user = new User();
	System.out.println("\n --Cadastro de Usu�rios--\n");
	teclado = new Scanner (System.in);
	System.out.println("\n Digite o nick: ");
	user.setNickname(teclado.nextLine()	);
	System.out.println("\n Digite a idade:");
	user.setIdade(teclado.nextLine());
	gamePreferido = new Game();
	System.out.println("\n Digite o nome do game preferido do usu�rio: ");
	gamePreferido.setNome(teclado.nextLine());
	System.out.println("\n Digite o ano do game: ");
	gamePreferido.setAno(teclado.nextLine());
	System.out.println("\n Digite a desenvolvedora do game: ");
	gamePreferido.setDesenvolvedora(teclado.nextLine());
	user.setGame(gamePreferido);
	
	if(UserController.cadastrar(user)) {
		System.out.println("\n Cliente cadastrado com sucesso!\n");
	}
	else {
		System.out.println("\nEsse cliente j� existe!\n");
	}
	
	//users.add(user);	
	}
}
