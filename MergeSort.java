import java.util.Scanner;

/*Merge Sort
T = O(NlogN)
S = O(N)*/
public class MergeSort
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
        Sorts(a, 0, (n - 1));
        System.out.print("\nThe sorted  array of integers is as follows:");
        for(int i = 0; i < n; i++)
        {
            System.out.print("      " + a[i]);
        }
        System.out.println();
        s.close();
    }
    static void Sorts(int a[], int LeftIndex, int RightIndex)
    {
        if(LeftIndex < RightIndex)
        {
            int MiddleElement =  (LeftIndex + RightIndex)/2;
            Sorts(a, LeftIndex, MiddleElement);
            Sorts(a, MiddleElement + 1, RightIndex);
            Merges(a, LeftIndex, MiddleElement, RightIndex);
        }
    }
    static void Merges(int a[], int LeftIndex, int MiddleElement, int RightIndex)
    {
        int n1 = (MiddleElement - LeftIndex + 1), n2 = (RightIndex - MiddleElement); 
        int LeftArray[] = new int[n1], RightArray[] = new int[n2];
        for(int i = 0; i < n1; ++i)
        {
            LeftArray[i] = a[LeftIndex + i];
        }
        for(int j = 0; j < n2; ++j)
            {
                RightArray[j] = a[MiddleElement + 1 + j];
            }
        int l = 0, r = 0, k = LeftIndex;
        while(l < n1 && r < n2)
        {
            if(LeftArray[l] <= RightArray[r])
            {
                a[k] = LeftArray[l];
                l++;
            }
            else
            {
                a[k] = RightArray[r];
                r++;
            }
            k++;
        }
        while(l < n1)
        {
            a[k] = LeftArray[l];
            l++;
            k++;
        }
        while(r < n2)
        {
            a[k] = RightArray[r];
            r++;
            k++;
        }
    }
}
