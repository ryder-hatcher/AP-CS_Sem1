import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		testHello();
		System.out.println();
		System.out.println("----------------------------");
		testAbba();
		System.out.println();
		System.out.println("----------------------------");
		testPythag();
	}

	public static void helloName(String name){
		System.out.print("Hello " + name + "!");
	}
	
	public static void makeAbba(String a, String b){
		System.out.print(a + b + b + a);
	}
	
	public static void pythag(int a, int b){

		long aSquared = (long)a * a;
		long bSquared = (long)b * b;
		long sum = aSquared + bSquared;
		long hypotenuse = (long)Math.sqrt(sum);
		System.out.println("The hypotenuse side is: " + hypotenuse);
	}
	
	
	public static void testHello(){
		helloName("Bob");
		helloName("Alice");
		helloName("X");
		helloName("");
		helloName("Omega");
		helloName("Hello");
	}
	
	public static void testAbba(){
		makeAbba("Hi", "Bye");
		System.out.println();
		makeAbba("Yo", "Ben");
		System.out.println();
		makeAbba("What", "Up");
		System.out.println();
		makeAbba("6", "7");
		System.out.println();
		makeAbba("x", "y");
		System.out.println();
		makeAbba("x", "");
		System.out.println();
		makeAbba("", "y");
		System.out.println();
		makeAbba("Ya", "Ya");
		System.out.println();
	}
	
	public static void testPythag(){
		pythag(1, 1);
		pythag(2, 3);
		pythag(100, 200);
		pythag(67, 41);
		pythag(589, 6417);
		pythag(214325728, 1242745810);
	}
}