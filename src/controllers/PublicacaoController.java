package controllers;
import java.util.ArrayList;
import models.Publicacao;

public class PublicacaoController {

		private static ArrayList<Publicacao> publicacoes = new ArrayList<Publicacao>();
	
		public static ArrayList<Publicacao> listar(){
			return publicacoes;
		}
		
		@SuppressWarnings("unlikely-arg-type")
		public static boolean listarPorCategoria(String categoria){
			if (publicacoes.contains(categoria)) {
				for (Publicacao publicacao : publicacoes) {
					if(categoria == publicacao.getCategoria() ) {
						System.out.println(publicacao);
					}
				}
			return true;				
			}
			else {
				System.out.println("\n\nNão há nenhuma publicação com essa categoria!\n\n");
				return false;
			}
		}
		
		public static boolean cadastrar (Publicacao publicacao) {
			if ((UserController.listar()).contains(publicacao.getUser())) {
				publicacoes.add(publicacao);
				return true;
			}else {
			return false;
			}
		}
		
}
