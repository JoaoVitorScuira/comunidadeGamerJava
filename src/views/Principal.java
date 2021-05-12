package views;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int op;
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
					CadastrarNoticia.renderizar();
					break;
				case 6:
					ListarNoticias.renderizar();
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
