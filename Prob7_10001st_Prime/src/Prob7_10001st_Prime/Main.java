/*
This is problem 7 of Project Euler

10001st prime

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?

 */



package Prob7_10001st_Prime;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        System.out.println("The 10001st prime: " + primeNumbers() );
        Long endTime = System.currentTimeMillis();
        System.out.println("The project runtime: " + (endTime - startTime) + " ms.");

    }

    public static long primeNumbers()
    {
        long prime10001st = 0;
        long number = 2;
        long primeCount = 0;
        while(primeCount < 10001)
        {
           if(isPrime(number))
           {
               prime10001st = number;
               primeCount += 1;
           }
           number +=1;
        }
        return prime10001st;

    }
    private static boolean isPrime(long number) {
        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    /*
    Using Sieve Of Eratosthenes. We could have used seive of eratosthenes if there was an upper bound.

    public static List<Integer> primeNumbers(int n)
    {

        List<Integer> primeNumbers = new ArrayList<>();
        boolean prime[] = new boolean[n + 1];         // Array of  n+1 boolean values
        Arrays.fill(prime, true);

        for(int p=2; p*p <= n; p++)
        {
            if(prime[p])
            {
                for(int i = p*2; i <=n; i+=p)
                {
                    prime[i] = false;
                }

            }
        }
        for(int count = 0; count < n; count++ ){
            if(prime[count])
            {
                primeNumbers.add(count);
            }
        }
        return primeNumbers;

    }
    */
}
