package views;

import java.util.ArrayList;
import java.util.Scanner;
import models.Noticia;
import models.Forum;


public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int op;
		Noticia noticia;
		ArrayList<Noticia> noticias = new ArrayList<Noticia>();
		do {
			op = Menu.renderizar();
			switch (op) {
				
				case 1 :
					CadastrarUsuario.renderizar();
					break;
				case 2 :
					ListarUsuarios.renderizar();
					break;
				case 3 :
					CadastrarPublicacao.renderizar();
					break;
				case 4 :
					ListarPublicacao.renderizar();
					break;
				case 5 :
					ListarPublicacaoCategoria.renderizar();
					break;
				case 6:
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
					
					System.out.println("\n --Listagem de Noticias-- \n");
					System.out.println(noticias);
					break;
				case 0 :
					System.out.println("\n\n\nFinalizando o programa!");
					break;
				default :
					System.out.println("Essa op��o n�o existe: " + op +" - Digite a op��o correta");
			}
		} while (op != 0);
		teclado.close();
	}
}
