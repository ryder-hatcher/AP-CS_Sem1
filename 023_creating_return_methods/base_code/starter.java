/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {

    public static int pow(int base, int exponent) {
        int result = 1;
        int count = 0;

        while (count < exponent) {
            result *= base;
            count++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st integer ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent ");
        int exponent = scanner.nextInt();

        if (exponent < 0) {
            System.out.print("Exponent must be a positive integer.");
        } else {
            int result = pow(base, exponent);
            System.out.print(base + " raised to the power of " + exponent + " is " + result);
        }

        scanner.close();
    }
}
