/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
public static void main(String[] args) {

        Random r = new Random();
        int[] a = new int[20];

 
        for (int i = 0; i < 20; i++) {
            a[i] = r.nextInt(10) + 1;
        }
        System.out.print("Array: ");
        for (int n : a) System.out.print(n + " ");
        System.out.println();


        int target = r.nextInt(10) + 1;
        System.out.println("Target: " + target);


        System.out.print("Target found at: ");
        int total = 0;
        for (int i = 0; i < 20; i++) {
            if (a[i] == target) {
                System.out.print(i + " ");
                total++;
            }
        }
        System.out.println("Total: " + total);
        System.out.println("Consecutive duplicates:");
        boolean found = false;

        for (int i = 0; i < 19; i++) {
            if (a[i] == a[i + 1]) {
                System.out.println(a[i] + " at " + i + " and " + (i + 1));
                found = true;
            }
        }
}
}