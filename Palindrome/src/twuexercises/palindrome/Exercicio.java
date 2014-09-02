package twuexercises.palindrome;

public class Exercicio {

	public static void main(String[] args) {
	
		//a soma dos números inteiros entre 1 e 1000 que são múltiplos de 3 e 5 e que são palíndromes.
		System.out.println("Exercício 1: " + 
		(soma(1,1000,true,3) + soma(1,1000,true,5)));
		
		//a quantidade de números inteiros entre 1 e 1000 que são múltiplos de 3 e 5 e que não são palíndromes.
		System.out.println("Exercício 2: " + (soma(1,1000,false,3) + soma(1,1000,false,5)));
		
		//quais números inteiros entre 1 e 1000 são múltiplos de 3 e 5 e são palíndromes.
		String exibicao = exibicao(1,1000,true,5);
		System.out.println("Exercício 3: " + exibicao(1,1000,true,3) + (exibicao.isEmpty()?"":"," ) + exibicao);

	}

	public static int soma(int inicioIntervalo,int fimIntervalo,boolean palindrome,int ehMultiploDe){
		
		int resultado = 0;
		
		for(int i = inicioIntervalo; i < fimIntervalo+1 ; i++){
			
			if(Palindrome.ehMultiploDe(i, ehMultiploDe)){
				
				String numeroStr = Integer.toString(i);
				
				if(Palindrome.ehPalindrome(numeroStr) == palindrome)
					resultado += i;
				
			}
			
		}
		
		return resultado;
		
	}
	
	public static String exibicao(int inicioIntervalo,int fimIntervalo,boolean palindrome,int ehMultiploDe){
		
		String aSerExibido = "";
		
		for(int i = inicioIntervalo; i < fimIntervalo+1 ; i++){
			
			if(Palindrome.ehMultiploDe(i, ehMultiploDe)){
				
				aSerExibido = Palindrome.ehPalindrome(Integer.toString(i)) == palindrome && !aSerExibido.isEmpty()?
						aSerExibido + "," + i:
							"" + i;
				
			}
			
		}
		
		return aSerExibido;
		
	}
	
}
