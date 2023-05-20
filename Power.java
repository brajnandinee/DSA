import java.util.Scanner;

public class Power
{
    public static void main(String[] args)
    {
        System.out.print("Enter the base number        ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.print("Enter the exponent number        ");
        int b = s.nextInt();
        System.out.println(a + " raised to the power " + b + " = " + power(a, b));
        s.close();
    }
    static int power(int a, int b)
    {
        int res = 1;
        while(b > 0)
        {
            if((b & 1) != 0)
            {
                res = res * a;
            }
            a = a * a;
            b = b >> 1;
        }
        return res;
    }
}