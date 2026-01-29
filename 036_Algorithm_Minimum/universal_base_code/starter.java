/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

public class starter {
    public static void main(String[] args) {

        Random r = new Random();
        int[] a = new int[20];

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(10) + 1;
        }

        System.out.print("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int target = r.nextInt(10) + 1;
        System.out.println("Target: " + target);

        System.out.print("Found at: ");
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                System.out.print(i + " ");
                total++;
            }
        }
        System.out.println();
           System.out.println("Total: " + total);

        System.out.print("duplicates:");
         boolean found = false;

            for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                System.out.println(a[i] + " at " + i + " and " + (i + 1));
                found = true;
            }
        }
        }
    }
