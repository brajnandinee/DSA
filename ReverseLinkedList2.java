/*Reverse a linked list recursively.
 * T = O(N)
 * S = O(N),function call stack space*/
public class ReverseLinkedList2
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
        if(Head == null || Head.next == null)
        {
            return Head;
        }
        node NewHead = Reverse(Head.next);
        node HeadNext = Head.next;
        HeadNext.next = Head;
        Head.next = null;
        return NewHead;
    }
}
