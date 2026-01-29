/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        int number = (int)(Math.random() * 1000) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        
        if (guess != number) {
            System.out.print("Guess a number between 1 and 1000 ");
            guess = scanner.nextInt();
            if (guess < number) System.out.println("Higher");
            else if (guess > number) System.out.println("Lower");
        }
        if (guess == number) {
        	System.out.print("Correct!");
        }

        }
    }