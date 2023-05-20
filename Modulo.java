import java.util.Scanner;

public class Modulo
{
    public static void main(String[] args)
    {
        System.out.print("Enter the base number        ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.print("Enter the exponent number        ");
        int b = s.nextInt();
        System.out.print("Enter the divisor number        ");
        long n = s.nextInt();
        System.out.println("(" + a + " raised to the power " + b + ") modulo " + n + " = " + fastpower(a, b, n));
        s.close();
    }
    static long fastpower(long a, long b, long n)
    {
        long res = 1;
        while(b > 0)
        {
            if((b & 1) != 0)
            {
                res = (res * a%n) % n;
            }
            a = (a%n * a%n) % n;
            b = b >> 1;
        }
        return res;
    }
}