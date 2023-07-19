import java.util.Scanner;

//Given an integer n, check if it is a power of two.
public class PowerOf2
{
    public static void main(String args[])
	{
		System.out.println("Enter the number you want to check if it is a power of two.");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(isPowerOfTwo(n))
        {
            System.out.println(n + " is a power of two.");
        }
        else
        {
            System.out.println(n + " is not a power of two.");
        }
        s.close();
	}
    static boolean isPowerOfTwo(int n)
    {
        if(n <= 0)
        {
            return false;
        }
        while(n > 1)
        {
            if((n % 2) != 0)
            {
                return false;
            }
            n = (n / 2);
        }
        return true;
    }
}