import java.util.Arrays;
import java.util.Scanner;

//Is prime.
public class Seive
{
    public static void main(String[] args)
    {
        System.out.println("Enter the numbers upto which you want find out prime numbers smaller than or equal to");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Following are the prime numbers smaller than or equal to " + n);
        seive(n);
        System.out.println();
        s.close();
    }
    static void seive(int n)
    {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; (i * i) < n; i++)
        {
            for(int j = (2 * i); j <= n; j += i)
            {
                isPrime[j] = false;
            }
        }
        for(int i = 2; i <= n; i++)
        {
            if(isPrime[i] == true)
            {
                System.out.print(i + "      ");
            }
        }
    }
}