import java.util.Scanner;

/*Heapify method to buid a Min Heap
T = O(N)
S = O(N)Recursive Stack Space*/
public class MinHeap3
{
    public static void main(String args[])
    {
        int MAX = 100;
        int[] a = new int[MAX];
        System.out.println("How many integers do you want to enter in the first array?");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Enter " + n + " integers of your choice");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("The entered array of integers is as follows:");
        Display(a, n);
        System.out.print("The final array of integers after Heapify Method is as follows:");
        BuildHeap(a, n);
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
    static void BuildHeap(int array[], int length)
    {
        for(int i = (length/2) - 1; i >= 0; i--)
        {
            Heapify(array, length, i);
        }
    }
    static void Heapify(int array[], int Length, int i)
    {
        // For Min-Heap : If the root node is grater than the left child or the right child then swap them and call heapify again for the node
        int smallest = i, Left_Child = (2 * i) + 1, Right_Child = (2 * i) + 2;
        if (Left_Child < Length && array[Left_Child] < array[smallest])
        {
            smallest = Left_Child;
        }
        if (Right_Child < Length && array[Right_Child] < array[smallest])
        {
            smallest = Right_Child;
        }
        if (smallest != i)
        {
            int swap = array[i];
            array[i] = array[smallest];
            array[smallest] = swap;
            Heapify(array, Length, smallest);
        }
    } 
} 