import java.util.PriorityQueue;
public class Priority_Queue
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        /*it implements a min heap by default.
         * to convert it to a max heap, you need to pass a comparator inside the constructor, that is,
         * PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());*/
        pq.add(5); //inserts new element.
        pq.add(15);
        pq.add(10);
        System.out.println(pq.size()); // prints out the size of the queue.
        while(!pq.isEmpty())//isEmpty() : returns true if this collection contains no elements.
        {
            System.out.println(pq.peek());
            //peek() : it will give the head element(root node) of the queue. If the queue is empty then it will return null.
            pq.poll(); //it will give the head element of the queue and will remove it from the queue.
        }
    }
}
/*OUTPUT
3
5
10
15 */