import java.util.Scanner;

/*Bubble Sort
T = O(N^2)
S = O(1)*/
public class BubbleSort
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
        for(int i = 0; i < n; i++)
        {
            boolean swapped = false;
            for(int j = 0; j < n - i - 1; j++)
            {
                if(a[j + 1] < a[j])
                {
                    swapped = true;
                    Swap(a, j+1, j);
                }
            }
            if(!swapped)
            {
                break;
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