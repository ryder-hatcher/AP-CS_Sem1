/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Input your first number here. I will show you what the next 4 numbers after, x 100 and divided by 100 will all look like! ");
        int input = scanner.nextInt();
        System.out.print((input + 1) + ", " + (input + 2) + ", " + (input + 3) + ", " + (input + 4) + ", " + (input + 5));
        System.out.print((input * 1) + ", " + (input * 2) + ", " + (input * 3) + ", " + (input * 4) + ", " + (input * 5));
        System.out.print(input / 100.0);
        System.out.print(input / 10.0);
	}
}