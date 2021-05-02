package views;

import java.util.ArrayList;
import java.util.Scanner;
import models.User;
import models.Publicacao;
import models.Noticia;
import models.Game;
import models.Forum;
import views.Menu;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int op;
		User user; //criação do objeto user do tipo User;
		Publicacao publicacao;
		Noticia noticia;
		Game gamePreferido;
		Forum forum;
		ArrayList<User> users = new ArrayList<User>(); //criação da lista de users, para armazenar todos os users listados
		ArrayList<Publicacao> publicacoes = new ArrayList<Publicacao>();
		ArrayList<Noticia> noticias = new ArrayList<Noticia>();
		do {
			op = Menu.renderizar();
			switch (op) {
				
				case 1 :
					user = new User();
					System.out.println("\n --Cadastro de Usuários--\n");
					teclado = new Scanner (System.in);
					System.out.println("\n Digite o nick: ");
					user.setNickname(teclado.nextLine()	);
					System.out.println("\n Digite a idade:");
					user.setIdade(teclado.nextLine());
					gamePreferido = new Game();
					System.out.println("\n Digite o nome do game preferido do usuário: ");
					gamePreferido.setNome(teclado.nextLine());
					System.out.println("\n Digite o ano do game: ");
					gamePreferido.setAno(teclado.nextLine());
					System.out.println("\n Digite a desenvolvedora do game: ");
					gamePreferido.setDesenvolvedora(teclado.nextLine());
					user.setGame(gamePreferido);
					users.add(user);
					break;					
				case 2 :
					System.out.println("\n --Lista de Usuários Cadastrados-- \n");
					System.out.println(users);
					break;
				case 3 :
					publicacao = new Publicacao();
					System.out.println("\n--Publicação no fórum--\n");
					teclado = new Scanner (System.in);
					forum = new Forum();
					System.out.println("\n Digite a Categoria: ");
					forum.setCategoria(teclado.nextLine());
					publicacao.setForum(forum);
					System.out.println("\n Digite o titulo:");
					publicacao.setTitulo(teclado.nextLine());
					System.out.println("\n Digite o conteudo:");
					publicacao.setConteudo(teclado.nextLine());					
					publicacoes.add(publicacao);
					break;
				case 4 :
					System.out.println("\n --Lista de publicacoes-- \n");
					System.out.println(publicacoes);
					break;
				case 5 :
					noticia = new Noticia();
					System.out.println("\n --Publicacao de Noticias-- \n");
					teclado = new Scanner(System.in);
					System.out.println("\n Digite a Categoria: ");
					noticia.setCategoria(teclado.nextLine());
					System.out.println("\n Digite o titulo:");
					noticia.setTitulo(teclado.nextLine());
					System.out.println("\n Digite o conteudo:");
					noticia.setConteudo(teclado.nextLine());	
					noticias.add(noticia);
					break;
				case 6:
					System.out.println("\n --Listagem de Noticias-- \n");
					System.out.println(noticias);
					break;
				case 0 :
					System.out.println("\n\n\nFinalizando o programa!");
					break;
				default :
					System.out.println("Essa opção não existe: " + op +" - Digite a opção correta");
			}
		} while (op != 0);
		teclado.close();
	}
}
