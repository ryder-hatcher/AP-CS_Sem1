/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;
import java.util.Random;

public class starter {

    public static String getObject() {
        Random rand = new Random();
        int choice = rand.nextInt(3);

        if (choice == 0) {
            return "rock";
        } else if (choice == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static int compare2(String p1, String p2) {
        if (p1.equals(p2)) {
            return 0;
        } else if ((p1.equals("rock") && p2.equals("scissors")) ||
                   (p1.equals("paper") && p2.equals("rock")) ||
                   (p1.equals("scissors") && p2.equals("paper"))) {
            return 1; 
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain = " "; 
        while (true) {
            System.out.println("Would you like to play? (yes/no/done)");
            playAgain = scan.nextLine().toLowerCase();

            if (playAgain.equals("yes")) {
                String playerChoice = "";
                while (true) {
                    System.out.println("Enter rock, paper, or scissors:");
                    playerChoice = scan.nextLine().toLowerCase();

                    if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {
                        break;
                    } else {
                        System.out.println("Invalid input. Please type rock, paper, or scissors.");
                    }
                }
                  String computerChoice = getObject();
                System.out.println("Computer chose: " + computerChoice);
                int result = compare2(playerChoice, computerChoice);
                   if (result == 0) {
                    System.out.println("It's a tie!");
                } else if (result == 1) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer wins!");
                }

            } else if (playAgain.equals("no")) {
                System.out.println("How many times should the computer play ?");
                int times = scan.nextInt();
                scan.nextLine();
                int p1Wins = 0;
                int p2Wins = 0;
                int ties = 0;
                for (int i = 0; i < times; i++) {
                    String p1 = getObject();
                    String p2 = getObject();
                    int result = compare2(p1, p2);
                    if (result == 0) {
                        ties++;
                    } else if (result == 1) {
                        p1Wins++;
                    } else {
                        p2Wins++;
                    }
                }

                System.out.println("Computer vs Computer Results:");
                System.out.println("Player 1 wins: " + p1Wins);
                System.out.println("Player 2 wins: " + p2Wins);
                System.out.println("Ties: " + ties);

            } else if (playAgain.equals("done")) {
                System.out.println("Thanks for playing");
                break;
            } else {
                System.out.println("Please enter yes, no, or done.");
            }
        }
    }
}