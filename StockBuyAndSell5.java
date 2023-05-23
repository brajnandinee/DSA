import java.util.Scanner;
import java.util.ArrayList;

/*Best time to buy and sell multiple stocks to maximize profit using local maximum and local minimum.
T = O(N)
S = O(1)*/
class Interval
{
    int BuyDay, SellDay;
}
public class StockBuyAndSell5
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
        // Prices must be given for at least two days
        if(n == 1)
            {
                return 0;
            }
        int count = 0;
        // solution array
        ArrayList<Interval> sol = new ArrayList<Interval>();
        // Traverse through given price array
        int i = 0;
        while (i < (n - 1))
        {
            // Find Local Minima. Note that the limit is (n-2) as we are comparing present element to the next element.
            while ((i < n - 1) && (Stock[i + 1] <= Stock[i]))
            {
                i++;
            }
            // If we reached the end, break as no further solution possible
            if(i == n - 1)
            {
                break;
            }
            Interval e = new Interval();
            e.BuyDay = i++;
            // Store the index of minima
            // Find Local Maxima.  Note that the limit is (n-1) as we are comparing to previous element
            while ((i < n) && (Stock[i] >= Stock[i - 1]))
            {
                i++;
            }
            // Store the index of maxima
            e.SellDay = i - 1;
            sol.add(e);
            // Increment number of buy/sell
            count++;
        }
        // print solution
        int Profit = 0;
        if(count == 0)
        {
            System.out.println("There is no day when buying the stock " + "will make profit");
        }
        else
        {
            for (int j = 0; j < count; j++)
            {
                System.out.println("Buy on day: " + (sol.get(j).BuyDay + 1) + "        " + "Sell on day : " + (sol.get(j).SellDay + 1) + "        " + " at the profit of " + (Stock[sol.get(j).SellDay] - Stock[sol.get(j).BuyDay]));
                Profit += Stock[sol.get(j).SellDay] - Stock[sol.get(j).BuyDay];
            }
        }
        System.out.println("Thus the maximum profit possible is " + Profit);
        return 0;
    }
}

