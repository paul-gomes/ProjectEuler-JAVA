package Prog_Smallest_Multiple;


/*
Problem 5

Smallest multiple

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
what is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

 */


public class Main {

    public static void main(String[] args) {

        //I increase the count by 2 beacuse it will be a even number as only even numbers are divisible by 2

        long startTime = System.currentTimeMillis();

        long count = 20;
        while(!evenlyDivisibleBy1To20(count))
        {
            count += 2;
        }

        if(evenlyDivisibleBy1To20(count))
        {
            System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20: " + count);

        }
        else
        {
            System.out.println("Nothing found!!!");
        }

        long endTime = System.currentTimeMillis();
        System.out.println("The project takes: " + (endTime - startTime) + " ms");
    }


    public static boolean evenlyDivisibleBy1To20(long number)
    {
        for(int i = 2; i <= 20; i++)
        {
            if(number % i != 0)
            {
                return false;
            }
        }
        return true;
    }
}

