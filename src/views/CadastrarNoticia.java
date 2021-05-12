package views;

import java.util.Scanner;
import controllers.NoticiaController;
import models.Noticia;
import models.User;

public class CadastrarNoticia {

		private static Noticia noticia;
		private static User userNoticia;
		private static Scanner teclado = new Scanner (System.in);
		
		public static void renderizar() {
			noticia = new Noticia();
		
			System.out.println("\n\n Publicação de notícia no fórum! \n\n");
			teclado = new Scanner (System.in);
			userNoticia = new User();
			System.out.println("\n Digite o NickName do usuário: \n");
			userNoticia.setNickname(teclado.nextLine());
			noticia.setUser(userNoticia);
			System.out.println("\n Digite a Categoria: ");
			noticia.setCategoria(teclado.nextLine());
			System.out.println("\n Digite o titulo:");
			noticia.setTitulo(teclado.nextLine());
			System.out.println("\n Digite o conteudo:");
			noticia.setConteudo(teclado.nextLine());
			if (NoticiaController.cadastrar(noticia)) {
				System.out.println("\n\n Notícia cadastrada com sucesso!\n\n");
			}
			else {
				System.out.println("\n\nUsuário não cadastrado na base de dados!\n\n");
			}
		}
}
