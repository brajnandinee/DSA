import java.util.Scanner;

/*Rainwater trapping problem using space
T = O(N)
S = O(N)*/
public class RainWater1
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
        int left[] = new int [n];
        left[0] = a[0];
        for(int i = 1; i < n; i++)
        {
            left[i] = Math.max(left[i -1], a[i]);
        }
        int right[] = new int [n];
        right[n - 1] = a[n - 1];
        for(int i = n -2; i>= 0; i--)
        {
            right[i] = Math.max(right[i+ 1], a[i]);
        }
        int unit = 0;
        for(int i = 0; i < n; i++)
        {
            unit += Math.min(left[i], right[i]) - a[i];
        }
        return unit;
    }
}



