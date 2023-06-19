import java.util.Arrays;
import java.util.Scanner;

/*Search an element in a sorted and rotated array   
T = O(logN)
S = O(1)*/
public class BinarySearch4
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
        System.out.println("How many times do you want to rotate the array?");
        int r = s.nextInt();
        Rotate(a, r);
        System.out.print("The sorted and " + r + " times rotated array of integers is as follows:");
        for(int i = 0; i < n; i++)
        {
            System.out.print("      " + a[i]);
        }
        System.out.println();
        System.out.println("Enter the element you are looking for");
        int x = s.nextInt();
        Search(a, x);
        s.close();
    }
    static void Rotate(int a[], int r)
    {
        int []temp = new int [a.length];
        for(int i = 0; i < a.length; i++)
        {
            temp[i] = a[i];
        }
        for(int i = 0; i < a.length; i++)
        {
            a[(i + r) % a.length] = temp[i];
        }
    }
    static void Search(int a[], int x)
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
            if(a[LeftIndex] <= a[MiddleIndex])
            {
                if(x >= a[LeftIndex] && x <= a[MiddleIndex])
                {
                    RightIndex = MiddleIndex - 1;
                }
                else{
                    LeftIndex = MiddleIndex + 1;
                }
            }
            else
            {
                if(x <= a[RightIndex] && x >= a[MiddleIndex])
                {
                    LeftIndex = MiddleIndex + 1;
                }
                else{
                    RightIndex = MiddleIndex - 1;
                }
            }
        }
        if(MaxCount == 0)
        {
            System.out.println("No such element is present");
        }
    }
}
