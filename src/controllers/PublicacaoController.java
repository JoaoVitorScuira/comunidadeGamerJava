package controllers;
import java.util.ArrayList;
import models.Publicacao;

public class PublicacaoController {

		private static ArrayList<Publicacao> publicacoes = new ArrayList<Publicacao>();
	
		public static ArrayList<Publicacao> listar(){
			return publicacoes;
		}
		
		public static boolean cadastrar (Publicacao publicacao) {
			if ((UserController.listar()).contains(publicacao.getUser())) {
				publicacoes.add(publicacao);
				return true;
			}
			return false;
		}
		
}
