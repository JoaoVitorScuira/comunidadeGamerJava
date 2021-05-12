package views;

import java.util.Scanner;
import controllers.PublicacaoController;
import models.Forum;
import models.Publicacao;
import models.User;

public class CadastrarPublicacao {

		private static Publicacao publicacao;
		private static User userPublicacao;
		private static Scanner teclado = new Scanner (System.in);
		
		public static void renderizar() {
			publicacao = new Publicacao();
		
			System.out.println("\n\n Publicação no fórum! \n\n");
			teclado = new Scanner (System.in);
			userPublicacao = new User();
			System.out.println("\n Digite o NickName do usuário: \n");
			userPublicacao.setNickname(teclado.nextLine());
			publicacao.setUser(userPublicacao);
			System.out.println("\n Digite a Categoria: ");
			publicacao.setCategoria(teclado.nextLine());
			System.out.println("\n Digite o titulo:");
			publicacao.setTitulo(teclado.nextLine());
			System.out.println("\n Digite o conteudo:");
			publicacao.setConteudo(teclado.nextLine());
			if (PublicacaoController.cadastrar(publicacao)) {
				System.out.println("\n\nPublicacao cadastrada com sucesso!\n\n");
			}
			else {
				System.out.println("\n\nUsuário não cadastrado na base de dados!\n\n");
			}
		}
}
