package view;

import controller.ConversaoBinRecController;

public class Principal {

	public static void main(String[] args) {
		
		ConversaoBinRecController cb = new ConversaoBinRecController();
		
		int num = 45;
		//int num = 10;
		//int num = 0;
		//int num = 1999;
		//int num = 2000;
		//int num = 2001;
		String conversaopBinario = cb.conversaopBinario(num);
		
	        System.out.println(conversaopBinario);
			
	}


}
