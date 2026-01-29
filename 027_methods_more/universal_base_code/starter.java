/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

class starter {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;
        double money; 
        String name;
        double initial; 

        System.out.print("Welcome to the ATM! What's your name? ");
        name = scanner.nextLine();

        System.out.print("If you want to make an account select 1; if you want to check your account select 2: ");
        int selection = scanner.nextInt();
        scanner.nextLine();

        if (selection == 1) {
            System.out.print(name + ", how much do you want to deposit? ");
            initial = scanner.nextDouble();
            account = new BankAccount(name, initial);
            System.out.println("Your account information:");
            account.displayAccountInfo();
        } 
        else if (selection == 2) {
            if (account == null) {
                System.out.println("No account found. Please create one first.");
            } else {
                System.out.print("Is this your account # " + account.getAccountNumber() + " yes/no");
                String s = scanner.nextLine();
                
                if (s.equals("yes")) {
                    account.displayAccountInfo();
                } else {
                    System.out.println("Please check your account number again.");
                }
            }
        } 
        else {
            System.out.println("wrong choice. Please try again.");
        }
		
	}
}
