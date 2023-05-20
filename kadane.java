import java.util.Scanner;

//Kadane's Algorithm
//O(N)
public class kadane 
{    
    public static void main(String[] args)
    {
        System.out.println("How many integers do you want to enter?");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int [n];
        System.out.println("Enter " + n + " integers of your choice");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("The entered array of integers are as follows:");
        for(int i = 0; i < n; i++)
        {
            System.out.print("      " + a[i]);
        }
        System.out.println();
        kad(a, n);
        s.close();
    }
    static int kad(int a[], int n)
    {
        int max = 0;
        int current = 0;
        for(int i = 0; i < n; i++)
        {
            current = current + a[i];
            if(current > max)
            {
                max = current;
            }
            if(current < 0)
            {
                current = 0;
            }
        }
        System.out.println("The maximum sum possible among the subarrays of the above array is      " + max);
        return 0;
    }
}
