package recursionPractice;

import java.util.Scanner;

public class NumberIntoWords {
	
	public static void print(int num, String arr[]) {
		if (num == 0) {
			return;
		}
		
		int digit = num%10;
		num = num/10;
		print(num, arr);
		System.out.print(arr[digit] + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		print(num, arr);
		sc.close();

	}

}
