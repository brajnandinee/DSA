import java.util.Arrays;
import java.util.Scanner;

/*Count the distinct elements in every window of size k without using Hashing
T = O(N * (k^2))
S = O(1)*/
public class hashing8
{
    public static void main(String[] args)
    {
        System.out.println("How many integers do you want to enter"/* in the first array?"*/);
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
        System.out.println("Enter the size of the window you are looking for");
        int windowSize = s.nextInt();
        System.out.print("Thus, the number of distinct elements in every window of size " + windowSize + "are as follows:");
        CountDistinct(a, windowSize);
        s.close();
    }
    static void CountDistinct(int a[], int windowSize)
    {
        for(int i = 0; i <= (a.length - windowSize); i++)
        {
            System.out.println(Window(Arrays.copyOfRange(a, i, a.length), windowSize));
            /*Copies the specified range of the specified array into a new array. The initial index of the range (from) must lie between zero and original.length, inclusive.*/
        }
    }
    static int Window(int NewArray[], int windowSize)
    {
        int Count = 0;
        for(int i = 0; i < windowSize; i++)
        {
            int j;
            for(j = 0; j < i; j++)
            {
                if(NewArray[i] == NewArray[j])
                {
                    break;
                }
            }
            if(j == i)
            {
                Count++;
            }
        }
        return Count;
    }
}