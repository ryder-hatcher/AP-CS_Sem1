import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
int Length = 0, Speical = 0, both = 0;
boolean lengthMet, specialMet;
String[] specials = {"!", "@", "#", "$", "%", "^", "&", "*"};
for (int i = 0; i < pass.length(); i++) {
    lengthMet = false;
specialMet = false;
    if (passwords[i].length() >= 8) {
        Length++;
        lengthMet = true;
 }
    for (String s : specials) {
        if (passwords[i].contains(s)) {
            Speical++;
            specialMet = true;
            break;
        }
    }
    if (lengthMet && specialMet) {
        Length--;
        Speical--;
        both++;
    }
}
System.out.println("Length only: " + Length);
System.out.println("Special only: " + Speical);
System.out.println("Both: " + both);
System.out.println("no strength " + (passwords.length - s1 - s2 - s3));