package Prob1_Multiples_of_3_and_5;


/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("sum of all the multiples of 3 or 5 below 1000: " + (multipleOf3Or5()));
    }

    public static int multipleOf3Or5(){
        int number = 3;
        int sumOfAll = 0;

        while(number < 1000) {                                                       //Continues the loop untill the number is 1000
            if ((number % 3 == 0) || (number % 5 == 0)) {                            //Checks if the remainder is 0, if it is then adds the number
                sumOfAll += number;

            }
            number++;
        }
        return sumOfAll;
    }
}
