import java.util.Scanner;

/*Allocate minimum pages
Minimise the maximum numbers of pages read by a student
T = O(NlogN)
S =O(1)*/
public class BinarySearch6
{
    public static void main(String[] args)
    {
        System.out.println("How many books' page counts would you want to enter?");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int [n];
        System.out.println("Enter the page count for each of the " + n + " books");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("The entered array of page counts is as follows:");
        for(int i = 0; i < n; i++)
        {
            System.out.print("      " + a[i]);
        }
        System.out.println();
        System.out.println("How many students would you want to allocate the books to?");
        int k = s.nextInt();
        System.out.println("Minimum of the maximum page count read by a student = " + MinPages(a, k));
        s.close();
    }
    static int MinPages(int a[], int k)
    {
        int res = 0, min = MaxOf(a), max = SumOf(a);
        while(min <= max)
        {
            int avg = (min + max)/2;
            if(IsFeasible(a, k, avg))
            {
                res = avg;
                max = avg - 1;
            }
            else
            {
                min = avg + 1;
            }
        }
        return res;
    }
    static int MaxOf(int a[])
    {
        int max = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            } 
        }
        return max;
    }
    static int SumOf(int a[])
    {
        int sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            sum += a[i]; 
        }
        return sum;
    }
    static boolean IsFeasible(int a[], int k, int avg)
    {
        int student = 1, sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(sum + a[i] > avg)
            {
                student++;
                sum = a[i];
            }
            else
            {
                sum += a[i];
            }
        }
        return (student <= k);
    }
}