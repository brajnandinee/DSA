import java.util.Scanner;

/*Heap : a complete binary tree(where each node has exactly two children nodes) that satisfies a heap's property.
 * Max Heap : a heap where every children node's value is less than the parent node's value.
 * Min Heap : a heap where every children node's value is more than the parent node's value.
 * for N nodes, its height h = logN
 */

/*Array = [50, 40, 45, 30, 20, 35, 10]

 * Max Heap :
             [50]
            /    \
           /      \
          /        \
         /          \
     [40]            [45]
    /    \          /    \
  [30]   [20]    [35]    [10]

 *Node = i
  Parent(i) = (i/2)
  Left_Child(i) = (2 * i) + 1
  Right_Child(i) = (2 * i) + 2
 */

/*Deletion in Max Heaps
T = O(logN)
S = O(N)*/
public class MaxHeap1
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
        System.out.print("The final array of integers after deleting the root node " + a[0] + " is as follows:");
        n = DeleteRoot(a, n);
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
    static int DeleteRoot(int array[], int Length)
    {
        array[0] = array[Length - 1];
        Length = Length - 1;
        Heapify(array, Length, 0);
        return Length;
    }
    static void Heapify(int array[], int Length, int i)
    {
        // For Max-Heap : If the root node is smaller than the left child or the right child then swap them and call heapify again for the node
        int largest = i, Left_Child = (2 * i) + 1, Right_Child = (2 * i) + 2;
        if (Left_Child < Length && array[Left_Child] > array[largest])
        {
            largest = Left_Child;
        }
        if (Right_Child < Length && array[Right_Child] > array[largest])
        {
            largest = Right_Child;
        }
        if (largest != i)
        {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            Heapify(array, Length, largest);
        }
    } 
}