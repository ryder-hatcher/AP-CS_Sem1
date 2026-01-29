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
			Scanner sc = new Scanner(System.in);
			BaseClass test = new BaseClass();
			Random rand = new Random();
		System.out.print("How many rows do you want in the chart? ");
		int rows = sc.nextInt();
		System.out.print("How many columns do you want in the chart? ");
		int columns = sc.nextInt();
		
		int[][] users = new int[rows][columns];
		
		for (int i = 0; i < users.length; i++) {
			for (int j = 0; j < users[i].length; j++) {
				users[i][j] = rand.nextInt(10) + 1;
			}
		}
		printArray(users);
		rowAverages(users);
	}
	public static void rowAverages(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			double avg = (double) sum / arr[i].length;
			System.out.println("The row " + i + "'s average is "+ avg);	}	}
	
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");       }
			System.out.println();
		}
	}
}
