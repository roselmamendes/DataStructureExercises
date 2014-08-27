package twu.exercises;

/**
 * Created by roselmamendes on 8/27/14.
 */
public class TrataIsbn {


    public static int getCheckDigit(String primeirosNoveNumeros){

        int controlNumber = 0;

        char[] vetorStr = primeirosNoveNumeros.toCharArray();
        char numeroDoVetorChar;
        int numeroDoVetorInt;
        int tam = primeirosNoveNumeros.length();
        int soma = 0;

        for(int i = 0; i < 9 && tam == 9 ; i++){


            numeroDoVetorChar = vetorStr[i];
            numeroDoVetorInt = Character.getNumericValue(numeroDoVetorChar);

            soma += (numeroDoVetorInt * (i+1));

        }

        controlNumber = soma % 11;

        return controlNumber;

    }

    public static boolean checkIsbn(String isbn){

        String verifiedDigit = isbn.substring(9,10);

        if(verifiedDigit.matches("[0-9]"))
            return TrataIsbn.

        return Integer.parseInt(verifiedDigit) == TrataIsbn.getCheckDigit(isbn.substring(0,9));

    }

}
