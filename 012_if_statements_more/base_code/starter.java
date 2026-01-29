/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input your first number "); 
        int x = scanner.nextInt();
    
        System.out.print("Input your second number ");
        int y = scanner.nextInt();
    
        if (x > y) {
        System.out.print(x + " is larger than " + y); }
        else if (x < y) {
        System.out.print(y + " is larger than " + x); }
        else {
        System.out.print("Your numbers are equal!");}
    }
}