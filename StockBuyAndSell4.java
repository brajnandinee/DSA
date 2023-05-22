import java.util.Scanner;

/*Best time to buy and sell multiple stocks to maximize profit using Valley Peak Approach.
In this approach, we just need to find the next greater element and subtract it from the current element so that the difference keeps increasing until we reach a minimum. If the sequence is a decreasing sequence, so the maximum profit possible is 0.
T = O(N)
S = O(1)*/
public class StockBuyAndSell4
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
        int Profit = 0;
        for(int i = 1; i < n; i++)
        {
            if(Stock[i]> Stock[i - 1])
            {
                Profit += Stock[i] - Stock[i - 1];
            }
        }
        System.out.println("Thus the maximum profit possible is " + Profit);
        return 0;
    }
}