package Prob3_Largest_Prime_Factor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter an integer to find the largest prime factor: " );
        long number = userInput.nextLong();
        List<Long> primeFactorList = primeFactors(number);
        System.out.print("Largest prime factor: " + primeFactorList.get(primeFactorList.size() -1));


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
