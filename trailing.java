import java.util.Scanner;

//Number of trailing zeroes in a factorial
public class trailing
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number you want to calculate the factorial for");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Number of trailing zeroes in factorial" + n + " is " + zeroes(n));
        s.close();
    }
    static int zeroes(int n)
    {
        int z = 0;
        for (int i = 5; i <= n; i = i*5)
        {
            z = z + (n/i);
        }
        return z;
    }
}