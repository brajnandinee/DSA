import java.util.Scanner;

//Given an integer n, check if it is a power of four.
public class PowerOf4
{
    public static void main(String args[])
	{
		System.out.println("Enter the number you want to check if it is a power of four.");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(isPowerOfFour(n))
        {
            System.out.println(n + " is a power of four.");
        }
        else
        {
            System.out.println(n + " is not a power of four.");
        }
        s.close();
	}
    static boolean isPowerOfFour(int n)
    {
        if(n <= 0)
        {
            return false;
        }
        while(n > 1)
        {
            if((n % 4) != 0)
            {
                return false;
            }
            n = (n / 4);
        }
        return true;
    }
}