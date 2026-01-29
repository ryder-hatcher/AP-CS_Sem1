/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		//made it the string of the name specifically but would use a scanner and system in for a universal code
 String full = "Arnold Swagsaklsdfjslakfiurpqr";
        int boy = full.indexOf(" ");
        String lastName = full.substring(boy + 1);
        System.out.print("Last name: " + lastName);
    }
}

