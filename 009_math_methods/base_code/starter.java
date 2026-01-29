/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
class starter {
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your first number");
        double x = scanner.nextDouble();
        
        System.out.print("Enter your second number");
        double y = scanner.nextDouble();
        
        double max = Math.max(x, y);
        System.out.print("The maximum of " + x + " and " + y + " is" + max);
        
        double sqrtY = Math.sqrt(y);
        System.out.print("The square root of the absolute value of " + y + " is: " + sqrtY);
        
        double Result = Math.pow(x , y);
        System.out.print(x + " raised to the power of " + y + " is " + Result);
	}
}
