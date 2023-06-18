/*Duplicate a linked list with random pointer
 * T = O(N)
 * S = O(1)*/
public class LinkedList05
{
    public static void main(String[] args)
    {
        node n1 = new node(10);
        node n2 = new node(20);
        node n3 = new node(30);
        node n4 = new node(40);
        node n5 = new node(50);
        node head = n1; head.random = n3; head.next = n2;
        n2.random = n1; n2.next = n3;
        n3.random = n3; n3.next = n4;
        n4.random = n2; n4.next = n5;
        n5.random = n4; n5.next = null;
        System.out.println("The entered array is as follows:");
        Display(head);
        System.out.println("The duplicate array is as follows");
        node Copy = Duplicate(head);
        Display(Copy);
    }
    static class node
    {
        int data;
        node next;
        node random;
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
                System.out.print("      " + Temporary.data + "(" + Temporary.random.data + ")");
            }
            else
            {
                System.out.print(" ------> " + Temporary.data + "(" + Temporary.random.data + ")");
            }
            Temporary = Temporary.next;
        }
        System.out.println();
    }
    static node Duplicate(node Head)
    {
        node Current = Head;
        while(Current != null)
        {
            node Temporary = Current.next;
            Current.next = new node(Current.data);
            Current.next.next = Temporary;
            Current = Temporary;
        }
        Current = Head;
        while(Current != null)
        {
            if(Current.next != null)
            {
                Current.next.random = (Current.random != null)?Current.random.next : null;
            }
            Current = Current.next.next;
        }
        node Original = Head;
        node Copy = Head.next;
        node Temporary = Copy;
        while(Original != null)
        {
            Original.next = Original.next.next;
            Copy.next = (Copy != null) ? Copy.next.next : null;
            Original = Original.next;
            Copy = Copy.next;
        }
        return Temporary;
    }
}