import java.util.Scanner;

/*Selection Sort
T = O(N^2)
S = O(1)*/
public class SelectionSort {
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
        for(int i = 0; i < n - 1; i++)
        {
            int min = i;
            for(int j = i + 1; j < n; j++)
            {
                if(a[j] < a[min])
                {
                    min = j;
                }
            }
            if(min != i)
            {
                Swap(a, min, i);
            }
        }
    }
    static void Swap(int a[], int i,int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}