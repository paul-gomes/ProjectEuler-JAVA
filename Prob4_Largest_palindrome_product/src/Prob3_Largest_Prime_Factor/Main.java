package Prob3_Largest_Prime_Factor;


/*
This is a project euler problem 4
Largest palindrome product

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */


public class Main {

    public static void main(String[] args) {
	// write your code here

        long start = System.currentTimeMillis();
        System.out.println("The largest palindrome made from the product of two 3-digit numbers: " + largestPalindrome());

        long end = System.currentTimeMillis();
        System.out.println("This project takes: " + (end - start) + " ms");

    }

    public static long largestPalindrome()
    {
        long largestPalin = 0;
        for (int i = 999; i > 99; i-- )
        {
            for(int j = 999; j > 99; j--)
            {
                if( (ifPalindrome((i*j)) && ((i*j) > largestPalin)))
                {
                    largestPalin = (i*j);
                }

            }
        }
        return largestPalin;
    }

    public static boolean ifPalindrome(long num)
    {
        StringBuilder numString = new StringBuilder();
        numString.append(num);
        if( numString.toString().equals((numString.reverse()).toString()))
        {
            return true;
        }
        return false;
    }
}
