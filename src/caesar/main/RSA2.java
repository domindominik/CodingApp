package caesar.main;

public class RSA2
{
    private long p;
    private long q;
    private long fI;
    private long n;
    private long e;
    private long d;
    //private static long[] primeNumber = new long[]{11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    private static long[] primeNumber = new long[]{3, 5, 7, 11, 13, 17};

    public RSA2()
    {
        this.p = primeNumber[(int) (Math.random() * primeNumber.length)];
        this.q = primeNumber[(int) (Math.random() * primeNumber.length)];
        this.fI = (p - 1) * (q - 1);
        this.n = p * q;
        this.e = primeNumber[(int) (Math.random() * primeNumber.length)];
        this.d = d;
    }

    public long getP()
    {
        return p;
    }

    public long getQ()
    {
        return q;
    }

    public long getfI()
    {
        return fI;
    }

    public long getN()
    {
        return n;
    }

    public long getE()
    {
        return e;
    }

    public long getD()
    {
        for (int i = 2; i < fI; i++)
        {
            if (i * e % fI == 1)
            {
                d = i;
                break;
            }
        }
        return d;
    }

    public void getPublicKey()
    {
        System.out.println("Public key e: " + getE() + ", n: " + getN());
    }

    public void getPrivateKey()
    {
        System.out.println("Private key d: " + getD() + ", n: " + getN());
    }

    public String coding (String text)
    {
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++)
        {
            long x = (long) chars[i];
            long y = pow(x,e,n);
            chars[i] = (char) y;
        }
        return new String(chars);

    }

    public String deCoding (String text, long d, long n)
    {
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++)
        {
            chars[i] = (char) (Math.pow(chars[i], d) % n);
        }
        return new String(chars);
    }

    public long pow(long x, long d, long n)
    {
        long result = 1;
        for (long i = 0; i < d; i++)
        {
            result = (result * x) % n;
        }
        return result;
    }


}
