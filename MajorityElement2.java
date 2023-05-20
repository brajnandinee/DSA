import java.util.Arrays;
import java.util.Scanner;

/*Majority elements problem using Sorting Technique
T = O(NlogN)
S = O(1)*/
public class MajorityElement2
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
        System.out.println("We need to look for the most frequent element of the entered array of integers");
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
        MajEle(a, n);
        s.close();
    }
    static int MajEle(int a[], int n)
    {
        int MaxCount = 0;
        int majele = 0;
        int i = 0;
        while(i < n)
        {
            int count = 1;
            int j = (i + 1);
            while(a[i] == a[j])
            {
                count++;
                j++;
            }
            if(count > MaxCount)
            {
                MaxCount = count;
                majele = a[i];
            }
            if(MaxCount > (n/2))
            {
                i = n;
            }
            else
            {
                i = j;
            }
        }
        if(MaxCount > (n/2))
        {
            System.out.println("The most frequent element of the above array is " + majele + " with the frequency " + MaxCount);
        }
        else
        {
            System.out.println("No such element is present");
        }
        return 0;
    }
}
