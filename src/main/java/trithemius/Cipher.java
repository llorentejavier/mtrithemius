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

    public String cipherWord(String input, int offset)
    {
        StringBuffer sb = new StringBuffer();

        if(offset == 0) {
            sb.append(input.charAt(0));
        }
        else
        {
            sb.append(getCharFromAlphabet(input.charAt(0), 0, offset));
        }

        for(int wordPos = 1; wordPos < input.length(); wordPos++)
        {
            char targetChar = input.charAt(wordPos);

            if(targetChar == ',' || targetChar == '.')
            {
                sb.append(targetChar);
            }
            else
            {
                sb.append(getCharFromAlphabet(targetChar, wordPos, offset));
            }
        }

        return sb.toString();
    }

    private char getCharFromAlphabet(char targetChar, int wordPos, int offset)
    {
        int pos = Math.floorMod(getPositionFromAlphabet(targetChar) - (wordPos + offset), alphabet.length());

        return Character.isLowerCase(targetChar) ? Character.toLowerCase(alphabet.charAt(pos)) : alphabet.charAt(pos);
    }

    public String cipherText(String input)
    {
        StringBuffer sb = new StringBuffer();

        int offset = 0;
        for(String word : input.split(" "))
        {
            sb.append(cipherWord(word, offset));
            sb.append(" ");

            offset += word.length();

            if(word.contains(",") || word.contains("."))
            {
                offset--;
            }
        }

        return sb.toString().trim();
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
