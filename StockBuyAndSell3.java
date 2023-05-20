import java.util.Scanner;

/*Best time to buy and sell stock to maximise profit
T = O(N)
S = O(1)*/
public class StockBuyAndSell3
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
        int Profit = 0, Buy = Stock[0], SellDay = 0, BuyDay = 1;
        for(int i = 1; i < n; i++)
        {
            if(Buy > Stock[i])
            {
                Buy = Stock[i];
                BuyDay = i + 1;
            }
            else if(Stock[i] - Buy > Profit)
            {
                Profit = Stock[i] - Buy;
                SellDay = i + 1;
            }
        }
        System.out.println("Thus the maximum profit possible is " + Profit + " if we buy at the " + BuyDay + "th day and sell it on the " + SellDay + "th day.");
        return 0;
    }
}
