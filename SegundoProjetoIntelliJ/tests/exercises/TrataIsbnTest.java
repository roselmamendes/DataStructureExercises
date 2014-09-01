package exercises;

import org.junit.Test;
import twu.exercises.TrataIsbn;

import static org.junit.Assert.*;


public class TrataIsbnTest {

    @Test
    public void getControlNumberTest(){

        String isbn = "408873104";

        assertTrue(TrataIsbn.getCheckDigit(isbn,"2"));

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

    @Test
    public void whenCheckDigitIsTenTest(){

        String isbnInvalido =  "159972091X";

        String isbn2 = "044018293X";
        assertTrue(TrataIsbn.checkIsbn(isbn2));

    }

    @Test
    public void whenCheckDigitIsXInvalidTest(){

        String isbnInvalido =  "159972091X";

        String isbn2 = "044018293X";
        assertFalse(TrataIsbn.checkIsbn(isbnInvalido));

    }

}