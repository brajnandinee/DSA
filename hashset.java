import java.util.*;

/*add()      : inserts a new element and overwrites on existing element
contains()   : checks if an element is present(boolean function)
remove()     : deletes an element
isEmpty()    : checks if the set is empty(boolean function)
size()       : gives out the no. of elements present in the set(cardinality of the set)
clear()      : removes all the elements from the set*/
class hashset
{
    public static void main(String[] args)
    {
        HashSet<Integer> s = new HashSet<>();//you can mention the size of the set
        //HashSet<Integer> s = new HashSet<>(100);
        s.add(5);
        s.add(10);
        System.out.println(s);//prints all the elements of the set in a random order
        if(s.contains(10))
        {
            System.out.println("Element is present.");
        }
        else
        {
            System.out.println("Element is not present.");
        }
        
        s.remove(10);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.clear();
    }
}
/*OUTPUT
[5, 10]
Element is present.
false
1*/