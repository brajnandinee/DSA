import java.util.HashMap;
import java.util.Scanner;

/*to find the subarray with given sum using Hashing
T = O(N)
S = O(N)*/
public class hashing7
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
        System.out.println("Enter the sum you are looking for");
        int sum = s.nextInt();
        SubArray(a, sum);
        s.close();
    }
    static void SubArray(int a[], int sum)
    {
        int CurrentSum = 0, StartIndex = 0, EndIndex = (-1);
        HashMap<Integer/*Key*/, Integer/*Value*/> map = new HashMap<>();
        for(int i = 0; i < a.length; i++)
        {
            CurrentSum += a[i];
            if(CurrentSum - sum == 0)
            {
                StartIndex = 0;
                EndIndex = i;
                break;
            }
            if(map.containsKey(CurrentSum - sum))
            {
                StartIndex = map.get(CurrentSum - sum)/*gives out the value of the key(= CurrentSum - sum) from the map*/ + 1;
                EndIndex = i;
                break;
            }
            map.put(CurrentSum/*Key*/, i/*Value*/);/*inserts the key and the value in the map*/
        }
        if(EndIndex == -1)
        {
            System.out.println("Subarray with the sum "+ sum +" is not found");
        }
        else
        {
            System.out.println("Subarray with the sum "+ sum +" is found from the index " + (StartIndex + 1) + " upto " + (EndIndex + 1));
            for(int i = StartIndex; i < EndIndex + 1; i++)
            {
                System.out.print(a[i]);
                if(i == EndIndex)
                {
                    System.out.println("    =   " + sum);
                }
                else
                {
                    System.out.print("    +   ");
                }
            }
        }
    }
}