package Prob2_Even_Fibonacci_numbers;


/*
This problem finds the sum of the even-valued Fibonacci sequence whose values do not exceed four millions.
 */


public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        int fibNumber1 = 1;
        int fibNunmber2 = 2;
        int newNumber = 0;

        while(fibNunmber2 <= 4000000){

            if((fibNunmber2 % 2) == 0){
                sum += fibNunmber2;
            }

            newNumber = fibNunmber2;
            fibNunmber2 = (fibNumber1 + fibNunmber2);
            fibNumber1 = newNumber;
        }

        System.out.println( "The sum of the even-valued terms fibonacci numbers " + sum);


    }
}
