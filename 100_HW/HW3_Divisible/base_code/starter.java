/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the 1st number ");
        int a = input.nextInt();
        
        System.out.print("enter your 2d number ");
        int b = input.nextInt();
        
        System.out.println(a + " is " + (a % 2 == 0 ? "Even" : "Odd"));
        System.out.println(b + " is " + (b % 2 == 0 ? "Even" : "Odd"));
        
        checkDivisible(a);
        checkDivisible(b);
    }
    
    static void checkDivisible(int num) {
        if (num % 3 == 0 && num % 4 == 0 && num % 5 == 0) {
            System.out.println(num + " works for 3, 4, and 5");
        } else {
            System.out.println(num + " doesn't work for all three");
        }
    }
}