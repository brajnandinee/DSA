import java.util.Scanner;

/*intersection of two unsorted arrays without using Hashing
T = O(N + M)
S = O(1)*/
public class hashing6
{
    public static void main(String[] args)
    {
        System.out.println("How many integers do you want to enter in the first array?");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int [n];
        System.out.println("Enter " + n + " integers of your choice");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        Display(a);
        System.out.println("How many integers do you want to enter in the second array?");
        int m = s.nextInt();
        int []b = new int [m];
        System.out.println("Enter " + m + " integers of your choice");
        for(int i = 0; i < m; i++)
        {
            b[i] = s.nextInt();
        }
        Display(b);
        System.out.println("Thus, the cardinality of the intersection of the two arrays = " + Intersection(a, b));
        s.close();
    }
    static void Display(int array[])
    {
        System.out.print("The entered array of integers is as follows:");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print("      " + array[i]);
        }
        System.out.println();
    }
    static int Intersection(int a[], int b[])
    {
        int count = 0;
        System.out.print("The elements in the intersection of the two arrays are as follows");
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; i < b.length; j++)
            {
                if(a[i] == b[j])
                {
                    count++;
                    System.out.print("      " + a[i]);
                }
            }
        }
        if(count == 0)
        {
            System.out.println("       Φ");
            System.out.println("That is, the intersection is an empty set");
        }
        else
        {
            System.out.println();
        }
        return count;
    }
}