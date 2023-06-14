public class LinkedList
{
/*HEAD---->[DATA][NEXT]---->[DATA][NEXT]---->[DATA][NEXT]---->NULL
                 ^                ^                ^
                 |                |                |
                 |                |                |
                 |                |                |
                NODE             NODE             NODE
 */
    public static void main(String[] args)
    {
        node n1 = new node(10);
        node n2 = new node(20);
        node n3 = new node(40);
        node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;
        Traverse(head);
        Insert(30, head, 3);
        Display(head);
        Delete(head, 2);
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
/*Traverse a linked list.
 * T = O(N)
 * S = O(1)*/
    static void Traverse(node Head)
    {
        node Current = Head;
        while(Current != null)
        {
            System.out.println(Current.data);
            Current = Current.next;
        }
    }
/*Insert a new element in a linked list.
 * T = O(N)
 * S = O(1)*/
    static void Insert(int x, node Head, int Position)
    {
        Position = Position - 1;
        node toAdd = new node(x);
        if(Position == 0)
        {
            toAdd.next = Head;
            Head = toAdd;
            return;
        }
        node Previous = Head;
        for(int i = 0; i < Position - 1; i++)
        {
            Previous = Previous.next;
        }
        toAdd.next = Previous.next;
        Previous.next = toAdd; 
    }
/*Delete an element from a linked list.
 * T = O(N)
 * S = O(1)*/
    static void Delete(node Head, int Position)
    {
        Position = Position - 1;
        if(Position == 0)
        {
            Head = Head.next;
            return;
        }
        node Previous = Head;
        for(int i = 0; i < Position - 1; i++)
        {
            Previous = Previous.next;
        }
        Previous.next = Previous.next.next; 
    }
    static void Display(node Head)
    {
        node Temporary = Head;
        while(Temporary != null)
        {
            System.out.print(Temporary.data + "      ");
            Temporary = Temporary.next;
        }
        System.out.println();
    }
}