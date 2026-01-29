/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;
class starter {
public static void main(String args[]) {
        int[] arr = new int[1001];
        int num = 0;
        
        for(int i = 0; i < arr.length; i++) {
            num += 3;
            arr[i] = num;
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= 1001) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}