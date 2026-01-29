/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a phrase to reverse the order ");
		String phrase = input.nextLine();
		System.out.println("Original phrase is this: " + phrase);
		String reverse = " ";
		
		while (phrase.indexOf(" ") != -1) {
			int space = phrase.indexOf(" ");
			String word = phrase.substring(0, space);
			phrase = phrase.substring(space + 1);
			reverse = word + " " + reverse;
		}
		reverse = phrase + " " + reverse;
		System.out.print(reverse);
	}
}