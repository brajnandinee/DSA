import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Count the distinct elements in every window of size k using Hashing
T = O(N)
S = O(k)*/
public class hashing9
{
    public static void main(String[] args)
    {
        System.out.println("How many integers do you want to enter"/* in the first array?"*/);
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []a = new int [n];
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
        System.out.println("Enter the size of the window you are looking for");
        int windowSize = s.nextInt();
        System.out.print("Thus, the number of distinct elements in every window of size " + windowSize + "are as follows:");
        Window(a, windowSize);
        s.close();
    }
    static void Window(int a[], int windowSize)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < windowSize; i++)
        {
            map.put(a[i], map.getOrDefault(a[i], 0));
            /*map.getOrDefault(key, defaultValue) returns the value of the key if it is present in the map or returns the mentioned defaultValue if it is not present*/
        }
        System.out.print("      " + map.size());
        for(int i = windowSize; i < a.length; i++)
        {
            if(map.get(a[i - windowSize]) == 1)
            {
                map.remove(a[i - windowSize]);
            }
            else
            {
                map.put(a[i - windowSize], map.get(a[i - windowSize]) - 1);
                map.put(a[i], map.getOrDefault(a[i], 0) + 1);
                System.out.print("      " + map.size());
            }
        }
        System.out.println();
    }
}