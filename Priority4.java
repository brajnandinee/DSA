import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/*Find median of a number stream.
T = O(NlogN)
S = O(N)*/
public class Priority4
{
    public static void main(String args[])
    {
        System.out.println("How many integers do you want to enter?");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        float []a = new float [n];
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
        FindMedian(a);
        s.close();
    }
    static void FindMedian(float array[])
    {
        PriorityQueue<Float> MinHeap = new PriorityQueue<>();
        PriorityQueue<Float> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < array.length; i ++)
        {
            if(MaxHeap.isEmpty() || MaxHeap.peek() >= array[i]){MaxHeap.add(array[i]);}
            else{MinHeap.add(array[i]);}

            if(MaxHeap.size() > (MinHeap.size() + 1)){MinHeap.add(MaxHeap.poll());}
            else if(MaxHeap.size() < MinHeap.size()){MaxHeap.add(MinHeap.poll());}

            if(MaxHeap.size() == MinHeap.size()){System.out.println("Median after reading " + (i + 1) + " is " + (MinHeap.peek() + MaxHeap.peek())/2);}
            else{System.out.println("Median after reading " + (i + 1) + " is " + MaxHeap.peek());}
        }
    }
}