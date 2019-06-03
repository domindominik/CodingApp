package caesar.main;


public class Coding
{
    public String coding (String text, int shift)
    {
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] + shift > 90)
            {
                chars[i] = (char) (64 + (shift - (90 - chars[i])));
            }
            else
            {
                chars[i] += shift;
            }
        }
        String product = new String(chars);

        return product;
    }

    public String deCoding (String text, int shift)
    {
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] + shift > 90)
            {
                chars[i] = (char) (64 + (shift - (90 - chars[i])));
            }
            else
            {
                chars[i] -= shift;
            }
        }
        String product = new String(chars);

        return product;
    }
}
