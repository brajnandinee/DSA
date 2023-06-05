import java.util.Scanner;

/* brute force solution for counting distinct elements without using Hashing
T = O(N^2)
S = O(1)
*/
public class hashing1
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
        System.out.print("The entered array of integers is as follows:");
        for(int i = 0; i < n; i++)
        {
            System.out.print("      " + a[i]);
        }
        System.out.println();
        System.out.println("Thus, the no. of distinct elements in the array = " + Count(a));
        s.close();
    }
    static int Count(int a[])
    {
        int count = 0;
        System.out.print("The distinct elements in the array are as follows:");
        for(int i = 0; i < a.length; i++)
        {
            int j = 0;
            for(j = 0; j < i; j++)
            {
                if (a[i] == a[j])
                {
                    break;
                }
            }
            if(i == j)
            {
                count++;
                System.out.print("      " + a[i]);
            }        
        }
        System.out.println();
        return count;
    }
}
