package views;
import java.util.Scanner;

import controllers.PublicacaoController;

public class ListarPublicacaoCategoria {
		//private static String categoria;
		private static Scanner teclado = new Scanner (System.in);
		public static void renderizar() {
			teclado = new Scanner (System.in);
			String categoria;
			System.out.println("\n\nListagem por categoria!\n\n");
			System.out.println("Informe a categoria desejada: \n\n");
			categoria = teclado.nextLine();
			PublicacaoController.listarPorCategoria(categoria);
		}
}
