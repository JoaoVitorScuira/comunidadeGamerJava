package views;
import java.util.Scanner;
public class Menu {
	@SuppressWarnings("unused")
	static int renderizar(){
		int op;
		Scanner teclado = new Scanner(System.in);
		System.out.println("\n\n _____________________________");
		System.out.println(" Bem Vindo a comunidade Gamer!\n");
		System.out.println("\n Digite a op��o desejada no menu a baixo:\n");
		System.out.println("\n Op��o 1 - Cadastrar Usu�rio");
		System.out.println("\n Op��o 2 - Listar usu�rios");
		System.out.println("\n Op��o 3 - Publicar no f�rum");
		System.out.println("\n Op��o 4 - Listar publica��es do f�rum");
		System.out.println("\n Op��o 5 - Publicar not�cias");
		System.out.println("\n Op��o 6 - Listar not�cias");
		System.out.println("\n Op��o 0 - Sair\n");
		System.out.println("\n Digite a op��o escolhida:");
		op = teclado.nextInt();
		return op;
	}
}
