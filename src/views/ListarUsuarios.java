package views;
import controllers.UserController;
import models.User;
public class ListarUsuarios {
	
	public static void renderizar() {
		System.out.println("\n\n Listagem de Usu�rios: \n\n");
		for(User userCadastrado: UserController.listar()) {
			System.out.println(userCadastrado);
		}
	}
}
