package trithemius;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrithemiusTest {

    @Test
    public void simpleSentenceWithCipher()
    {
        //Given
        String inputString = "javier";
        String expectedResult = "jztfam";

        Cipher cipher = new Cipher();

        //When
        String resultString = cipher.cipherText(inputString);

        //Then
        assertEquals(expectedResult, resultString);
    }

    @Test
    public void multipleSentencesWithCipher()
    {
        //Given
        String inputString = "javier codes";
        String expectedResult = "jztfam c";

        //When
        

        //Then
    }

}
