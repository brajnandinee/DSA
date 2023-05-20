import java.util.Scanner;

//Factorial of a number
public class factoriaal
{
	public static void main(String args[])
	{
		System.out.println("Enter the number you want to calculate the factorial for");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Factorial"+ n + " = " + factorial(n)); 
        s.close();
	}
	static int factorial(int n)
	{
	    if (n == 0)
	    {
	        return 1;
	    }
	    else
	    {
	        return(n * factorial(n-1));
	    }
    }
}