import java.util.PriorityQueue;
import java.util.Scanner;

/*Print the Kth largest element in an array.
T = O(N + KlogN)
S = O(N)*/
public class Priority1
{
    public static void main(String args[])
    {
        System.out.println("How many integers do you want to enter?");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int [n];
        System.out.println("Enter " + n + " integers of your choice");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("The entered array of integers is as follows:");
        for(int i = 0; i < n; i++)
        {
            System.out.print("      " + a[i]);
        }
        System.out.println();
        System.out.println("Enter the position you are looking for");
        int k = s.nextInt();
        System.out.println("Thus, the " + k + "th largest element in the array is " + KthLargest(a, k));
        s.close();
    }
    static int KthLargest(int array[], int k)
    {
        PriorityQueue<Integer> MinHeap = new PriorityQueue<>();
        for(int i = 0; i < array.length; i ++)
        {
            MinHeap.add(array[i]);
        }
        for(int i = (k - 1); i < array.length; i ++)
        {
            if(MinHeap.peek() < array[i])
            {
                MinHeap.poll();
                MinHeap.add(array[i]);
            }
        }
        return MinHeap.peek();
    }
}