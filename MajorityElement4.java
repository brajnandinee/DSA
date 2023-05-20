import java.util.Scanner;

/*Majority elements problem using Moore's Voting Algorithm Logic
T = O(N)
S = O(1)*/
public class MajorityElement4 
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
        MajEle(a, n);
        s.close();
    }
    static int MajEle(int a[], int n)
    {
        int Count = 1;
        int ans = 0;
        for(int i = 1; i < n; i++)
        {
            if(a[i] == a[ans])
            {
                Count++;
            }
            else
            {
                Count--;
            }
            if(Count == 0)
            {
                ans = i;
                Count = 1;
            }
        }
        if(Count>0 && ans<n)
        {
            System.out.println("The most frequent element of the above array is " + a[ans]);
        }
        else
        {
            System.out.println("No such element is present");
        }
        return 0;
    }
}
