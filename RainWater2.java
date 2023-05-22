import java.util.Scanner;

/*Rainwater trapping problem using constant space
T = O(N)
S = O(1)*/
public class RainWater2
{
public static void main(String[] args)
    {
        System.out.println("How many block heights do you want to enter?");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] a = new int [n];
        System.out.println("Enter an array of " + n + " block heights");
        for(int i= 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("The entered array of block heights is as follows:");
        for(int i = 0; i < n; i++)
        {
            System.out.print("      " + a[i]);
        }
        System.out.println();
        System.out.println("The total units of water trapped = " + Trapping(a, n));
        s.close();
    }
    static int Trapping(int a[], int n)
    {
        int left = 0, right = n - 1, unit = 0;
        int MaxLeft = a[left], MaxRight = a[right];
        while(left < right)
        {
            if(a[left] < a[right])
            {
                left++;
                MaxLeft = Math.max(MaxLeft, a[left]);
                unit += MaxLeft - a[left];
            }
            else
            {
                right--;
                MaxRight = Math.max(MaxRight, a[right]);
                unit += MaxRight - a[right];
            }
        }
        return unit;
    }
}




