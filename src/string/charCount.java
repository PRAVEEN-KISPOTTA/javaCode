package string;

import java.util.Scanner;
public class charCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the number of words
        
        for (int i = 0; i < n; i++) {
            String word = sc.next(); // Read each word
            if (word.length() > 10) {
                String abbreviation = word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.println(abbreviation);
            } else {
                System.out.println(word);
            }
        }
    }
}
