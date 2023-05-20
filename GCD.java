import java.util.Scanner;

//gcd.
public class GCD
{
    public static void main(String[] args)
    {
        System.out.println("Enter the numbers you want to calculate the gcd for");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("gcd(" + a + ", " + b + ") = " + gcd(a, b));
        s.close();
    }
    static int gcd(int a, int b)
    {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}