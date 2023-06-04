import java.util.Arrays;
import java.util.Scanner;

/*recursive Binary Search on a sorted array   
T = O(logN)
S = O(1)*/
public class BinarySearch2
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
        int xIndex = BinarySearch(a, x, 0, n);
        if(xIndex == -1)
        {
            System.out.println("No such element is present");
        }
        else
        {
            System.out.println("The element " + x + " is at the " + (xIndex + 1) + "th position");
        }
        s.close();
    }
    static int BinarySearch(int a[], int x, int LeftIndex, int RightIndex)
    {
        if(LeftIndex <= RightIndex)
        {
            int MiddleIndex = (LeftIndex + RightIndex)/2;
            if(a[MiddleIndex] == x)
            {
                return MiddleIndex;
            }
            else if(a[MiddleIndex] < x)
            {
                BinarySearch(a, x, MiddleIndex + 1, RightIndex);
            }
            else
            {
                BinarySearch(a, x, LeftIndex, MiddleIndex - 1);
            }
        }
        return -1;
    }
}