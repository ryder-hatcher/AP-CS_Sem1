/*
 *	Author:  
 *  Date: 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/

		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
	        Scanner sc = new Scanner(System.in);
		Random rand = new Random(); 
		System.out.print("Whats your word for the crossword? ");
		String word = sc.nextLine();
		int size = word.length() + 5;
		String[][] crossword = new String[size][size];
        int direction = rand.nextInt(3); 

		int row = rand.nextInt(size);
		int col = rand.nextInt(size - word.length());

		        if (direction == 0) {
            col = rand.nextInt(size - word.length());
            for (int i = 0; i < word.length(); i++) {
                crossword[row][col + i] = word.substring(i, i + 1);
            }
        }
        if (direction == 1) {
            row = rand.nextInt(size - word.length());
            for (int i = 0; i < word.length(); i++) {
                crossword[row + i][col] = word.substring(i, i + 1);
            }
        }
        if (direction == 2) {
            row = rand.nextInt(size - word.length());
            col = rand.nextInt(size - word.length());
            for (int i = 0; i < word.length(); i++) {
                crossword[row + i][col + i] = word.substring(i, i + 1);
            }
        }

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(crossword[i][j] + " ");
			}
			System.out.println();
		}
	}
}