import java.util.Scanner;

//Given an integer n, check if n is a sum of powers of three.
public class PowerOf3b
{
    public static void main(String args[])
	{
		System.out.println("Enter the number you want to check if it is a sum of powers of three.");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(CheckPowersOfThree(n))
        {
            System.out.println(n + " is a sum of powers of three.");
        }
        else
        {
            System.out.println(n + " is not a sum of powers of three.");
        }
        s.close();
	}
    static boolean CheckPowersOfThree(int n)
    {
        if(n <= 0)
        {
            return false;
        }
        while(n > 0)
        {
            if((n % 3) > 1)
            {
                return false;
            }
            n = (n / 3);
        }
        return true;
    }
}