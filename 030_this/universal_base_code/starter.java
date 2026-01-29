/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
			default: return "Happy";
		}
	}

	public static void main(String args[]) {
Random random = new Random();

PooleDwarf[] dwarfs = new PooleDwarf[7];


while(int i = 0; i < 7; i++) {
	String name = randName();
	int age = random.nextInt(100) + 1;
	dwarfs[i] = new PooleDwarf(name, age);
}

String firstName = dwarfs[0].getName();
int sameNameCount = 0;

while(int i = 1; i < 7; i++) {
	if (dwarfs[i].isSameName(firstName) == true) {
		sameNameCount = sameNameCount + 1;
	}
}

System.out.println("The first dwarf's name is: " + firstName);
System.out.println("Number of dwarfs with the same name: " + sameNameCount);

		PooleDwarf test = new PooleDwarf();
		
	}
}
