import java.util.Arrays;
import java.util.Scanner;

/*Binary Search on a sorted array   
T = O(logN)
S = O(1)*/
public class BinarySearch1
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
        Arrays.sort(a);
        System.out.print("The sorted array of integers is as follows:");
        for(int i = 0; i < n; i++)
        {
            System.out.print("      " + a[i]);
        }
        System.out.println();
        System.out.println("Enter the element you are looking for");
        int x = s.nextInt();
        BinarySearch(a, x);
        s.close();
    }
    static void BinarySearch(int a[], int x)
    {
        int LeftIndex= 0, RightIndex = (a.length - 1), MaxCount = 0;
        while(LeftIndex <= RightIndex)
        {
            int MiddleIndex = (LeftIndex + RightIndex)/2;
            if(a[MiddleIndex] == x)
            {
                System.out.println("The element " + x + " is at the " + (MiddleIndex + 1) + "th position");
                MaxCount++;
            }
            if(a[MiddleIndex] < x)
            {
                LeftIndex = MiddleIndex + 1;
            }
            else
            {
                RightIndex = MiddleIndex - 1;
            }
        }
        if(MaxCount == 0)
        {
            System.out.println("No such element is present");
        }
    }
}