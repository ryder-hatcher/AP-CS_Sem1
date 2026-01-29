/*
   * Author:
   * Date:
   * Collaborator(s):
*/

		class starter {
    public static void main(String args[]) {
        String sentence ="Im pretty good at rocket leauge";
        String[] Vowel ={"a","e","i","o","u"};
        String givesBack = " ";

        int start = 0;

        for (int i = 0; i <= sentence.length(); i++) {
            if (i == sentence.length() || sentence.charAt(i) == ' ') {
                String word = sentence.substring(start, i);
                String pig = " ";

                boolean IsaVowel = false;
                for (int v = 0; v < vowels.length; v++) {
                    if (word.substring(0,1).equals(vowels[v])) {
                    IsaVowel = true;
                   break;
                    }
                }
                if (IsaVowel) {
                    pig = word + "Way";
                } else {
                    boolean Is2aVowel = false;
                    if (word.length() > 1) {
                        for (int v = 0; v < vowels.length; v++) {
                            if (word.substring(1,2).equals(vowels[v])) {
                                Is2aVowel = true;
                        break;
                            }
                        }
                    }
                    if (Is2aVowel) {
                        pig = word.substring(1) + word.substring(0,1) + "ay ";
                    } else if (word.length() > 2) {
                        pig = word.substring(2) + word.substring(0,2) + "ay ";
                    } else {
                        pig = word.substring(1) + word.substring(0,1) +

	}
  }
 }