/*
 *4. 
 *Criar uma aplicação em Java que tenha uma função recursiva que, 
 *recebendo um número inteiro, converta para binário.
 *Entrada limitada a 2000.
 *O Código deve apresentar, em formato de comentário,
 *como foi definida a condição de parada;
 *O Código deve apresentar, em formato de comentário,
 *como foi definida a relação de chamada dos passos.
 *
 * *Considere usar a saída da função recursiva como String.
 * 
 * **Para converter uma variável inteira para String, fazer:
 * int n = 10;
 * String s = String.valueOf(n).
 * 
 */

package controller;

public class ConversaoBinRecController {

	public ConversaoBinRecController() {
		
		super();
		
	}
	
	    // Método recursivo para converter um número inteiro para binário
	    public static String conversaopBinario(int num) {
	    	
	    	//Condição de parada: se o número for 0, retorna 0.
	    	if (num == 0) {
	    		return "0";
	    	}
	    	
	        // Condição de parada: quando o número for menor que 2000
	        if (num >= 2000) {
	            return "ATENÇÃO: Erro! Valor limitado a 2000!";
	        }
	        // Relação de chamada dos passos:
	        /* O resto da divisão do número por 2 é concatenado 
	        ao resultado da chamada recursiva do método passando 
	        como parâmetro a divisão inteira do número por 2.
	        */
	        return conversaopBinario(num/2) + Integer.toString(num%2);
	    } 
	    
}
