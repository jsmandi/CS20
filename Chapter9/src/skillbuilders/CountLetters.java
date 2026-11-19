package skillbuilders;
import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] letterCounts = new int[26];
        Scanner userinput = new Scanner(System.in);


        System.out.print("Enter a phrase: ");
        String phrase = userinput.nextLine().toUpperCase();


        for (char ch : phrase.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCounts[ch - 'A']++;
            }
        }

     
        for (int i = 0; i < 26; i++) {
            System.out.println((char) ('A' + i) + ": " + letterCounts[i]);
        }

        userinput.close();
    }
}
