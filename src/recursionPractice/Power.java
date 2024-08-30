package recursionPractice;

import java.util.Scanner;

public class Power {
	
	public static int power(int num) {
		if (num == 0) {
			return 1;
		}
		int smallerProblem = power(num - 1);
		int biggerProblem = 2 * smallerProblem;
		return biggerProblem;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of power: ");
		int num = sc.nextInt();
		int result = power(num);
		System.out.println(result);
		sc.close();

	}

}
