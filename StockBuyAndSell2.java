import java.util.Scanner;

/*Best time to buy and sell stock to maximise profit using space
T = O(N)
S = O(N)*/
public class StockBuyAndSell2
{
    public static void main(String[] args)
    {
        System.out.println("How many stock prices do you want to enter?");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] Stock = new int [n];
        System.out.println("Enter an array of " + n + " stock prices");
        for(int i = 0; i < n; i++)
        {
            Stock[i] = s.nextInt();
        }
        System.out.print("The entered array of stock prices is as follows:");
        for(int i = 0; i < n; i++)
        {
            System.out.print("      " + Stock[i]);
        }
        System.out.println();
        MaxProfit(Stock, n);
        s.close();
    }
    static int MaxProfit(int Stock[], int n)
    {
        int [] a = new int [n];
        int max = 0;
        for(int i = (n - 1); i >= 0; i--)
        {
            a[i] = Math.max(max, Stock[i]);
            max = a[i];
        }
        max = 0;
        for(int i = 0; i < n; i++)
        {
            if(a[i] - Stock[i] > max)
            {
                max = a[i] - Stock[i];
            }
        }
        System.out.println("Thus the maximum profit possible is " + max);
        return 0;
    }
}
