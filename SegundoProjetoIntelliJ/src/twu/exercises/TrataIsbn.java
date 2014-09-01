package twu.exercises;

/**
 * Created by roselmamendes on 8/27/14.
 */
public class TrataIsbn {

    private static final int X = 10;
    private static final int DIVISOR = 11;


    public static boolean getCheckDigit(String primeirosNoveNumeros,String verifiedDigit){

        int controlNumber = 0;

        char[] vetorStr = primeirosNoveNumeros.toCharArray();
        int tam = primeirosNoveNumeros.length();
        int soma = 0;

        if(tam == 9) {

            for (int i = 0; i < 9; i++) {

                soma += (Character.getNumericValue(vetorStr[i]) * (i + 1));

            }

        }

        controlNumber = soma % DIVISOR;

        return verifiedDigit.matches("[0-9]")?
                Integer.parseInt(verifiedDigit) == controlNumber:
                checkAndTreatWhenVerifiedDigitIsX(verifiedDigit,controlNumber);

    }

    private static boolean checkAndTreatWhenVerifiedDigitIsX(String verifiedDigit,int controlNumber){

            return verifiedDigit.toLowerCase().equals("x")?controlNumber == X:false;

    }

    public static boolean checkIsbn(String isbn){

        String verifiedDigit = isbn.substring(9,10);
        String primeirosNoveDigitos = isbn.substring(0, 9);

       return getCheckDigit(primeirosNoveDigitos,verifiedDigit);

    }

}
