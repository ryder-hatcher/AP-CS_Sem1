/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
		System.out.print("whats your name? "); 
		 String name = scanner.next();
		System.out.print("What class are you? You can be whatever you like! ");
		String role = scanner.next();
		System.out.print("You have 20 skill points to spend in the following: Strength, Perception, Intelligence, and Charisma. Spend them wisely." );
		int points = 20;
		System.out.print("Strength: ");
		int strenghth = scanner.nextInt();
		int total =  points - strenghth;
		if( strenghth > total){
		System.out.print("You dont have that many points! ");
		}
		System.out.print(" This is how many points you have: " +  total);
		System.out.print(" Perception: ");
		int perception = scanner.nextInt();
		total -= perception;
		if( perception > total){
		System.out.print("You dont have that many points! ");
		}
		System.out.print(" This is how many points you have: " +  total);
		System.out.print(" Intelligence: ");
		int Intelligence = scanner.nextInt();
		total -= Intelligence;
		if( Intelligence > total){
		System.out.print("You dont have that many points! ");
		}
		System.out.print(" This is how many points you have: " +  total);
		System.out.print("Charisma");
		int Charisma = scanner.nextInt();
		total -= Charisma;
		if( Charisma > total){
		System.out.print("You dont have that many points! ");
		System.out.print("-------------------");
		System.out.print("You are " + name + "and your role is " + role);
		System.out.print("Your strength is " + strenghth);
		System.out.print("Your perception is " + perception);
			System.out.print("Your Intelligence is " + Intelligence);
				System.out.print("Your Charisma is " + Charisma );
		}
	}
}
