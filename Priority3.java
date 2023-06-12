import java.util.PriorityQueue;
import java.util.Scanner;

/*Connect N ropes with minimun cost.
Given are N ropes of different lengths, the task is to connect these ropes into one rope with minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.
T = O(NlogN)
S = O(N)*/
public class Priority3
{
    public static void main(String args[])
    {
        System.out.println("How many rope lengths do you want to enter?");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int [n];
        System.out.println("Enter " + n + " rope lengths of your choice");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        int sum = 0;
        System.out.print("The entered array of rope lengths is as follows:");
        for(int i = 0; i < n; i++)
        {
            System.out.print("      " + a[i]);
            sum += a[i];
        }
        System.out.println();
        System.out.println("Thus, the length of " + n + " ropes connected together is " + sum + " and the total cost of connecting these ropes is " + Cost(a));
        s.close();
    }
    static int Cost(int array[])
    {
        PriorityQueue<Integer> MinHeap = new PriorityQueue<>();
        for(int i = 0; i < array.length; i ++)
        {
            MinHeap.add(array[i]);
        }
        int mincost = 0;
        while(MinHeap.size() > 1)
        {
            int FirstRope = MinHeap.poll();
            int SecondRope = MinHeap.poll();
            int sum = FirstRope + SecondRope;
            mincost += sum;
            MinHeap.add(sum);
        }
        return mincost;
    }
}