/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public class BaseClass {
    int example = 0;

    public BaseClass() {
        String[] lyrics = new String[10];
        lyrics[0] = "You know the love was X-rated, it's how we made it";
        lyrics[1] = "Drinkin' help balance the patience, watch how you take it";
        lyrics[2] = "Can't keep no bitches, it's too dangerous, I been X-rated";
        lyrics[3] = "Took everything up for the takin', I couldn't save it";
        lyrics[4] = "See red and blues, I hit the pavement, got love, got vacant";
        lyrics[5] = "She needed angles, I need angels, I'm fightin' Satan";
        lyrics[6] = "Leave me faded, I feel painless, I go out gracious";
        lyrics[7] = "I'm tryna feel a shade of greatness by celebratin'";
        lyrics[8] = "Bring entertainment, goin' brainless, like goin' dumb on my hiatus";
        lyrics[9] = "She fall more in love every time that I tip, I fade away every time that I";
        
        for (int i = 0; i < lyrics.length; i++) {
            System.out.println((i + 1) + ". " + lyrics[i]);
        }
    }
    
    public static void main(String[] args) {
        new BaseClass();
    }
}