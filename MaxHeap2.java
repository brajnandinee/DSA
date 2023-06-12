import java.util.Scanner;

/*Insertion in Max Heaps
T = O(logN)
S = O(N)*/
public class MaxHeap2
{
    public static void main(String args[])
    {
        int MAX = 100;
        int[] a = new int[MAX];
        System.out.println("How many integers do you want to enter in the array?");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Enter " + n + " integers of your choice");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("The entered array of integers is as follows:");
        Display(a, n);
        System.out.println("Enter the element you want to insert");
        int Key = s.nextInt();
        System.out.print("The final array of integers after insertion of" + Key + " is as follows:");
        n = InsertKey(a, n, Key);
        Display(a, n);
        s.close();
    }
    static void Display(int array[], int Length)
    {
        for(int i = 0; i < Length; i++)
        {
            System.out.print("      " + array[i]);
        }
        System.out.println();
    }
    static int InsertKey(int array[], int CurrentLength, int Key)
    {
        CurrentLength = CurrentLength + 1;
        array[CurrentLength - 1] = Key;
        Heapify(array, CurrentLength, CurrentLength - 1);
        return CurrentLength;
    }
    static void Heapify(int array[], int Length, int i)
    {
        int parent = (i - 1) / 2;
        if (array[parent] > 0)
        {
            // For Max-Heap : If current node is greater than its parent swap both of them and call heapify again for the parent
            if (array[i] > array[parent])
            {
                int temp = array[i];
                array[i] = array[parent];
                array[parent] = temp;
                Heapify(array, Length, parent);
            }
        }
    } 
} 