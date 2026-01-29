/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
   public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String answer = "Diamond";
        
        System.out.println("The goal of the game is to guess a Minecraft block with two hints!");
        System.out.println("It's a valuable block that can be used to craft tools!");
        String guess = scanner.nextLine();
        
        if (guess == (answer)) {
            System.out.println("That's right!");
        } else {
            System.out.println("Wrong! Here's a hint: It's underground!");
            guess = scanner.nextLine();
            
            if (guess == (answer)) {
                System.out.println("That's right!");
            } else {
                System.out.println("Wrong again. hint: It's the strongest ore in Minecraft!");
                guess = scanner.nextLine();
                
                if (guess == (answer)) {
                    System.out.println("That's right!");
                } else {
                    System.out.println("Sorry, you lost! The answer was Diamond.");
                }
            }
        }
    }
}