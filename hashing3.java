import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/*union of two unsorted arrays using Hashing
T = O(NlogN + MlogM)
S = O(N + M)*/
public class hashing3
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
        System.out.println("Thus, the cardinality of the union of the two arrays = " + Union(a, b));
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
    static int Union(int a[], int b[])
    {
        Set<Integer> s = new HashSet<>();
        for(int element : a)
        {
            s.add(element);
        }
        for(int element : b)
        {
            s.add(element);
        }
        System.out.println("The elements in the union of the two arrays are " + s);
        return s.size();
    }
}
