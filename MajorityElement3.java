import java.util.HashMap;
import java.util.Scanner;

/*Majority elements problem using Space
T = O(N)
S = O(N)*/
public class MajorityElement3
{
    public static void main(String[] args)
    {
        System.out.println("How many integers do you want to enter?");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int [n];
        System.out.println("Enter " + n + " integers of your choice");
        for(int i=0; i<n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("We need to look for the most frequent element of the entered array of integers");
        for(int i=0; i<n; i++)
        {
            System.out.print("      " + a[i]);
        }
        System.out.println();
        MajEle(a, n);
        s.close();
    }
    static int MajEle(int a[], int n)
    {
        int MaxCount = -1, majele = 0;
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++)
        {
            if(freq.containsKey(a[i]))
            {
                freq.put(a[i], freq.get(a[i]) + 1);
            }
            else
            {
                freq.put(a[i], 1);
            }
            if(freq.get(a[i]) > n/2)
            {
                majele= a[i];
                MaxCount = freq.get(a[i]);
                
            }
        }
        if(MaxCount > 0)
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
