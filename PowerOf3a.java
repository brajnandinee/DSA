import java.util.Scanner;

//Given an integer n, check if it is a power of three.
public class PowerOf3a
{
    public static void main(String args[])
	{
		System.out.println("Enter the number you want to check if it is a power of three.");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(isPowerOfThree(n))
        {
            System.out.println(n + " is a power of three.");
        }
        else
        {
            System.out.println(n + " is not a power of three.");
        }
        s.close();
	}
    static boolean isPowerOfThree(int n)
    {
        if(n <= 0)
        {
            return false;
        }
        while(n > 1)
        {
            if((n % 3) != 0)
            {
                return false;
            }
            n = (n / 3);
        }
        return true;
    }
}