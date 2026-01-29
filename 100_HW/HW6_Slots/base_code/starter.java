/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
      int money = 100;
        
       System.out.println("Welcome to slots");
        System.out.println("You start with " + money);
        
        while (money > 0) {
           System.out.print("Qould you like to play? yes or no");
            String choice = scanner.nextLine();
            
            if (choice.equals("no") || choice.equals("no")) {
                break;
            }
            if (!choice.equals("yes") && !choice.equals("yes")) {
                continue;
            }
            
            System.out.print("Enter money you have " + money );
            int wager = scanner.nextInt();
            
            if (wager <= 0 || wager > money) {
                System.out.println("Invalid wager");
                continue;
            }
            
            int num1 = random.nextInt(6) + 1;
            int num2 = random.nextInt(6) + 1;
            int num3 = random.nextInt(6) + 1;
            
            System.out.print(" " + num1 + "  " + num2 + "  " + num3 + " ");
            
            if (num1 == num2 && num2 == num3) {
                int win = wager * 3;
                money += win;
                System.out.print("JACKPOT $" + win);
            } else if (num1 == num2 || num1 == num3 || num2 == num3) {
                int win = wager * 2;
                money += win;
                System.out.println("Two matches $" + win);
            } else {
                money -= wager;
                System.out.println("No matches $" + wager);
            }
            System.out.println("Your final amount is $" + money);
        }
    }
}
