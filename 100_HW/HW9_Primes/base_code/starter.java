/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
    public static boolean checkPrime(int number) {
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                return false; 
            }
            i++;
        }
        return true; 
    }
    public static void printPrimes(int maxNumber) {
        int current = 2;
        while (current < maxNumber) {
        if (checkPrime(current)) {
                System.out.print(current + " ");
            }
            current = current + 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your integer ");
        int input = scanner.nextInt();

        printPrimes(input);
    }
}