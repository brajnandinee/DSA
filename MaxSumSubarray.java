import java.util.Scanner;

//To find the maximum sum sub-array
//O(N^2)
public class MaxSumSubarray 
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
        MaxSum(a, n);
        s.close();
    }
    static int MaxSum(int a[], int n)
    {
        int max = 0;
        for(int i = 0; i < n; i++)
        {
            int current = a[i];
            for(int j = (i + 1); j < n; j++)
            {
                current = current + a[j];
                if(current > max)
                {
                    max = current;
                }
            }
        }
        System.out.println("The maximum sum possible among the subarrays of the above array is      " + max);
        return 0;
    }
}