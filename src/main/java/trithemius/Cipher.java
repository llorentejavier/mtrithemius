package trithemius;

public class Cipher {

    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Cipher()
    {

    }

    public Cipher(String alphabet)
    {
        this.alphabet = alphabet;
    }

    public String cipherText(String input)
    {
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < input.length(); i++)
        {
            char targetChar = input.charAt(i);

            if(i == 0)
            {
                sb.append(targetChar);
            }
            else
            {
                int pos = getPositionFromAlphabet(targetChar);

                pos = Math.floorMod(pos - i, alphabet.length());

                char resultChar = Character.isLowerCase(targetChar) ? Character.toLowerCase(alphabet.charAt(pos)) : alphabet.charAt(pos);

                sb.append(resultChar);
            }
        }

        return sb.toString();
    }

    private int getPositionFromAlphabet(char targetChar)
    {
        char upperChar = Character.toUpperCase(targetChar);

        int pos = 0;

        for(int i = 0; i < alphabet.length(); i++)
        {
            if(upperChar == alphabet.charAt(i))
            {
                pos = i;
                break;
            }
        }

        return pos;
    }
}
