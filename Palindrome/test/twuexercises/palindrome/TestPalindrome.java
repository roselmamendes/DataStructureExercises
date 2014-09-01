package twuexercises.palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPalindrome {

	@Test
	public void testPalindromeMultiploDe() {
		
		int numero = 56;
		int ehMultiploDe = 2;
		
		assertTrue((numero%ehMultiploDe == 0) == Palindrome.ehMultiploDe(numero,ehMultiploDe));
		
	}
	
	@Test
	public void testPalindromeNaoEhMultiploDe() {
		
		int numero = 59;
		int ehMultiploDe = 2;
		
		assertTrue((numero%ehMultiploDe == 0) == Palindrome.ehMultiploDe(numero,ehMultiploDe));
		
	}
	
	@Test
	public void testPalindromeEhPalindrome(){
		
		String palavra = "4004";
		assertTrue(Palindrome.ehPalindrome(palavra));
		
	}
	
	@Test
	public void testPalindromeNaoEhPalindrome(){
		
		String palavra = "1234";
		assertFalse(Palindrome.ehPalindrome(palavra));
		
	}
	
	@Test
	public void testExercicioSoma(){
		
		int inicioIntervalo = 1;
		int fimIntervalo = 10;
		boolean palindrome = true;
		int ehMultiploDe = 3;
		int resultadoEsperado = 18;
		int resultadoObtido = Exercicio.soma(inicioIntervalo, fimIntervalo, palindrome, ehMultiploDe);
		
		assertTrue("Resultado esperado " + resultadoEsperado + ". Porém, o resultado obtido foi " +  resultadoObtido
				,resultadoEsperado == resultadoObtido);
		
	}
	
	@Test
	public void testExercicioExibicao(){
		
		int inicioIntervalo = 1;
		int fimIntervalo = 10;
		boolean palindrome = true;
		int ehMultiploDe = 3;
		String[] resultadoEsperado = {"3","6","9"};
		String[] resultadoObtido = Exercicio.exibicao(inicioIntervalo, fimIntervalo, palindrome, ehMultiploDe).split(",");
		
		assertArrayEquals("Resultado esperado: " + exibiOQueEstaNoArray(resultadoEsperado) + ".\n Porém, o resultado obtido foi: " + 
		exibiOQueEstaNoArray(resultadoObtido)
				,resultadoEsperado, resultadoObtido);
		
	}
	
	private String exibiOQueEstaNoArray(String[] arrayStr){
		
		String retorno = "";
		
		for(int i = 0 ; i < arrayStr.length ; i++){
			
			retorno += arrayStr[i] + (i == arrayStr.length - 1?"":",");
			
		}
		
		return retorno;
		
	}

}
