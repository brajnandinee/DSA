/*Merge two sorted Array of integers of lengths M and N
 * T = O(M+N)
 * S = O(1)*/

import java.util.Scanner;

class Merge 
{
    public static void main(String[] args)
    {
        System.out.println("How many integers do you want to enter in the first array?");
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        System.out.println("How many integers do you want to enter in the first array?");
        int n = s.nextInt();
        int [] nums1 = new int [m + n];
        int [] nums2 = new int [m + n];
        System.out.println("Enter the array of " + m + " integers");
        for(int i= 0; i < m; i++)
        {
            nums1[i] = s.nextInt();
        }
        System.out.println("Enter the array of " + n + " integers");
        for(int i= 0; i < n; i++)
        {
            nums2[i] = s.nextInt();
        }
        System.out.print("The entered array of " + m + " integers is as follows:");
        Display(nums1, m);
        System.out.print("The entered array of " + n + " integers is as follows:");
        Display(nums2, n);
        Merges(nums1, m, nums2, n);
        System.out.print("The merge of the two sorted  arrays is as follows:");
        Display(nums1, (m + n));
        s.close();
    }
    static void Display(int[] array, int length)
    {
        for(int i = 0; i < length; i++)
        {
            System.out.print("      " + array[i]);
        }
        System.out.println();
    }
    static void Merges(int[] nums1, int m, int[] nums2, int n)
    {
        int FirstPointer = (m - 1), SecondPointer = (n - 1), k = (m + n - 1);
        while(FirstPointer >= 0 && SecondPointer >= 0)
        {
            if(nums1[FirstPointer] >= nums2[SecondPointer])
            {
                nums1[k] = nums1[FirstPointer];
                FirstPointer--;
            }
            else
            {
                nums1[k] = nums2[SecondPointer];
                SecondPointer--;
            }
            k--;
        }
        while(FirstPointer >= 0)
        {
            nums1[k] = nums1[FirstPointer];
            FirstPointer--;
            k--;
        }
        while(SecondPointer >= 0)
        {
            nums1[k] = nums2[SecondPointer];
            SecondPointer--;
            k--;
        }
    }
}