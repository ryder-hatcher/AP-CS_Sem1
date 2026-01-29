/*
 *	Author:  
 *  Date: 
*/


import java.util.Scanner;
import java.util.Random;

class starter {
 
    static String sentence1 = ("The quick brown fox jumps over the lazy dog.");
    static String sentence2 = "Hello world!";
    static String sentence3 = "Java programming is fun.";
    static String sentence4 = "I love typing fast.";
    static String sentence5 = "Practice makes perfect.";
    
    static String[] sentences = {sentence1, sentence2, sentence3, sentence4, sentence5};
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Random sentence");
            System.out.println("2. Choose a sentence");
            System.out.println("3. Quit");
            System.out.print("Choose: ");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                playRandom();
            } else if (choice == 2) {
                chooseSentence();
            } else if (choice == 3) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }

    static void playRandom() {
        Random rand = new Random();
        String sentence = sentences[rand.nextInt(sentences.length)];
        System.out.println("\nType this:");
        System.out.println(sentence);
        
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();
        if (input.equals(sentence)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }

    static void chooseSentence() {
        System.out.println("\nPick a number from 1 to " + sentences.length);
        
        Scanner numScanner = new Scanner(System.in);
        int num = Integer.parseInt(numScanner.nextLine());
        if (num < 1 || num > sentences.length) {
            System.out.println("Invalid number.");
            return;
        }
        
        String sentence = sentences[num - 1];
        System.out.println("Type this:");
        System.out.println(sentence);
        
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();
        if (input.equals(sentence)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}