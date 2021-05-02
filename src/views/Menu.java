package views;
import java.util.Scanner;
public class Menu {
	@SuppressWarnings("unused")
	static int renderizar(){
		int op;
		Scanner teclado = new Scanner(System.in);
		System.out.println("\n\n _____________________________");
		System.out.println(" Bem Vindo a comunidade Gamer!\n");
		System.out.println("\n Digite a opção desejada no menu a baixo:\n");
		System.out.println("\n Opção 1 - Cadastrar Usuário");
		System.out.println("\n Opção 2 - Listar usuários");
		System.out.println("\n Opção 3 - Publicar no fórum");
		System.out.println("\n Opção 4 - Listar publicações do fórum");
		System.out.println("\n Opção 5 - Publicar notícias");
		System.out.println("\n Opção 6 - Listar notícias");
		System.out.println("\n Opção 0 - Sair\n");
		System.out.println("\n Digite a opção escolhida:");
		op = teclado.nextInt();
		return op;
	}
}
