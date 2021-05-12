package views;

import controllers.NoticiaController;
import models.Noticia;
public class ListarNoticias {

	public static void renderizar() {
		System.out.println("\n\n Listagem de notícias: \n\n");
		
		for (Noticia noticia: NoticiaController.listar() ){
			System.out.println(noticia);
		}
	}
}
