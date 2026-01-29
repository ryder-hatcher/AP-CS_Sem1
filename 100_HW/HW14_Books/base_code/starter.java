/*
 * Author:
 *  Date:
 */

import java.util.*;
import java.io.*;

class starter {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the file name of one of the text files in the 'books' folder: (Ex: test.txt)");
        String textFile = sc.nextLine(); // Must exist in 'books' folder
        String[] arr = fillArray(textFile); // Fills array with each word of file
        System.out.println();

        // Menu loop
        while (true) {
            System.out.println("What action would you like to take?");
            System.out.println("1. Check text file (file)");
            System.out.println("2. Print the text given (print)");
            System.out.println("3. Print the text backwards (printBack)");
            System.out.println("4. Print a certain number of words (printNum)");
            System.out.println("5. Change the text file (change)");
            System.out.println("6. Check the number of words in a text (check)");
            System.out.println("7. Most common word (common)");
            String choice = sc.nextLine();
            System.out.println();

            if (choice.equals("file")) System.out.println(textFile);
            if (choice.equals("print")) printsArray(arr);
            if (choice.equals("printBack")) printsArrayBack(arr);

            if (choice.equals("printNum")) {
                System.out.println("How many words of the text would you like to print?");
                int choiceInt = sc.nextInt();
                sc.nextLine();
                printsNumber(arr, choiceInt);
            }

            if (choice.equals("check")) {
                System.out.println("What word/phrase would you like to check?");
                choice = sc.nextLine();
                System.out.println(checksArray(arr, choice));
            }

            if (choice.equals("common")) System.out.println(mostCommon(arr));
        }
    }

    /* Prints the entire array */
    public static void printsArray(String[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    /* Prints array backwards */
    public static void printsArrayBack(String[] arr) {
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }

    /* Prints first num words */
    public static void printsNumber(String[] arr, int num) {
        if (num > arr.length) {
            System.out.println("Number too large—try again.");
            return;
        }
        for (int i = 0; i < num; i++)
            System.out.print(arr[i] + " ");
    }

    /* Counts occurrences of a given string */
    public static int checksArray(String[] arr, String check) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(check)) count++;
        }
        return count;
    }

    /* Finds the most common word */
    public static String mostCommon(String[] arr) {
        int count = 0;
        String word = "";
        for (int i = 0; i < arr.length; i++) {
            int occurrences = checksArray(arr, arr[i]);
            if (occurrences > count) {
                count = occurrences;
                word = arr[i];
            }
        }
        return word;
    }

    /* Reads all words from a file into an array */
    public static String[] fillArray(String arg) throws FileNotFoundException {
        File text = new File("./books/" + arg);
        Scanner sc = new Scanner(text);

        int lineNumber = 0;
        while (sc.hasNext()) {
            sc.next();
            lineNumber++;
        }

        String[] arr = new String[lineNumber];
        sc = new Scanner(text);

        for (int i = 0; i < lineNumber; i++) {
            arr[i] = sc.next();
        }

        return arr;
    }
}
