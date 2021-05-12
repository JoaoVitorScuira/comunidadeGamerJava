package views;

import controllers.PublicacaoController;
import models.Publicacao;
public class ListarPublicacao {

	public static void renderizar() {
		System.out.println("\n\n Listagem de publicações: \n\n");
		
		for (Publicacao publicacao: PublicacaoController.listar() ){
			System.out.println(publicacao);
		}
	}
}
