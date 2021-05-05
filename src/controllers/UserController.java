package controllers;
import java.util.ArrayList;

import models.User;

public class UserController {
	
	private static ArrayList<User> users = new ArrayList<User>(); //criação da lista de users, para armazenar todos os users listados
	
	public static ArrayList<User> listar(){
		return users;
	}
	
	public static boolean cadastrar(User user) {
		if(buscarPorNick(user.getNickname())== null) {
			users.add(user);
			return true;
		}
		return false;
	}
	
	public static User buscarPorNick(String nickname) {
		for (User userCadastrado:users) {
			if (userCadastrado.getNickname().equals(nickname)) {
				return userCadastrado;
			}
		}
		return null;
	}
	

	
}
