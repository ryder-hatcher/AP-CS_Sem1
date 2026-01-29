/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);	
		    System.out.print("Whats your name? ");
			String name = scanner.next();
			System.out.print("How many times do you want it to be printed? ");
			  int times = scanner.nextInt();
        
        int count = 0;
        while(count < times) {
            System.out.System.out.println();            (name);
            count = count + 1;
        }
    }
}