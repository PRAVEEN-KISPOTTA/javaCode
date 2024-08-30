package codeForce;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        // Find the score of the k-th participant
        int kScore = scores[k - 1];

        // Count the number of participants who advance to the next round
        int advancers = 0;
        for (int score : scores) {
            if (score >= kScore && score > 0) {
                advancers++;
            }
        }

        // Output the result
        System.out.println(advancers);

        // Close the scanner
        scanner.close();
    }
}

