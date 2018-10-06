package trithemius;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrithemiusTest {

    private Cipher cipher = new Cipher();

    @Test
    public void simpleSentenceWithCipher()
    {
        //Given
        String inputString = "javier";
        String expectedResult = "jztfam";

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
        String expectedResult = "jztfam whvvi";

        //When
        String resultString = cipher.cipherText(inputString);

        //Then
        assertEquals(expectedResult, resultString);
    }

    @Test
    public void longTextWithCipher()
    {
        //Given
        String inputString = "I never deliberately learned to read, but somehow I had been wallowing illicitly in the daily papers.";
        String expectedResult =  "I mcsam xxdzrtfnfpvh tlgwrhf uo qcxz, wom kfctvbi T rjl ikjr zcmlnufjb cedzsxhyk tx cpl jfmoa qaocoo.";

        //When
        String resultString = cipher.cipherText(inputString);

        //Then
        assertEquals(expectedResult, resultString);
    }

    @Test
    @Ignore("Not implemeted yet")
    public void cipherWithUnexpectedChars()
    {
        //Given

        //When

        //Then
    }
}
