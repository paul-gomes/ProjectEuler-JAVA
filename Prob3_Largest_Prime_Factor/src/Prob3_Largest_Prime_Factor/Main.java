package Prob3_Largest_Prime_Factor;
/*
This is problem 3 of Project Euler

The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
 */


/*
 *Prime number is any number that is only divisible by 1 and itself
 * To find the prime factorization, we need to break the number to its prime factors
 * "Factors" are the numbers you multiply together to get another number
 * Can we divide 147 exactly by 2?
 * 147 ÷ 2 = 73½
 * No it can't. The answer should be a whole number, and 73½ is not.
 * Let's try the next prime number, 3:
 * 147 ÷ 3 = 49
 * That worked, now we try factoring 49, and find that 7 is the smallest prime number that works:
 * 49 ÷ 7 = 7
 * And that is as far as we need to go, because all the factors are prime numbers.
 * 147 = 3 × 7 × 7
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();                                                                        // Records start time


        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter an integer to find the largest prime factor: " );
        long number = userInput.nextLong();
        List<Long> primeFactorList = primeFactors(number);
        System.out.print("Largest prime factor: " + primeFactorList.get(primeFactorList.size() -1));


        System.out.println();
        long end = System.currentTimeMillis();                                                                          //Records end time
        System.out.println("This project takes: " + (end - start) + "ms");                                              //Calculates running time


    }


    public static List<Long> primeFactors(long numbers) {
        long n = numbers;
        List<Long> factors = new ArrayList<Long>();
        for (long i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
}
