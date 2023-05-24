import java.util.Scanner;

/*Insertion Sort
T = O(N^2)
S = O(1)*/
public class InsertionSort
{
    public static void main(String[] args)
    {
        System.out.println("How many integers do you want to enter?");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] a = new int [n];
        System.out.println("Enter an array of " + n + " integers");
        for(int i= 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("The entered array of integers is as follows:");
        for(int i = 0; i < n; i++)
        {
            System.out.print("      " + a[i]);
        }
        System.out.println();
        Sorts(a, n);
        System.out.print("The sorted  array of integers is as follows:");
        for(int i = 0; i < n; i++)
        {
            System.out.print("      " + a[i]);
        }
        System.out.println();
        s.close();
    }
    static void Sorts(int a[], int n)
    {
        for(int i = 1; i < n; i++)
        {
            int temp = a[i], j = i - 1;
            while(j >= 0 && a[j] > temp)
            {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }
}
