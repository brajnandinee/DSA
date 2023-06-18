/*Detect and remove cycle in a linked list.
Floyd's Cycle Detection Algorithm
 * T = O(N)
 * S = O(1)*/
public class LinkedList04
{
    public static void main(String[] args)
    {
        node n1 = new node(10);
        node n2 = new node(20);
        node n3 = new node(30);
        node n4 = new node(40);
        node head = n1;
        head.position = 1;
        head.next = n2;
        n2.position = 2;
        n2.next = n3;
        n3.position = 3;
        n3.next = n4;
        n4. position = 4;
        n4.next = /*null;*/n2;
        node MeetPointer = DetectCycle(head);
        if(MeetPointer != null)
        {
            node CycleNode = DetectCycleNode(head, MeetPointer);
            System.out.println("The cycle is detected at the node n" + CycleNode.position + ".");
            System.out.print("The linked list after removing the list is");
            head = RemoveCycle(head, CycleNode);
            Display(head);
            
        }
    }
    static class node
    {
        int data;
        node next;
        int position;
        node (int data)
        {
            this.data = data;
        }
    }
    static void Display(node Head)
    {
        node Temporary = Head;
        while(Temporary != null)
        {
            if(Temporary == Head)
            {
                System.out.print("      " + Temporary.data);
            }
            else
            {
                System.out.print(" ------> " + Temporary.data);
            }
            Temporary = Temporary.next;
        }
        System.out.println();
    }
    static node Reverse(node Head)
    {
        node Current = Head;
        node Previous = null;
        while(Current != null)
        {
            node Temporary = Current.next;
            Current.next = Previous;
            Previous = Current;
            Current = Temporary;
        }
        return Previous;
    }
    static node DetectCycle(node Head)
    {
        if(Head != null)
        {
            node SlowPointer = Head;
            node FastPointer = Head;
            while(FastPointer != null && FastPointer.next != null)
            {
                SlowPointer = SlowPointer.next;
                FastPointer = FastPointer.next.next;
                if(SlowPointer == FastPointer)
                {
                    System.out.println("Cycle found in the linked list.");
                    return SlowPointer;
                }
            }
        }  
        System.out.println("Cycle not found in the linked list");
        System.out.print("The entered linked list is");
        Display(Head);
        return null;
    }
    static node DetectCycleNode(node Head, node MeetPointer)
    {
        node StartPointer = Head;
        while(StartPointer != MeetPointer)
        {
            StartPointer = StartPointer.next;
            MeetPointer = MeetPointer.next;
        }
        return StartPointer;
    }
    static node RemoveCycle(node Head, node CycleNode)
    {
        node LastNode = CycleNode;
        do
        {
            LastNode = LastNode.next;
        }while (LastNode == CycleNode);
        LastNode.next.next = null;
        return Head;
    }
}