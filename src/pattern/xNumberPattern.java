package pattern;

import java.util.Scanner;

public class xNumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 1;

        for (int i = 1; i <= (2 * n) - 1; i++) {
            for (int j = 1; j <= (2 * n) - 1; j++) {
                if (i == j || i + j == 2 * n) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }

            if (i < n) {
                c++;
            } else {
                c--;
            }

            System.out.println();
        }
    }
}

