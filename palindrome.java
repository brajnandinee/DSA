import java.util.Scanner;

//Palindrome number
public class palindrome
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        palin(n);
        s.close();
    }
    static int palin(int n)
    {
        int i, num = n, rev = 0;
        while(n > 0)
        {
            i = n%10;
            rev = rev*10 + i;
            n = n/10;
        }
        if(num == rev)
        {
            System.out.println(num + " is a palindrome number.");
        }
        else
        {
            System.out.println(num + " is not a palindrome number.");
        }
        return 0;
    }
}