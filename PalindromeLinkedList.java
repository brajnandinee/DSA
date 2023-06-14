/*to check if a singly linked list is palindrome.
&
find the middle of a given linked list.
 * T = O(N)
 * S = O(1)*/
public class PalindromeLinkedList
{
    public static void main(String[] args)
    {
        node n1 = new node(10);
        node n2 = new node(20);
        node n3 = new node(20);
        node n4 = new node(10);
        node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        System.out.print("The entered linked list is as follows: ");
        Display(head);
        System.out.print("The reversed linked list is as follows:");
        head = Reverse(head);
        Display(head);
        if(Palindrome(head) == true)
        {
            System.out.println("The entered linked list is a palindrome.");
        }
        else
        {
            System.out.println("The entered linked list is not a palindrome.");
        }
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
    static boolean Palindrome(node Head)
    {
        if(Head == null)
        {
            return true;
        }
        node MiddlePointer = Middle(Head);
        node LastPointer = Reverse(MiddlePointer);
        node CurrentPointer = Head;
        while(LastPointer != null)
        {
            if(LastPointer.data != CurrentPointer.data)
            {
                return false;
            }
            LastPointer = LastPointer.next;
            CurrentPointer = CurrentPointer.next;
        }
        return true;
    }
    static node Middle(node Head)
    {
        node SlowPointer = Head;
        node FastPointer = Head;
        while(FastPointer != null && FastPointer.next != null)
        {
            SlowPointer = SlowPointer.next;
            FastPointer = FastPointer.next.next;
        }
        return SlowPointer;
    }
}
