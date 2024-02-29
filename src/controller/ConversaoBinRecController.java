/*
 *4. 
 *Criar uma aplica��o em Java que tenha uma fun��o recursiva que, 
 *recebendo um n�mero inteiro, converta para bin�rio.
 *Entrada limitada a 2000.
 *O C�digo deve apresentar, em formato de coment�rio,
 *como foi definida a condi��o de parada;
 *O C�digo deve apresentar, em formato de coment�rio,
 *como foi definida a rela��o de chamada dos passos.
 *
 * *Considere usar a sa�da da fun��o recursiva como String.
 * 
 * **Para converter uma vari�vel inteira para String, fazer:
 * int n = 10;
 * String s = String.valueOf(n).
 * 
 */

package controller;

public class ConversaoBinRecController {

	public ConversaoBinRecController() {
		
		super();
		
	}
	
	    // M�todo recursivo para converter um n�mero inteiro para bin�rio
	    public static String conversaopBinario(int num) {
	    	
	    	//Condi��o de parada: se o n�mero for 0, retorna 0.
	    	if (num == 0) {
	    		return "0";
	    	}
	    	
	        // Condi��o de parada: quando o n�mero for menor que 2000
	        if (num >= 2000) {
	            return "ATEN��O: Erro! Valor limitado a 2000!";
	        }
	        // Rela��o de chamada dos passos:
	        /* O resto da divis�o do n�mero por 2 � concatenado 
	        ao resultado da chamada recursiva do m�todo passando 
	        como par�metro a divis�o inteira do n�mero por 2.
	        */
	        return conversaopBinario(num/2) + Integer.toString(num%2);
	    } 
	    
}
