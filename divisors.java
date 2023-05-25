import java.util.Scanner;

//Given a positive integer n. The task is to find count of digits of number which evenly divides the number n.
public class divisors
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        divisor(n);
        s.close();
    }
    static int divisor(int n)
    {
        int i, num = n, count = 0;
        while(n > 0)
        {
            i = n%10;
            if(num % i == 0)
            {
                count++;
            }
            n = n/10;
        }
        if(count != 0)
        {
            System.out.println(num + " is evenly divisible by " + count + " of its digits.");
        }
        else
        {
            System.out.println(num + " is not evenly divisible by any of its digits.");
        }
        return 0;
    }
}