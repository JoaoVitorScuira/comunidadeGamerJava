package controllers;
import java.util.ArrayList;
import models.Noticia;

public class NoticiaController {

		private static ArrayList<Noticia> noticias = new ArrayList<Noticia>();
	
		public static ArrayList<Noticia> listar(){
			return noticias;
		}
		
		public static boolean cadastrar (Noticia noticia) {
			if ((UserController.listar()).contains(noticia.getUser())) {		
				noticias.add(noticia);
				return true;
			}
			return false;
		}
		
}
