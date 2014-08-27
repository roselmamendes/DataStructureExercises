package exercises;

import org.junit.Test;
import twu.exercises.TrataIsbn;

import static org.junit.Assert.*;


public class TrataIsbnTest {

    @Test
    public void getControlNumberTest(){

        String isbn = "408873104";

        int controlNumberEsperado = 2;
        int controlNumberObtido = TrataIsbn.getCheckDigit(isbn);

        assertEquals(controlNumberEsperado,controlNumberObtido);

    }

    @Test
    public void checkIsbnWhenItsValidTest(){

       String isbn =  "4088731042";

        assertTrue(TrataIsbn.checkIsbn(isbn));

    }

    @Test
    public void checkIsbnWhenItsInvalidTest(){

        String isbn =  "4088731047";

        assertFalse(TrataIsbn.checkIsbn(isbn));

    }

}