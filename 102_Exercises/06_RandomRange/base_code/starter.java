/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;
class starter {
	public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your starting number");
        int start = scanner.nextInt();
        
        System.out.print("Enter your max number ");
        int end = scanner.nextInt();
        
        Random random = new Random();
        int randomNumber = random.nextInt(end - start + 1) + start;
        
        System.out.println("Random number: " + randomNumber);
        }
}