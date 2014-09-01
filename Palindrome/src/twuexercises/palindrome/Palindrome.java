package twuexercises.palindrome;

public class Palindrome {

	public static boolean ehMultiploDe(int numero,int ehMultiploDe){
		
		if(numero%ehMultiploDe == 0)
			return true;
		else
			return false;
		
	}
	
	public static boolean ehPalindrome(String palavra){
		
		char frentePraTras[] = palavra.toCharArray();
		int tam = frentePraTras.length;
		char trasPraFrente[] = new char[tam];
		boolean naoHaDiferenca = true;
		
		for(int i =  tam-1, j = 0; i >= 0 && j < tam ; i--,j++){
			
			trasPraFrente[j] = frentePraTras[i];
			
		}
		
		for(int i = 0 ; i < tam ; i++){
			
			if(frentePraTras[i] != trasPraFrente[i]){
				
				naoHaDiferenca = false;
				break;
				
			}
				
		}
		
		return naoHaDiferenca;
		
	}
	
}
