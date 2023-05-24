import java.util.Scanner;

/*Quick Sort
T = O(N^2)
S = O(N)*/
public class QuickSort
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
        int low = 0, high = n - 1;
        Sorts(a, low, high);
        System.out.print("The sorted  array of integers is as follows:");
        for(int i = 0; i < n; i++)
        {
            System.out.print("      " + a[i]);
        }
        System.out.println();
        s.close();
    }
    static void Sorts(int a[], int low, int high)
    {
        if(low < high)
        {
            int pivot = Partition(a, low, high);
            Sorts(a, low, pivot - 1);
            Sorts(a, pivot + 1, high);
        }
        
    }
    static int Partition(int a[], int low, int high)
    {
        int pivot = a[(low + high)/2], i = low, j = high;
        while(i < j)
        {
            while(a[i] <= pivot)
            {
                i++;
            }
            while(a[j] > pivot)
            {
                j--;
            }
            if(i < j)
            {
                Swap(a, i, j);
            }
        }
        Swap(a, j, low);
        return j;
    }
    static void Swap(int a[], int i,int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
