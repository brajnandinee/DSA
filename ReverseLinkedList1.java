/*Reverse a linked list iteratively.
 * T = O(N)
 * S = O(1)*/
public class ReverseLinkedList1
{
    public static void main(String[] args)
    {
        node n1 = new node(10);
        node n2 = new node(20);
        node n3 = new node(30);
        node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;
        System.out.print("The entered linked list is as follows: ");
        Display(head);
        System.out.print("The reversed linked list is as follows:");
        head = Reverse(head);
        Display(head);
    }
    static class node
    {
        int data;
        node next;
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
            System.out.print("      " + Temporary.data);
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
}
