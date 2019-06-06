package caesar.main;

public class RSA
{
    private double p;
    private double q;
    private double fI;
    private double n;
    private double e;
    private double d;
    private double[] publicKey;
    private double[] privateKey;

    public RSA()
    {
        this.p = 17;
        this.q = 11;
        this.fI = (p - 1) * (q - 1);
        this.n = p * q;
        this.e = e;
        this.d = d;
    }

    public int gDc (int random, double n)
    {
        while (random != n)
        {
            if (random > n)
            {
                random -= n;
            }
            else
            {
                n -= random;
            }
        }
        return random;
    }
    public String coding (String text)
    {
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++)
        {
            chars[i] = (char) ((Math.pow(chars[i], e) % n));
        }
        String product = new String(chars);
        return product;
    }

    public double getN()
    {
        return n;
    }
}
