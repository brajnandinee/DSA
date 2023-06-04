import java.util.Scanner;

/*Allocate minimum pages
Minimise the maximum numbers of pages read by a student
T = O(NlogN)
S =O(1)*/
public class BinarySearch5
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
        int page = MinPages(a, n, k);
        if(page == (-1))
        {
            System.out.println("Book allocation is not feasible.");
        }
        else
        {
            System.out.println("Minimum of the maximum page count read by a student = " + page);
        }
        s.close();
    }
    static int MinPages(int a[], int n/*array length*/, int k/*no. of students*/)
    {
        int sum = SumOf(a);/*sum of the entries of array*/
        if(n < k)
        {
            return -1;
        }
        for(int numPages = 1; numPages <= sum; numPages++)
        {
            if(IsFeasible(a, n, k, numPages))
            {
                return numPages;
            }
        }
        return -1;
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
    static boolean IsFeasible(int a[],int n, int k, int curr_min)
    {
        int cntStudents = 1;
        int curSum = 0;
        for (int i = 0; i < n; i++) 
        {
            if(a[i] > curr_min)
            {
                return false;
            }
            if(curSum + a[i] > curr_min)
            {
                cntStudents++;
                curSum = a[i];
                if(cntStudents > k)
                {
                    return false;
                }
            }
            else
            {
                curSum += a[i];
            }
        }
        return true;
    }
}